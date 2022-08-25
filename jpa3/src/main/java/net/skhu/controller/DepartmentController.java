package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.repository.DepartmentRepository;

@Controller
public class DepartmentController {

	private final DepartmentRepository departmentRepository;

	public DepartmentController(DepartmentRepository departmentRepository) {
		this.departmentRepository  = departmentRepository;
	}

	@RequestMapping("department/list1")
	public String list1(Model model) {
		model.addAttribute("departments", departmentRepository.findAll());
		return "department/list1";
	}

	@RequestMapping("department/list2")
	public String list2(Model model) {
		model.addAttribute("departments", departmentRepository.findAll());
		return "department/list2";
	}

}
