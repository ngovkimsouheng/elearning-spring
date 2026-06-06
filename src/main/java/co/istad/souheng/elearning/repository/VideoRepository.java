package co.istad.souheng.elearning.repository;

import co.istad.souheng.elearning.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video,Integer> {

}
