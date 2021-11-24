package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Gender;

public interface GenderRepository extends JpaRepository<Gender, Long> {
}