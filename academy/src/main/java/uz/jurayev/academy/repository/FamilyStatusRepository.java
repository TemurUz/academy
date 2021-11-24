package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.FamilyStatus;

public interface FamilyStatusRepository extends JpaRepository<FamilyStatus, Long> {
}