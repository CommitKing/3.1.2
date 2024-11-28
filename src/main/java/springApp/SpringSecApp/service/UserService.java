package springApp.SpringSecApp.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import springApp.SpringSecApp.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    UserDetails loadUserByUsername(String username);

    User getUserByUsername(String username);

    List<User> getAllUsersWithRole();

    void saveUser(User user);

    void deleteUser(int id);

    User getUserById(int id);


}
