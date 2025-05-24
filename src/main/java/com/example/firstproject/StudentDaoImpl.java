package com.example.firstproject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl {
    private JdbcTemplate jdbcTemplate;
    public StudentDaoImpl (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public void save(Student student){
        String sql="INSERT INTO student(id,name,age) VALUES (?,?,?)";
        jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAge());
    }
    public Student getById(int id){
        String sql="SELECT * FROM student where id=?";
        return jdbcTemplate.queryForObject(sql,new StudentMapper(),id);
    }

    public List<Student> getAll(){
        String sql="SELECT * FROM student ";
        return jdbcTemplate.query(sql,new StudentMapper());
    }
    // update , delete
    private static class StudentMapper implements RowMapper<Student>{
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
            Student s=new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setAge(rs.getInt("age"));
            return s;
        }
    }
}
