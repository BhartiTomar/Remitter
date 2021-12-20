package model;

public class Beneficiary {
	private String id;
	private String bname;
	private String account_type;
	private String account_status;
	private String IFSC_code;
	private String email;
	private long max_limit;
	private long baccount_num;
	
public Beneficiary() {
		
	}
	public Beneficiary(String id, String bname, String account_type, String account_status, String IFSC_code, String email, long max_limit, long baccount_num) {
		super();
		this.id=id;
		this.bname=bname;
		this.account_type=account_type;
		this.account_status=account_status;
		this.IFSC_code=IFSC_code;
		this.email=email;
		this.max_limit=max_limit;
		this.baccount_num=baccount_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getAccount_status() {
		return account_status;
	}
	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	public String getIFSC_code() {
		return IFSC_code;
	}
	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMax_limit() {
		return max_limit;
	}
	public void setMax_limit(long max_limit) {
		this.max_limit = max_limit;
	}
	public long getBaccount_num() {
		return baccount_num;
	}
	public void setBaccount_num(long baccount_num) {
		this.baccount_num = baccount_num;
	}
	
	@Override
	public String toString() {
		return "id: " + id + " bname: " + bname + "account_type: " + account_type + " account_status: " + account_status + "IFSC_code: " + IFSC_code + "email: " + email + "max_limit: " + max_limit + "baccount_num: " + baccount_num ;
	}


}