package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig2.class);
		StudentDao dao=context.getBean(StudentDao.class);

		dao.getClass().getDeclaredMethods("save",Student.class);
		context.getBean("jdbcTemplate",org.springframework.jdbc.core.JdbcTemplate.class)
						.execute("CREATE TABLE student(id INT PRIMARY KEY,name VARCHAR(5),age INT)");

		Student s1=new Student();
		s1.setId(1);s1.setName("ALice");s1.setAge(10);
		dao.save(s1);


		context.close();

		SpringApplication.run(FirstprojectApplication.class, args);
	}
}
// DI -> dependency injection -> loose coupling ->
// class -> components -> dependent ->
// mutilple independent services but they communication ->
// dependency injection
// component -> is used by another
// annotations ->
// spring boot -> to eliminate config things -> mamnging configs was difficult
// spring -> IOC container ->
// spring boot -> embedded server -> TOMCAT SERVER