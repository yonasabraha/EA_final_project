package com.example.ea_final_project;

import com.example.ea_final_project.model.*;
import com.example.ea_final_project.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Application.class, args);

        IAddressService addressService = context.getBean(AddressService.class);
        IStudentService studentService = context.getBean(StudentService.class);
        ICourseService courseService = context.getBean(CourseService.class);

        State state = new State("Iowa");
        Country country = new Country("United States");
        Address address = new Address("1000 N 4th St", "Fairfield", "52557", state, country);
//        addressService.create(address);

        Student student = new Student("5635625", "John", "john@gmail.com", address, address);
//        studentService.create(student);

        Course course = new Course("ASD", "CS503", "Advanced software development");
        courseService.create(course);

    }
}
