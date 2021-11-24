package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.LostBreadwinner;

public interface LostBreadwinnerRepository extends JpaRepository<LostBreadwinner, Long> {
}