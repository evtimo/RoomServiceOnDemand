package university.project.roomserviceondemand.repository;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 21.10.2019
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import university.project.roomserviceondemand.models.User;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    void deleteAll();

}
