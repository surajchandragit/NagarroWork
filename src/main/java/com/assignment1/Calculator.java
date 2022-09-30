package com.assignment1;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.service.AddService;

@Controller

public class Calculator {
	
	
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
	{
		
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		AddService a = new AddService();
		int k = a.add(i, j);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display1.jsp");
		mv.addObject("result",k);
		
		return mv ;
	}
	
	@RequestMapping("/division")
	public ModelAndView division(HttpServletRequest request, HttpServletResponse response)
	{
		
		int m = Integer.parseInt(request.getParameter("t1"));
		int n = Integer.parseInt(request.getParameter("t2"));
		AddService a = new AddService();
		int p = a.division(m, n);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display1.jsp");
		mv.addObject("result",p);
		
		return mv ;
	}
	
	@RequestMapping("/multiple")
	public ModelAndView multiple(HttpServletRequest request, HttpServletResponse response)
	{
		
		int x = Integer.parseInt(request.getParameter("t1"));
		int y = Integer.parseInt(request.getParameter("t2"));
		AddService a = new AddService();
		int z=a.multiple(x, y);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display1.jsp");
		mv.addObject("result",z);
		
		return mv ;
	}
	
	@RequestMapping("/subtract")
	public ModelAndView subtract(HttpServletRequest request, HttpServletResponse response)
	{
		
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		
		AddService ab = new AddService();
		int c = ab.subtract(a, b);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display1.jsp");
		mv.addObject("result",c);
		
		return mv ;
	}

}
