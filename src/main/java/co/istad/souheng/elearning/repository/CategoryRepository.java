package co.istad.souheng.elearning.repository;

import co.istad.souheng.elearning.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category ,Integer> {
}
