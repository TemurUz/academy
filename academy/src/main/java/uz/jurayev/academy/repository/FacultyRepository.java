package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}