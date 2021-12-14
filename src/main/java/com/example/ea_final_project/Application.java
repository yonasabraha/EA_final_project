package com.example.ea_final_project;

import com.example.ea_final_project.model.*;
import com.example.ea_final_project.model.utils.Semester;
import com.example.ea_final_project.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Application implements ApplicationRunner {
    @Autowired AddressService addressService;
    @Autowired StudentService studentService;
    @Autowired  CourseService courseService;
    @Autowired FacultyService facultyService;
    @Autowired AcademicBlockService blockService;
    @Autowired RegistrationGroupService registrationGroupService;
    @Autowired CourseOfferingService courseOfferingService;
    @Autowired RegistrationService registrationService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        State state = new State("Iowa");
        Country country = new Country("United States");
        Address address = new Address("1000 N 4th St", "Fairfield", "52557", state, country);
//        addressService.create(address);

        Student student = new Student("5635625", "John", "john@gmail.com", address, address);
//        studentService.create(student);
////
        Course course1 = new Course("ASD", "CS503", "Advanced software development");
////        courseService.create(course1);
//        Course course2 = new Course("EA", "CS544", "Enterprise Architecture");
////        courseService.create(course2);
//        Course course3 = new Course("SA", "CS572", "Software Architecture");
////        courseService.create(course3);
//        Course course4 = new Course("WAP", "CS72", "Web Applications");
////        courseService.create(course4);
//        Course course5 = new Course("FPP", "CS390", "Fundamental Programming Practices");
////        courseService.create(course5);
//        Course course6 = new Course("MPP", "CS401", "Modern Programming Practices");
////        courseService.create(course6);
////
        Faculty faculty1 = new Faculty("John", "Cole", "John@gmail.com", "Professor");
//        facultyService.create(faculty1);
//        Faculty faculty2 = new Faculty("Josef", "Lerman", "John@gmail.com", "Professor");
////        facultyService.create(faculty2);
//        Faculty faculty3 = new Faculty("payman", "salek", "John@gmail.com", "Professor");
////        facultyService.create(faculty3);
//        Faculty faculty4 = new Faculty("assad", "saad", "John@gmail.com", "Professor");
////        facultyService.create(faculty4);
//        Faculty faculty5 = new Faculty("rene", "deyong", "John@gmail.com", "Professor");
////        facultyService.create(faculty5);
//        Faculty faculty6 = new Faculty("bruce", "lester", "John@gmail.com", "Professor");
////        facultyService.create(faculty6);
////
        AcademicBlock block1 = new AcademicBlock("December 2021", "2021-12A-12D-", Semester.WINTER, LocalDate.now(), LocalDate.now());
////        blockService.create(block1);
//        AcademicBlock block2 = new AcademicBlock("january 2022", "2022-01A-01D-", Semester.SPRING, LocalDate.now(), LocalDate.now());
////        blockService.create(block2);
//        AcademicBlock block3 = new AcademicBlock("february 2022", "2022-02A-02D-", Semester.SPRING, LocalDate.now(), LocalDate.now());
////        blockService.create(block3);
//        AcademicBlock block4 = new AcademicBlock("march 2021", "2022-02A-02D-", Semester.SPRING, LocalDate.now(), LocalDate.now());
////        blockService.create(block4);
////
////        RegistrationGroup group = new RegistrationGroup();
////        group.addStudent(student);
////        group.addAcademicBlock(block);
////        registrationGroupService.create(group);
////
//
        CourseOffering courseOffering1 = new CourseOffering("2021-12A-12D-JC", 40, course1, faculty1, block1);
//        courseOfferingService.create(courseOffering1);
//        CourseOffering courseOffering2 = new CourseOffering("2021-12A-12D-JL", 40, course2, faculty2, block1);
//        courseOfferingService.create(courseOffering2);
//        CourseOffering courseOffering3 = new CourseOffering("2021-12A-12D-PS", 40, course3, faculty3, block1);
//        courseOfferingService.create(courseOffering3);
//        CourseOffering courseOffering4 = new CourseOffering("2021-12A-12D-AS", 40, course4, faculty4, block1);
//        courseOfferingService.create(courseOffering4);
//        CourseOffering courseOffering5 = new CourseOffering("2021-12A-12D-RD", 40, course5, faculty5, block1);
//        courseOfferingService.create(courseOffering5);
//        CourseOffering courseOffering6 = new CourseOffering("2021-12A-12D-BL", 40, course6, faculty6, block1);
//        courseOfferingService.create(courseOffering6);
//        CourseOffering courseOffering7 = new CourseOffering("2022-01A-01D-JC", 40, course1, faculty1, block2);
//        courseOfferingService.create(courseOffering7);
//        CourseOffering courseOffering8 = new CourseOffering("2022-01A-01D-JL", 40, course2, faculty2, block2);
//        courseOfferingService.create(courseOffering8);
//        CourseOffering courseOffering9 = new CourseOffering("2022-01A-01D-PS", 40, course3, faculty3, block2);
//        courseOfferingService.create(courseOffering9);
//        CourseOffering courseOffering10 = new CourseOffering("2022-01A-01D-AS", 40, course4, faculty4, block2);
//        courseOfferingService.create(courseOffering10);
//        CourseOffering courseOffering11 = new CourseOffering("2022-01A-01D-RD", 40, course5, faculty5, block2);
//        courseOfferingService.create(courseOffering11);
//        CourseOffering courseOffering12 = new CourseOffering("2022-01A-01D-BL", 40, course6, faculty6, block2);
//        courseOfferingService.create(courseOffering12);
//        CourseOffering courseOffering13 = new CourseOffering("2022-02A-02D-JC", 40, course1, faculty1, block3);
//        courseOfferingService.create(courseOffering13);
//        CourseOffering courseOffering14 = new CourseOffering("2022-02A-02D-JL", 40, course2, faculty2, block3);
//        courseOfferingService.create(courseOffering14);
//        CourseOffering courseOffering15 = new CourseOffering("2022-02A-02D-PS", 40, course3, faculty3, block3);
//        courseOfferingService.create(courseOffering15);
//        CourseOffering courseOffering16 = new CourseOffering("2022-02A-02D-AS", 40, course4, faculty4, block3);
//        courseOfferingService.create(courseOffering16);
//        CourseOffering courseOffering17 = new CourseOffering("2022-02A-02D-RD", 40, course5, faculty5, block3);
//        courseOfferingService.create(courseOffering17);
//        CourseOffering courseOffering18 = new CourseOffering("2022-02A-02D-BL", 40, course6, faculty6, block3);
//        courseOfferingService.create(courseOffering18);
//        CourseOffering courseOffering19 = new CourseOffering("2022-01A-01D-JC", 40, course1, faculty1, block4);
//        courseOfferingService.create(courseOffering19);
//        CourseOffering courseOffering20 = new CourseOffering("2022-01A-01D-JL", 40, course2, faculty2, block4);
//        courseOfferingService.create(courseOffering20);
//        CourseOffering courseOffering21 = new CourseOffering("2022-01A-01D-PS", 40, course3, faculty3, block4);
//        courseOfferingService.create(courseOffering21);
//        CourseOffering courseOffering22 = new CourseOffering("2022-01A-01D-AS", 40, course4, faculty4, block4);
//        courseOfferingService.create(courseOffering22);
//        CourseOffering courseOffering23 = new CourseOffering("2022-01A-01D-RD", 40, course5, faculty5, block4);
//        courseOfferingService.create(courseOffering23);
//        CourseOffering courseOffering24 = new CourseOffering("2022-01A-01D-BL", 40, course6, faculty6, block4);
//        courseOfferingService.create(courseOffering24);




        Registration registration = new Registration(courseOffering1, student);
        registrationService.create(registration);
    }
}
