/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springbootfinal.repositary;

import com.example.springbootfinal.domain.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chethana Dhavaji
 */

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
Login findByUsernameAndPassword(String username, String password);
 
}
