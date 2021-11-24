package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.FamilyCondition;

public interface FamilyConditionRepository extends JpaRepository<FamilyCondition, Long> {
}