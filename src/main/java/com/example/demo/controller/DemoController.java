/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Persona;
import com.example.demo.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jpenalvs
 */
@Controller
public class DemoController {
    
    @Autowired
    private IPersonaRepo repo;
    
    @GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            Persona p = new Persona();
            p.setIdPersona(2);
            p.setNombre("Marta");
            repo.save(p);
            model.addAttribute("name", name);
		return "greeting";
	}
    @GetMapping("/listar")
	public String greeting(Model model) {
            model.addAttribute("personas", repo.findAll());
		return "greeting";
	}
}
