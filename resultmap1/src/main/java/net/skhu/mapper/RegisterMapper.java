package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Register;

@Mapper
public interface RegisterMapper {

	@Select("SELECT r.*, s.studentNumber, s.name studentName, c.courseName, c.unit\r\n " +
			"FROM register r JOIN student s ON r.studentId = s.id\r\n  " +
			"                JOIN course c ON r.courseId = c.id\r\n  " +
			"ORDER BY s.studentNumber;")
	List<Register> findAll();


}
