package model;

public class Account_DetailsLogin {
	private long account_number;
	
	
	public Account_DetailsLogin(){
			
		}
		
		public Account_DetailsLogin(long account_number) {
			super();
			this.account_number=account_number;
			
		}

		public long getAccount_number() {
			return account_number;
		}

		public void setAccount_number(long account_number) {
			this.account_number = account_number;
		}
		
}