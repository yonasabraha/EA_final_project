package com.example.ea_final_project;

import com.example.ea_final_project.model.*;
import com.example.ea_final_project.model.utils.Semester;
import com.example.ea_final_project.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Application.class, args);

        IAddressService addressService = context.getBean(AddressService.class);
        IStudentService studentService = context.getBean(StudentService.class);
        ICourseService courseService = context.getBean(CourseService.class);
        IFacultyService facultyService = context.getBean(FacultyService.class);
        IAcademicBlockService blockService = context.getBean(AcademicBlockService.class);
        IRegistrationGroupService registrationGroupService = context.getBean(RegistrationGroupService.class);

        State state = new State("Iowa");
        Country country = new Country("United States");
        Address address = new Address("1000 N 4th St", "Fairfield", "52557", state, country);
//        addressService.create(address);

        Student student = new Student("5635625", "John", "john@gmail.com", address, address);
//        studentService.create(student);

        Course course = new Course("ASD", "CS503", "Advanced software development");
//        courseService.create(course);

        Faculty faculty = new Faculty("John", "John@gmail.com", "Professor");
//        facultyService.create(faculty);

        AcademicBlock block = new AcademicBlock("December 2021", "2021-12A-12D-", Semester.WINTER, LocalDate.now(), LocalDate.now());
//        blockService.create(block);

        RegistrationGroup group = new RegistrationGroup();
        group.addStudent(student);
        group.addAcademicBlock(block);
        registrationGroupService.create(group);

    }
}
