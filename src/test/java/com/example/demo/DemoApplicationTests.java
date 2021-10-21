package com.example.demo;

import com.example.demo.model.Usuario;
import com.example.demo.repo.IUsuarioRepo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
        
        @Autowired
        private IUsuarioRepo repo;
    
	@Test
	public void crearUsuarioTest(){
            Usuario us = new Usuario();
            us.setId(1);
            us.setNombre("mitocode");
            us.setClave("742");
            
            Usuario retorno = repo.save(us);
            
            assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
        }

}
