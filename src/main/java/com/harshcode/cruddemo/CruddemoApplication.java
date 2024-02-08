package com.harshcode.cruddemo;

import com.harshcode.cruddemo.dao.StudentDAO;
import com.harshcode.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			//createMultipleStudent(studentDAO);
            readStudent(studentDAO);
		};
	}

    private void readStudent(StudentDAO studentDAO) {

        // create the student object
           Student tempstudent = new Student("harsh","tiwari","harsh@code");

        // save the student
           studentDAO.save(tempstudent);

        // display id of the student
           int id = tempstudent.getId();
           System.out.println("generated student id: "+ id);

        // retrieve the student based on the id: primary key

           System.out.println("retrieve student with id.... ");
           Student mystudent = studentDAO.findById(id);

           // display student

           System.out.println("retieved student based on id: " + mystudent);
    }

    private void createMultipleStudent(StudentDAO studentDAO) {

		// create 3 students objects
		System.out.println("Creating 3 new Student: ");
		Student tempstudent1 = new Student("mayank", "tiwari", "harshCode.com");
		Student tempstudent2 = new Student("himanshu", "mehra", "harshCode.com");
		Student tempstudent3 = new Student("saksham", "dwevedi", "harshCode.com");

		// save the students objects
		System.out.println("Saving the objects: ");
		studentDAO.save(tempstudent1);
		studentDAO.save(tempstudent2);
		studentDAO.save(tempstudent3);

		// display id of the saved students
		System.out.println("student 1 id: "+ tempstudent1.getId());
		System.out.println("student 2 id: "+ tempstudent2.getId());
		System.out.println("student 3 id: "+ tempstudent3.getId());


	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating a new Student: ");
		Student tempstudent = new Student("harsh", "tiwari", "harshCode.com");

		// save the student object
		System.out.println("Saving the object: ");
		studentDAO.save(tempstudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: "+ tempstudent.getId());
	}

}














