package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Course;

@Mapper
public interface CourseMapper {

	@Select("SELECT * FROM course WHERE professorld = #{professorld}")
	List<Course> findByProfessorld(int professorld);

}
