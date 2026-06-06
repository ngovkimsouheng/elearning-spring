package co.istad.souheng.elearning.repository;

import co.istad.souheng.elearning.domain.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentProfile,Integer> {
}
