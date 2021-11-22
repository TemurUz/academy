package uz.jurayev.eazybank.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uz.jurayev.eazybank.data.Customer;
import uz.jurayev.eazybank.repo.CustomerRepository;

import java.util.List;

//@Service
//public class UserDetailServiceImpl implements UserDetailsService {
//
//    private final CustomerRepository customerRepository;
//
//    public UserDetailServiceImpl(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        List<Customer> customer = customerRepository.findByEmail(email);
//        if (customer.size() == 0){
//            throw new UsernameNotFoundException("User details not found for user: " + email);
//        }
//        return new CustomerSecurity(customer.get(0));
//    }
//}
