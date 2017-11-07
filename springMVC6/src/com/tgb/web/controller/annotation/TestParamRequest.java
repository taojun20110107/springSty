/**
 * 
 */
package com.tgb.web.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tWX518469
 * 测试参数传参数
 */
 
@Controller
@RequestMapping("/param")
public class TestParamRequest {

	@RequestMapping(value="/departments")  
	public String findDepatment(  
	  @RequestParam("departmentId") String departmentId){  
	    
	    System.out.println("Find department with ID: " + departmentId);  
	    return "";  
	  
	} 
}
