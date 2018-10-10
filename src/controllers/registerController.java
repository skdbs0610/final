package controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import models.registerRepository;


@Controller
@RequestMapping("/admin/employee")
public class registerController {
	
	@Autowired
	registerRepository srep;
	
	@GetMapping("/add.do")
	public String adminAddHandle(ModelMap modelMap) {
		Integer empSeq=srep.getEmployeeSeq();
		modelMap.put("empSeq", empSeq);
		System.out.println("employeesequence : "+empSeq);
		
		List<Map> depts = srep.getDept();
		modelMap.put("depts", depts);
		System.out.println("부서정보 : "+depts);
		return "admin.Employee.add";
	}
	
	
}
