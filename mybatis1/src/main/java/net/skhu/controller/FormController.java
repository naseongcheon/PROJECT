package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Student;
import net.skhu.mapper.DepartmentMapper;

@Controller
@RequestMapping("/form")
public class FormController {

	@Autowired DepartmentMapper departmentMapper;

	@GetMapping("edit1")
	public String edit1(Model model) {
		model.addAttribute("student", new Student());
		return "form/edit1";
	}

	@PostMapping("edit1")
	public String edit1(Model model, Student student) {
		model.addAttribute("message","저장했습니다.");
		return "form/edit1";
	}

	@GetMapping("edit2")
	public String edit2(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("departments", departmentMapper.findAll());
		return "form/edit2";
	}

	@PostMapping("edit2")
	public String edit2(Model model, Student student) {
		model.addAttribute("message", "저장했습니다.");
		model.addAttribute("departments", departmentMapper.findAll());
		return "form/edit2";
	}

	@GetMapping("edit3")
	public String edit3(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("departments", departmentMapper.findAll());
		return "form/edit3";
	}

	@PostMapping("edit3")
	public String edit3(Model model, Student student) {
		model.addAttribute("message","저장했습니다.");
		model.addAttribute("departments", departmentMapper.findAll());
		return "form/edit3";
	}
}
