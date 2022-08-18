package net.skhu.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Register {
	int id;
	int studentId;
	int courseId;
	int grade;
	Date createDate;
	Student student;
	Course course;
}
