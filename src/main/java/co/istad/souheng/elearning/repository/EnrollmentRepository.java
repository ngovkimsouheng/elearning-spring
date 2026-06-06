package co.istad.souheng.elearning.repository;

import co.istad.souheng.elearning.domain.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment,Integer> {
}
