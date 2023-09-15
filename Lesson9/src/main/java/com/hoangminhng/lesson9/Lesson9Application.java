package com.hoangminhng.lesson9;

import com.hoangminhng.lesson9.dao.AppDAO;
import com.hoangminhng.lesson9.entity.Instructor;
import com.hoangminhng.lesson9.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lesson9Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson9Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO){
        return runner -> {
            createInstructor(appDAO);
        };
    }

    private void createInstructor(AppDAO appDAO) {
        Instructor tempInstructor = new Instructor("Chad", "Darby", "darby@gmail.com");

        InstructorDetail tempInstructorDetail = new InstructorDetail("https://www.youtube.com/", "love to code");

        tempInstructor.setInstructorDetail(tempInstructorDetail);

        System.out.println("Saving instructor: " + tempInstructor);
        appDAO.save(tempInstructor);

        System.out.println("Done!");
    }
}
