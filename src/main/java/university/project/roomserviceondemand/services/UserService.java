package university.project.roomserviceondemand.services;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 21.10.2019
 */

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import university.project.roomserviceondemand.models.Role;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean addUser(User user){
        Optional<User> userDB = userRepository.findByEmail(user.getEmail());
        if(userDB.isPresent()){
            return false;
        }

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String password = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(password);
        String[] s = user.getName().trim().split(" ");
        if(s.length >= 2){
            user.setName(s[0]);
            user.setSurname(s[1]);
        }
        user.setRole(Role.CLIENT);
        userRepository.save(user);

        return true;
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    public User findByEmail(String email){
        Optional<User> byEmail = userRepository.findByEmail(email);
        return byEmail.orElse(null);
    }
}
