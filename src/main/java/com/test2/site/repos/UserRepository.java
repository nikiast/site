package com.test2.site.repos;

import org.springframework.data.repository.CrudRepository;

import com.test2.site.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
