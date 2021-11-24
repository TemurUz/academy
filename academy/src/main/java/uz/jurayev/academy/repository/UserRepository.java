package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}