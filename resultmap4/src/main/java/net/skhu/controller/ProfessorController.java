package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.ProfessorMapper;

@Controller
public class ProfessorController {

	@Autowired ProfessorMapper professorMapper;

	@RequestMapping("professor/list")
	public String list(Model model) {
		model.addAttribute("professors", professorMapper.findAll());
		return "professor/list";
	}
}
