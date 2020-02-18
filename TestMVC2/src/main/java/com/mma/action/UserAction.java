package com.mma.action;

import java.util.ArrayList;
import java.util.Iterator;

import com.mma.bean.User;

// LES ACTIONS DE LA CLASSE USER
public class UserAction   {

	String login;
	String mdp;
		  
	private static ArrayList<User> listUsers = new ArrayList<User>();
	
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
	
	
	public ArrayList<User> getListUsers() {
		return listUsers;
	}

	public void setListUsers(ArrayList<User> listUsers) {
		this.listUsers = listUsers;
	}	


	public boolean isUserExist(User user) {		
		
		boolean isUserExist = false;
		
		Iterator<User> usersIterator = listUsers.iterator();
		
		while(usersIterator.hasNext()) {
		    if(usersIterator.next().getLogin().equals(login)) {
		    	isUserExist = true;
		    }		   
		}	
		
		return isUserExist;
	}
	
	/**
	 * @param user
	 * @return
	 * Ajouter un Utilisateur
	 */
	public ArrayList<User> addUser(User user) {		
		
		listUsers.add(user);
		
		return listUsers;
	}

	//Supprimer un utilisateur
	/**
	 * @param login
	 * Supprimer un utilisateur en fonction de son login
	 */
	public void deleteUser(String login) {
		
		System.out.println("deleteUser");
		System.out.println("login " + login);
		Iterator<User> usersIterator = listUsers.iterator();
		
		while(usersIterator.hasNext()) {
		    if(usersIterator.next().getLogin().equals(login)) {
		    	System.out.println("login a supprimé : " + login);
		    	usersIterator.remove();
		    }		   
		}	
	}	
}
