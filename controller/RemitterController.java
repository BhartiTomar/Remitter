package controller;

import dao.RemitterDAOImpl;
import model.Remitter;

public class RemitterController {
	Remitter login;
	RemitterDAOImpl impl = new RemitterDAOImpl();
	
	public int addRemitter(String ID, String password, String Name, String v1, String v12, long l) {
		login = new Remitter(ID, password, Name, v1, v12, l);
		return impl.addRemitter(login);
		
	}
	
	public int updateRemitter(String ID, String password, String Name, String Email_Id, String Account_Type, long Account_Number) {
		login = new Remitter(ID, password, Name, Email_Id, Account_Type, Account_Number);
		return impl.updateRemitter(login);
	}
	

}