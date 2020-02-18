package com.mma;

import java.util.Iterator;

import org.springframework.stereotype.Controller;
import com.mma.action.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mma.action.UserAction;
import com.mma.bean.User;

@Controller
public class UserController {

	@RequestMapping("addUser")
	public ModelAndView addUser(@RequestParam("userLogin") String login, @RequestParam("userMdp") String mdp) {
		
		ModelAndView mv = new ModelAndView();
		
		User user = new User();
		UserAction userAction = new UserAction();
		
		user.setLogin(login);
		user.setMdp(mdp);
		
		boolean isUserExist = userAction.isUserExist(user);
		
		if(isUserExist == false) {
			userAction.addUser(user);
		}
			
		mv.addObject("loginUser", user.getLogin());
		mv.addObject("isUserExist", isUserExist);
		
		mv.setViewName("enregistrer.jsp");
	
		System.out.println("Ajout OK");
		
		return mv;

	}
	
	@RequestMapping("listUsers")
	public ModelAndView listUsers() {
		
		ModelAndView mv = new ModelAndView();

		UserAction userAction = new UserAction();
		
		System.out.println("Nb Users : " + userAction.getListUsers().size());
		
		
		mv.addObject("listUsers", userAction.getListUsers());
		mv.setViewName("listUsers.jsp");
	
		return mv;

	}
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam ("loginUser") String loginUser){
		
		System.out.println("suppression");
		
		ModelAndView mv = new ModelAndView();

		UserAction userAction = new UserAction();
		
		userAction.deleteUser(loginUser);
		
		System.out.println("Nouvelle taille users " + userAction.getListUsers().size());
		
		mv.addObject("listUsers", userAction.getListUsers());
		mv.setViewName("listUsers.jsp");
	
		return mv;

	}
	

	
	
}
