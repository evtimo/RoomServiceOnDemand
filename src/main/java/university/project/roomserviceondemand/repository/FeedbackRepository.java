package university.project.roomserviceondemand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import university.project.roomserviceondemand.models.Feedback;
import university.project.roomserviceondemand.models.Request;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
