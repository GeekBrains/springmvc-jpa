package com.springmvc.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.example.formbean.Community;
import com.springmvc.example.formbean.User;


@Controller
@RequestMapping(value = "/register")
public class RegistrationController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
    	
    	System.out.println(">>>>>>>>>>In Registration Controller >>>>>>>>>>>");
    
        User userForm = new User();     
        model.put("userForm", userForm);
         
        List<String> professionList = new ArrayList<String>();
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
        model.put("professionList", professionList);
        
        List communityList = new ArrayList();
		communityList.add(new Community("Spring","Spring"));
		communityList.add(new Community("Hibernate","Hibernate"));
		communityList.add(new Community("Struts","Struts"));
		 model.put("communityList", communityList);
		
		
        return "Registration";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,  Map<String, Object> model) {
		
		System.out.println(">>>>>>>>>>>>>>>>> Get Data in Controller >>>>>>>>");
	  
		String gender = user.getGender();
		String username = user.getUserName();
		
		System.out.println("gender :: " + gender + "username :: " + username);
		return "RegistrationSucess";


  }
}
     

