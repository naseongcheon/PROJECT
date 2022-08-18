package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Professor;

@Mapper
public interface ProfessorMapper {

	@Select("SELECT * FROM professor")
	List<Professor> findAll();
}
