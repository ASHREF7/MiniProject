package com.sesame.miniprojet.Service;

import com.sesame.miniprojet.Repositories.IuserR;
import com.sesame.miniprojet.entities.User;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class UserServiceImpl {

        @Autowired
        private IuserR userRepository;

        public List<User> getAllUsers() {
            return userRepository.findAll();
        }
        public@NonNull Optional<User> getUserById(Long id) {
            return userRepository.findById(id);
        }

        public User saveUser(User user) {
            return userRepository.save(user);
        }

        public void deleteUser(Long id) {
            userRepository.deleteById(id);
        }
public void updateUser(Long id) {
            userRepository.getUserByID(id);
}

}

