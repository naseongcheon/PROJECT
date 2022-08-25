package net.skhu.dto;

import java.util.List;

import lombok.Data;

@Data
public class Professor {
	int id;
	String professorName;
	int departmentId;

	List<Course> courses;

}
