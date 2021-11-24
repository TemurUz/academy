package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.CreativePotential;

public interface CreativePotentialRepository extends JpaRepository<CreativePotential, Long> {
}