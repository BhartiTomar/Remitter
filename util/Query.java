package util;

public class Query {

	// Admin process
	public static String adminlogin = "select* from admin where admin_id=? and password=? and role=?";
	// Remitter process
	public static String addaccount_details = "insert into account_details values(?)";
	public static String addremitter = "insert into remitter values(?,?,?,?,?,?)";
	public static String readremitter = "select * from remitter";
	public static String updateremitter = "update remitter registration set name=?,account_balance=?,account_type=?, where rid=?";
	public static String deleteremitter = "delete remitter registration ehere rid=?";

	//Beneficary Process
	public static String addBeneficiary = "insert into Beneficiary values(?,?,?,?,?,?,?,?)";
	public static String updatebeneficiary="update Beneficiary set bname=?,account_type=?,account_status=?,IFSC_code=?,email=?,max_limit=?,baccount_num=? where id=?";
	public static String addFund="insert into Fund values(?,?,?,?,?,?)";
}