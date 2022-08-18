package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Register;

@Mapper
public interface RegisterMapper {

	@ResultMap("RegisterWithStudentAndCourse")
	@Select("SELECT r.*, s.studentNumber, s.name studentName, c.courseName, c.unit " +
			"FROM register r JOIN student s ON r.studentId = s.id " +
			"                JOIN course c ON r.courseId = c.id " +
			"ORDER BY s.studentNumber ")
	List<Register> findAll();
}
