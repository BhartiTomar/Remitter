package model;

public class Remitter {
	private String ID;
	private String password;
	private String Name;
	private String Email_Id;
	private String Account_Type;
	private long Account_Number;
	

		
	
	public Remitter(String ID, String password, String Name, String l, String m, long v) {
		super();
		this.ID=ID;
		this.password=password;
		this.Name=Name;
		this.Email_Id=l;
		this.Account_Type=m;
		this.Account_Number=v;	
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public String getAccount_Type() {
		return Account_Type;
	}
	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}
	public long getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(long account_Number) {
		Account_Number = account_Number;
	}
	
	@Override
	public String toString() {
		return "ID: " + ID + ", password: " + password + "Name: " + Name + ", Email_Id: " + Email_Id + "Account_Type: " + Account_Type + "Account_Number: " + Account_Number ;
	}
			
	
}