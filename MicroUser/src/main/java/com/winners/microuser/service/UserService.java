package com.winners.microuser.service;

import com.winners.microuser.entity.User;
import com.winners.microuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }
    public User updateUser(int id, User newUser) {
        if (userRepository.findById(id).isPresent()) {
            User existingUser = userRepository.findById(id).get();
            existingUser.setNom(newUser.getNom());
            existingUser.setPrenom(newUser.getPrenom());
            existingUser.setSexe(newUser.getSexe());
            existingUser.setMail(newUser.getMail());
            existingUser.setDate_naissance(newUser.getDate_naissance());
            existingUser.setPassword(newUser.getPassword());

            return userRepository.save(existingUser);
        } else
            return null;
    }
    public String deleteUser(int id){
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
            return "Un client supprimé";
        } else
            return "Un client non supprimé";
    }
}
