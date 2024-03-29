package com.example.user.repository;

import com.example.user.entity.Validator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidatorRepository extends JpaRepository<Validator,Long> {
    boolean existsById(Long id);

}
