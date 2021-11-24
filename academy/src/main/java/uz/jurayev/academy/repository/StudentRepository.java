package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}