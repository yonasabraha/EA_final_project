package com.example.ea_final_project;

import com.example.ea_final_project.model.Address;
import com.example.ea_final_project.model.Country;
import com.example.ea_final_project.model.State;
import com.example.ea_final_project.model.Student;
import com.example.ea_final_project.service.AddressService;
import com.example.ea_final_project.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Application.class, args);

        AddressService addressService = context.getBean(AddressService.class);
        StudentService studentService = context.getBean(StudentService.class);

        State state = new State("Iowa");
        Country country = new Country("United States");
        Address address = new Address("1000 N 4th St", "Fairfield", "52557", state, country);
//        addressService.create(address);

        Student student = new Student("5635625", "John", "john@gmail.com", address, address);
        studentService.create(student);

    }
}
