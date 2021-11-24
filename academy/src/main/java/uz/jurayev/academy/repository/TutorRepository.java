package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
}