package com.example.JFSDS25_SBMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

	@Autowired 
	private EmployeeDAO empdao; 
	@GetMapping("/addemp") 
	public String Addemp() { 
	return "addemp"; 
	}  
    @PostMapping("/insert")
    public void insertemp(@ModelAttribute Employee employee, Model model) {
    	model.addAttribute("employee", employee); 
        System.out.println(empdao.addEmp(employee)); 
    }

}
