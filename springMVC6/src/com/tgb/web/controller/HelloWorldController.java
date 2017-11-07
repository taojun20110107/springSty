package com.tgb.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		System.out.println("-------hello tgb-----");
		
		String hello = "lsh hello 提高班";
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("map1", "提高班1");
		map.put("map2", "提高班2");
		map.put("map3", "提高班3");
		
		return new ModelAndView("/welcome","map",map);
		
		
	}
	
	
}
