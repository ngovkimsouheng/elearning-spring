package co.istad.souheng.elearning.repository;

import co.istad.souheng.elearning.domain.InstructorProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<InstructorProfile,Integer> {
}
