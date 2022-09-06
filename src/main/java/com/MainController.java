package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public MainController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/wall")
	public String hello() {
		System.out.println("hello");
		return "wall";
	}
	@RequestMapping("/login")
	public String login() {
		//System.out.println("hello");
		return "login";
	}
	@RequestMapping("/newuser")
	public String newuser() {
		//System.out.println("hello");
		return "newuser";
	}
	@RequestMapping("/updatepass")
	public String updatepass() {
		//System.out.println("hello");
		return "updatepass";
	}
	@RequestMapping("/index")
	public String index() {
		//System.out.println("hello");
		return "index";
	}
	@RequestMapping("/deleteuser")
	public String deleteuser() {
		//System.out.println("hello");
		return "deleteuser";
	}
//	@RequestMapping("/validate3")
//	public String validateUser3(@RequestParam("id")String uid,@RequestParam("pwd")String pwd){
//		//String uid=request.getParameter("user");
//		System.out.println("1");
//		String sql="select passwords from user8080 where userid = ?";
//		System.out.println("2");
//		String name=jdbcTemplate.queryForObject(sql,new  Object[]{uid}, String.class);	
//		
//		System.out.println("3");
//		if (pwd.equals(name)) {
//			return "home";
//			
//		} else {
//			return "loginfail";
//			
//		}
//	}
	
	@RequestMapping("/validate2")
	public ModelAndView validateUser2(Model m,@RequestParam("id")String uid,@RequestParam("pwd")String pwd){
		//String uid=request.getParameter("user");
//		if(uid.equalsIgnoreCase("seed")&pwd.equalsIgnoreCase("seed"))
//		{
//			return "home";
//		}else
//		{
//		return "error";
//		}
//		System.out.println(uid);
//		System.out.println(pwd);
//		return "home";
		ModelAndView modelAndView=new ModelAndView("home");
		System.out.println("1");
		String sql="insert into user8080 values(?,?)";
		System.out.println("1");
		int i=jdbcTemplate.update(sql, new Object[]{uid,pwd});
		System.out.println("1");
		if (i>=1) {
			System.out.println("1");
			m.addAttribute("m",("Registration sucssesfull"));
			return modelAndView;
		} else {
			System.out.println("1");
			m.addAttribute("m",("Registration sucssesfull"));
			return modelAndView;
		}
	}
	@RequestMapping("/deletevalidate")
	public ModelAndView deletevalidate(@ModelAttribute("deletepass")DeletePass deletePass,Model m,@RequestParam("id")String uid,@RequestParam("pwd")String pwd){
		System.out.println("1");
		ModelAndView modelAndView=new ModelAndView("home");
		System.out.println("1");
		String sql2="select passwords from user8080 where userid = ?";
		System.out.println("1");
		String name=jdbcTemplate.queryForObject(sql2,new  Object[]{uid}, String.class);
		System.out.println("1");

	
		if ((deletePass.pwd).equals(name)) {
			System.out.println("1");
			String sql="delete from user8080 where userid=?";
			System.out.println("1");
			
			int i=jdbcTemplate.update(sql, new Object[]{uid});
			System.out.println("1");
			m.addAttribute("m",("your password is correct and your account is deleted"));
			System.out.println("1");
			return modelAndView;
			
		} else {			
			m.addAttribute("m",("sorry your password is incorrect so you cannot delete account"));
			return modelAndView;
		}
		

	}
	
	@RequestMapping(value="/validate3",method=RequestMethod.POST)
	public ModelAndView validateUser3(@ModelAttribute("login")Login login,Model m,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//String uid=request.getParameter("user");
		System.out.println("1");
		ModelAndView modelAndView=new ModelAndView("home");
		System.out.println("1");
		String sql="select passwords from user8080 where userid = ?";
		System.out.println("1");
		String name=jdbcTemplate.queryForObject(sql,new  Object[]{login.getUser()}, String.class);
		System.out.println("1");
		//String name=jdbcTemplate.query(sql, new  Object[]{login.user});
		
//		if (name.equals(pwd)) {
//			return "home";
//		} else {
//			return "error";
//		}
		//System.out.println(name+" "+login.pass);
		if((login.pass).equals(name))
		{
			//System.out.println("if");
			//RequestDispatcher rd = request.getRequestDispatcher("/WelcomeServlet");
			//rd.forward(request, response);
			m.addAttribute("m",("hello hi bye bye"+login.user));
			return modelAndView;
		}else{
			System.out.println("else");
			m.addAttribute("m",("Wrong you Username you"));
			return modelAndView;
		}
		
	}
	@RequestMapping(value="/validate4",method=RequestMethod.POST)
	public ModelAndView validateUser4(@ModelAttribute("updatepass")ChangePass changePass,Model m){
		//String uid=request.getParameter("user");
		System.out.println("1");
		ModelAndView modelAndView=new ModelAndView("home");
		System.out.println("1");
		
		System.out.println("1");
		//String name=jdbcTemplate.queryForObject(sql,new  Object[]{login.getUser()}, String.class);
//		int i=jdbcTemplate.update(sql, new Object[]{emp.getEsal(),emp.getEid()});
//		System.out.println("1");
//		//String name=jdbcTemplate.query(sql, new  Object[]{login.user});
//		
////		if (name.equals(pwd)) {
////			return "home";
////		} else {
////			return "error";
////		}
//		System.out.println(name+" "+login.pass);
//	
//		if((login.pass).equalsIgnoreCase(name))
//		{
//			System.out.println("if");
//			m.addAttribute("m",("password changed"+login.user));
//		
//			
//			return modelAndView;
//		}else{
//			System.out.println("else");
//			m.addAttribute("m",("fail"));
//			return modelAndView;
//		}
		String sql2="select passwords from user8080 where userid = ?";
		System.out.println("1");
		String name=jdbcTemplate.queryForObject(sql2,new  Object[]{changePass.getUser()}, String.class);
		System.out.println("1");

		System.out.println("1");
		if ((changePass.cpwd).equals(name)) {
		//	System.out.println("1");
			//String sql1="update user8080 set passwords=? where  userid=?";
		//	System.out.println("1");
			//int i=jdbcTemplate.update(sql1, new Object[]{changePass.getCpwd(),changePass.getUser()});
			//System.out.println("1");
		//	if (i>=1) {
			//	System.out.println("11");
				//m.addAttribute("m",("password changed"));
		//		return modelAndView;
		//	} else {
		//		System.out.println("2");
				m.addAttribute("m",("sorry password is same"));
				return modelAndView;
			
		} else {
			String sql1="update user8080 set passwords=? where  userid=?";
			int i=jdbcTemplate.update(sql1, new Object[]{changePass.getCpwd(),changePass.getUser()});
			
			if (i>=1) {
				m.addAttribute("m",("password changed"));
			return modelAndView;
			}else {
				m.addAttribute("m",("fail"));
				return modelAndView;
			}
		}
		
	}
	
}
