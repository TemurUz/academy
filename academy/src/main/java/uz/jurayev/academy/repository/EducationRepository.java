package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {
}