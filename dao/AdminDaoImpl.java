package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Admin;
import util.Db;
import util.Query;

public class AdminDaoImpl implements IAdminDAO {
	int result;
	PreparedStatement pst;

	
	public int adminLogin(Admin admin) {
		try {
			pst = Db.getDbProperties().prepareStatement(Query.adminlogin);
			pst.setString(1, admin.getUsername());
			pst.setString(2, admin.getPassword());
			pst.setString(3, admin.getRole());
			ResultSet rs=pst.executeQuery();
			while (rs.next()) {
				  result=1;
				 
			}
		} catch(SQLException e) {
			System.err.println("addadmin" + e.getMessage());
			e.printStackTrace();
		} 
		return result;
	}
}