package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.service.TeacherService;
import edu.neu.csye6200.util.TestDataUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;



@Component
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    public void addTestData(){

        teacherService.saveTeachers(new TestDataUtilities().populateTeacherData("C:\\Users\\Jayanth\\Documents\\NetBeansProjects\\daycare-main\\src\\main\\resources\\Teachers.csv"));
    }

    public void displayAllTeachers(){
        teacherService.getAllTeachers().forEach(System.out::println);
    }

    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
    public void removeTeacherById(Integer id){
        teacherService.deleteTeacherById(id);
    }
    public Optional<Teacher> getTeacherById(Integer id){
        return teacherService.getTeacherById(id);
    }

    public void addTeacher(String csv){
        teacherService.saveTeacher(csv);
    }


}
