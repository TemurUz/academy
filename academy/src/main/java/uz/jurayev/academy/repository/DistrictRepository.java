package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.District;

public interface DistrictRepository extends JpaRepository<District, Long> {
}