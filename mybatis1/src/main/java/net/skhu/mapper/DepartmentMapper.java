package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Department;

@Mapper
public interface DepartmentMapper {

	@Select("SELECT * FROM department")
	List<Department> findAll();

	@Select("SELECT * FROM department WHERE id = #{id}")
	Department findOne(int id);

	@Insert("INSERT department (departmentName) VALUES (#{departmentName})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Department department);

	@Update("UPDATE department SET departmentName = #{departmentName} WHERE id = #{id}")
	void update(Department department);

	@Delete("DELETE FROM department WHERE id = #{id}")
	void delete(int id);

}
