package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Relative;

public interface RelativeRepository extends JpaRepository<Relative, Long> {
}