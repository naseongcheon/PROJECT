package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("third")
public class ThirdController {

	@RequestMapping("test1")
	public String test1(Model model) {
		Student student = new Student();
		student.setId(123);
		student.setStudentNumber("20092398");
		student.setStudentName("나성천");
		student.setEmail("ch0226xz@nate.com");
		model.addAttribute("student",student);
		return "third/test1";
	}


	@GetMapping("test2")
	public String test2(Model model) {
		model.addAttribute("student", new Student());
		return "third/test2";
	}

	@PostMapping("test2")
	public String test2(Model model, Student student) {
		model.addAttribute("message", "저장되었습니다");
		return "third/test2";
	}
}
