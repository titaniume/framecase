package cn.jack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JackController {
	
	@RequestMapping("/jack")
	public String jacks(Model model){
		System.out.println("jack");
		model.addAttribute("jack", "杰克,道森!");
		return "jack";
	}
}
