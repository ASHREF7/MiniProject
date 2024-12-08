package com.sesame.miniprojet.Repositories;

import com.sesame.miniprojet.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserR extends JpaRepository<User, Long> {
    User findById(long id);


    User getUserByID(Long id);
}
