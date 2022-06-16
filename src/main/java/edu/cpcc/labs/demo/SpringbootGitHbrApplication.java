package edu.cpcc.labs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.cpcc.labs.demo.model.Student;

@SpringBootApplication
public class SpringbootGitHbrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGitHbrApplication.class, args);
		
		Student st = new Student();
		st.setId(1);
		st.setStudentName("John");
		
		
		System.out.println("Student info " + st.getStudentName());
		
	}

}
