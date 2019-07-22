package pl.hpop.cap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pl.hpop.cap.dao.UserDao;
import pl.hpop.cap.model.User;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);

        if (user == null) {
            throw new BadCredentialsException("Bad credentials from userService");
        }

        new AccountStatusUserDetailsChecker().check(user);

        return user;
    }

    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User findOne(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub

    }

}
