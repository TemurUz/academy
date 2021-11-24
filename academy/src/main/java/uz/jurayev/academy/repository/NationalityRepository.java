package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Nationality;

public interface NationalityRepository extends JpaRepository<Nationality, Long> {
}