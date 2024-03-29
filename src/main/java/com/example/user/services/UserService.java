package com.example.user.services;

import com.example.user.entity.User;
import com.example.user.entityDTO.RoleDTO;
import com.example.user.entityDTO.UserDTO;
import com.example.user.repository.ValidatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.stream.Stream;


public interface UserService {


    public abstract Stream<UserDTO> getAllUsers();

    public abstract void putUser(User user);

    public abstract Optional<User> getUserById(long id);

    public abstract void createNewUser(User user);

    public abstract Optional<User> getUserByLogin(String Login);

    public abstract ResponseEntity<Object> deleteUser(Long id);

    public Optional<User> updateUser(Long id, RoleDTO roleDTO);

    public abstract Stream<UserDTO> getAllDemandeur();

    public abstract Stream<UserDTO> getAllBenevole();

    public boolean isUserAValidator(Long userId);
}
