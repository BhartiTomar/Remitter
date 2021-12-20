package controller;

import dao.Account_DetailsDAOImpl;
import model.Account_DetailsLogin;

public class Account_DetailsController {
	Account_DetailsLogin login;
	Account_DetailsDAOImpl impl = new Account_DetailsDAOImpl();
	
	public int addAccount_Details(long v) {
		login = new Account_DetailsLogin();
		return impl.addAccount_Details(login);
		
	}
}