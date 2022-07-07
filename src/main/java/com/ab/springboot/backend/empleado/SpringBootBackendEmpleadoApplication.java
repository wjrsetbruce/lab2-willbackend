package com.ab.springboot.backend.empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ab.springboot.backend.empleado.dao.EmpleadoRepository;
import com.ab.springboot.backend.empleado.model.Empleado;
import com.github.javafaker.Faker;

@SpringBootApplication
public class SpringBootBackendEmpleadoApplication implements ApplicationRunner{

  @Autowired
  private EmpleadoRepository empleadoRepository;
  
  Faker faker = new Faker();
  
  public static void main(String[] args) {
    SpringApplication.run(SpringBootBackendEmpleadoApplication.class, args);

    
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    for(int i =0; i<2; i++) {
    	String email = faker.funnyName().name()+"i"+"@gmail.com";
      Empleado emp = new Empleado();
      emp.setFirstName(faker.name().firstName());
      emp.setLastName(faker.name().lastName());
      emp.setEmailId(email.replace(" ", ".").toLowerCase());
      empleadoRepository.save(emp);
    }
    
  }

}