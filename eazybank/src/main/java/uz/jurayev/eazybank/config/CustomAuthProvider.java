package uz.jurayev.eazybank.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import uz.jurayev.eazybank.data.Customer;
import uz.jurayev.eazybank.repo.CustomerRepository;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//This is CustomAuthenticationProvider is equals to UserDetailsService

@Component
public class CustomAuthProvider implements AuthenticationProvider {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    public CustomAuthProvider(CustomerRepository customerRepository, PasswordEncoder passwordEncoder) {
        this.customerRepository = customerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
       String username = authentication.getName();
       String password = authentication.getCredentials().toString();
        List<Customer> customers = customerRepository.findByEmail(username);
        if (customers.size() > 0){
            if (passwordEncoder.matches(password, customers.get(0).getPassword())){
                Set<GrantedAuthority> authorities = new HashSet<>();
                authorities.add(new SimpleGrantedAuthority(customers.get(0).getRole()));
                return new UsernamePasswordAuthenticationToken(username, password, authorities);
            } else {
                throw new BadCredentialsException("Invalid username or password!");
            }
        } else {
            throw new BadCredentialsException("No user registered with this details!");
        }
    }

    @Override
    public boolean supports(Class<?> authenticationType) {
        return authenticationType.equals(UsernamePasswordAuthenticationToken.class);
    }
}
