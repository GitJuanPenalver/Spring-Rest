/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repo;

import com.example.demo.model.Persona;
import com.example.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
    
}
