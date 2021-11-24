package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Direction;

public interface DirectionRepository extends JpaRepository<Direction, Long> {
}