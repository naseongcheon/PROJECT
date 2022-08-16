package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {

	@Select("SELECT * FROM Student WHERE id = #{id}")
	Student findOne(int id);

	@Select("SELECT * FROM Student WHERE studentName = #{studentName}")
	Student findByStudentNumber(String studentNumber);

	@Select("SELECT s.* d.departmentName	" +
			"FROM student s LEFT JOIN department d " +
			"ON a.departmentId = d.id		" )
	List<Student> findAll();

	@Insert("INSERT Student (studentNumber, name, departmentId, year)     " +
	"VALUES (#{studentNumber}, #{name}, #{departmentId}, #{year}) ")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Student student);

	@Update("UPDATE Student SET                  " +
	"  studentNumber = #{studentNumber}, " +
	"  name = #{name},                   " +
	"  departmentId = #{departmentId},   " +
	"  year = #{year}                    " +
	"WHERE id = #{id}                    ")
	void update(Student student);

	@Delete("DELETE FROM Student WHERE id = #{id}")
	void delete(int id);


}
