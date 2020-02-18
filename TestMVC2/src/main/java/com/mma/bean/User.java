package com.mma.bean;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.mma.action.UserAction;

@Component
// BEAN DE LA CLASSE USER
public class User implements Serializable {

	String login;
	String mdp;
	
	public User() {		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


}
