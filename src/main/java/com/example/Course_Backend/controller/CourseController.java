package com.nest.CourseApp.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.nest.CourseApp.dao.CourseDao;
import com.nest.CourseApp.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String HomePage(){
        return "Welcome to CourseApp";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> ViewCourse(){
        return (List<Course>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/add", consumes = "application/json", produces = "application/json")
    public String AddCourse(@RequestBody Course c){
        dao.save(c);
        return "{'status':'success'}";
    }

}