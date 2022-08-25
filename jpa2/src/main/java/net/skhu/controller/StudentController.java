package net.skhu.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.entity.Department;
import net.skhu.entity.Student;
import net.skhu.repository.DepartmentRepository;
import net.skhu.repository.StudentRepository;

@Controller
@RequestMapping("/student")
public class StudentController {

	private final StudentRepository studentRepository;
	private final DepartmentRepository departmentRepository;

	public StudentController(StudentRepository studentRepository,
								DepartmentRepository departmentRepository) {
		this.studentRepository = studentRepository;
		this.departmentRepository = departmentRepository;
	}


	@RequestMapping("list")
	public String list(Model model) {
		List<Student> students = studentRepository.findAll();
		model.addAttribute("students", students);
		return "student/list";
	}

	@GetMapping("create")
	public String create(Model model) {
		Student student = new Student();
		List<Department> departments = departmentRepository.findAll();
		model.addAttribute("student", student);
		model.addAttribute("departments",departments);
		return "student/edit";
	}

	@PostMapping("create")
	public String create(Model model, Student student) {
		studentRepository.save(student);
		return "redirect:list";
	}


	@GetMapping("edit")
	public String edit(Model model, @RequestParam("id") int id) {
		Student student = studentRepository.findById(id).get();
		List<Department> departments = departmentRepository.findAll();

		model.addAttribute("student", student);
		model.addAttribute("departments", departments);
		return "student/edit";
	}

	@PostMapping("edit")
	public String edit(Model model, Student student) {
		studentRepository.save(student);
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(Model model, @RequestParam("id") int id) {
		studentRepository.deleteById(id);
		return "redirect:list";
	}

}
