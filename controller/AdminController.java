package controller;

import dao.AdminDaoImpl;
import model.Admin;

public class AdminController {
	AdminDaoImpl impl = new AdminDaoImpl();

	public int addadmin(String admin_id, String password, String role) {
		Admin admin = new Admin(admin_id, password, role);
		return impl.adminLogin(admin);
	}

	public int addacccountnumber(long parseLong) {

		return 0;
	}

}