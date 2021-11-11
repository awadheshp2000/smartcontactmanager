package com.example.smartcontactmanager.dao;

import com.example.smartcontactmanager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Ejb3TransactionAnnotationParser;

import javax.persistence.Id;

public interface UserRepository extends JpaRepository<User, Integer> {

}
