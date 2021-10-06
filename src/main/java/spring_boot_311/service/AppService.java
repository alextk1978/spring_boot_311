package spring_boot_311.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import spring_boot_311.config.exception.LoginException;
import spring_boot_311.model.Role;
import spring_boot_311.model.User;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface AppService extends UserDetailsService {
    List<User> findAllUsers();

    User findUser(Long userId) throws NullPointerException;

    void deleteUser(Long userId);

    List<Role> findAllRoles();

    void authenticateOrLogout(Model model, HttpSession session, LoginException authenticationException, String authenticationName);

    boolean saveUser(User user, BindingResult bindingResult, Model model);
}
