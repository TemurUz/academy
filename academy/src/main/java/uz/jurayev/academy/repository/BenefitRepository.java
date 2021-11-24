package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Benefit;

public interface BenefitRepository extends JpaRepository<Benefit, Long> {
}