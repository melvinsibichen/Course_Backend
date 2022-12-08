package com.nest.CourseApp.dao;

import com.nest.CourseApp.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {
}