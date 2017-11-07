package com.tgb.web.controller.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tgb.web.controller.entity.User;

@Controller
@RequestMapping("/user/data")
public class DataController {

	@RequestMapping("/addUser")
	public String addUser(User user, HttpServletRequest request) {
		System.out.println("xxxxxxxxxx");
		request.setAttribute("userName", user.getUserName());
		request.setAttribute("age", user.getAge());
		System.out.println("name : " + user.getUserName());
		System.out.println("age : " + user.getAge());

		return "/userManager";

	}

	
	@RequestMapping(value="/addUser2",method=RequestMethod.POST)
    @ResponseBody
	public void saveUser(@RequestBody User user, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ttt");
		// {"username":"userName","age","age"}
		String result = "{\"userName\":\" " + user.getUserName()  + " \",\"age\":\" " + user.getAge() + " \"}";
		PrintWriter out = null;
		response.setContentType("application/json");

		try {
			out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("/addUserJson")
	public void addUserJson(User user, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("yyyyyyyyyy");
		// {"username":"userName","age","age"}
		String result = "{\"userName\":\" " + user.getUserName() + "after" + " \",\"age\":\" " + user.getAge() + " \"}";
		PrintWriter out = null;
		response.setContentType("application/json");

		try {
			out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("/delUser")
	public String delUser() {
		return "";
	}

	@RequestMapping("/toUser")
	public String toUser() {
		return "/json";
	}
	
	@RequestMapping("/departments")  
	public void findDepatment(  
	  @RequestParam("departmentId") String departmentId){  
	    
	    System.out.println("Find department with ID: " + departmentId);  
	    
	  
	} 
	
	
	@RequestMapping(value="/departments/{departmentId}")  
	public void findDepatment2(@PathVariable String departmentId){  
	  
	  System.out.println("Find department with ID: " + departmentId);  
	
	}  

	@RequestMapping("/toUserForm")
	public String toUserForm() {
		return "/addUser";
	}

	@RequestMapping("/toImg")
	public String toIMg() {
		return "/staticFile";
	}

}
