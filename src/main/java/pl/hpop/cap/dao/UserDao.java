package pl.hpop.cap.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.hpop.cap.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
