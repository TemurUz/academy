package uz.jurayev.eazybank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.eazybank.data.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByEmail(String email);
}
