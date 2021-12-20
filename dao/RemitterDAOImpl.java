package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Remitter;
import util.Db;

public class RemitterDAOImpl implements IRemitterDAO {
	int result;
	PreparedStatement pst;



	@Override
	public int addRemitter(Remitter rremitter) {
		try {
			pst = Db.getDbProperties().prepareStatement(util.Query.addremitter);
			pst.setString(1, rremitter.getID());
			pst.setString(2, rremitter.getPassword());
			pst.setString(3, rremitter.getName());
			pst.setString(4, rremitter.getEmail_Id());
			pst.setString(5, rremitter.getAccount_Type());
			pst.setLong(6, rremitter.getAccount_Number());
			result = pst.executeUpdate();
			//throw new AccountDoesNotExists();
		} catch (SQLException e) {
			System.err.println("addRemitter() " + e.getMessage());
		}
		return result;
	}
	
	@Override
	public int updateRemitter(Remitter rremitter) {
		try {
			pst = Db.getDbProperties().prepareStatement(util.Query.updateremitter);
			pst.setString(6, rremitter.getID());
			pst.setString(1, rremitter.getPassword());
			pst.setString(2, rremitter.getName());
			pst.setString(3, rremitter.getEmail_Id());
			pst.setString(4, rremitter.getAccount_Type());
			pst.setLong(5, rremitter.getAccount_Number());

			result = pst.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("updateRemitter() " + e.getMessage());
			
		}
		return result;
		
	}

}