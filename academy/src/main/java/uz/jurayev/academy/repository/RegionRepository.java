package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {
}