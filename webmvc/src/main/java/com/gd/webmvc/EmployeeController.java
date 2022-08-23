package com.gd.webmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // springmvc의 증거 servlet를 안서도 되게해쥼
public class EmployeeController {
	
	@Autowired    // 스프링이 사용된 증거 -- 디펜던시인덱션을 사용 (미리 객체를 만들고 있다가 주입시킴)
	// new 를 대신해서 필요할때마다 객체를 만들어줌
	private EmployeeService employeeService;
	
	@GetMapping("/employeeList")
	public String employeeList(Model model) {
		List<Employee> list = employeeService.getEmployeeList();
		model.addAttribute("list",list); // request.setAttribute("list",list);
		return "employeeList"; // rd.forward("/WEB-INF/view/employeeList.jsp")
		
	}
	
}
