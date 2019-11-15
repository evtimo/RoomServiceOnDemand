package university.project.roomserviceondemand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.models.User;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> getAllByUserId(Long userId);
    List<Request> getAllByUser(User user);
    void deleteAll();
}
