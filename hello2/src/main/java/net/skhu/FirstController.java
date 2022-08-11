package net.skhu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

	@RequestMapping("test1")
	public String test1() {
		return "안녕하세요";
	}

	@RequestMapping("test2")
	public String[] test2() {
		return new String[] {"월","화","수","목","금","토","일"};
	}

	@RequestMapping("test3")
	public Product test3() {
		return new Product("맥주", 2000);
	}

	@RequestMapping("test4")
	public Product[] test4() {
		return new Product[] {
				new Product("맥주",2000),
				new Product("우유", 1500)
		};
	}


}
