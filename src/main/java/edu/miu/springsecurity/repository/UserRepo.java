package edu.miu.springsecurity.repository;

import edu.miu.springsecurity.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
