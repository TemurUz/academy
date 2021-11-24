package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}