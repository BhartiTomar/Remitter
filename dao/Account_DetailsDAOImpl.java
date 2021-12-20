package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Account_DetailsLogin;
import util.Db;

public class Account_DetailsDAOImpl implements IAccount_DetailsDAO{
	int result;
	PreparedStatement pst;
	
	@Override
	public int addAccount_Details(Account_DetailsLogin login) {
		try {
			pst=Db.getDbProperties().prepareStatement(util.Query.addaccount_details);
			pst.setLong(1, login.getAccount_number());
			
			result = pst.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("addAccount_Details() " + e.getMessage());
		}
		return result;
		
	}

}