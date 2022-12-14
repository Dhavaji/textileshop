/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springbootfinal.service;

/**
 *
 * @author Chethana Dhavaji
 */

import com.example.springbootfinal.domain.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

import com.example.springbootfinal.repositary.LoginRepository;
 
 
@Service
public class LoginService {
@Autowired
private LoginRepository repo;
  
  public Login login(String username, String password) {
  Login user = repo.findByUsernameAndPassword(username, password);
   return user;
  }
 
}