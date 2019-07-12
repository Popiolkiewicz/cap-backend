package pl.hpop.cap.service;

import java.util.List;

import pl.hpop.cap.model.User;

public interface UserService {

    User save(User user);

    List<User> findAll();

    User findOne(long id);

    void delete(long id);
}
