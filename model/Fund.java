package model;

	
	public class Fund {
	
		private Long account_number;
		private Long transferred_amount;
		private String transaction_narration;
		private String status;
		private Long baccount_num;
		private String remitter_id;
		public Fund() {
			
		}
		public Fund(Long account_number,Long transferred_amount,String transaction_narration,String status,Long baccount_num,String remitter_id) {
			super();
			this.account_number=account_number;
			this.transferred_amount=transferred_amount;
			this.transaction_narration=transaction_narration;
			this.status=status;
			this.baccount_num=baccount_num;
			this.remitter_id=remitter_id;
		}
	    
	        public Long getaccount_number() {
			return account_number;
		}


		    public void setaccount_number(Long account_number) {
			this.account_number = account_number;
		}
		    public Long gettransferred_amount() {
			return transferred_amount;
			}
		    public void settransferred_amount(Long transferred_amount) {
			this.transferred_amount = transferred_amount;
			}
			public String gettransaction_narration() {
			return transaction_narration;
				}
			public void settransaction_narration(String transaction_narration) {
			this.transaction_narration = transaction_narration;
				}
		    public String getstatus() {
			return status;
						}
	        public void setstatus(String status) {
			this.status = status;
						}
			public Long baccount_num() {
			return baccount_num;
							}
	        public void setbeneficiary_account_number(Long baccount_num) {
			this.baccount_num = baccount_num;
							}
			public String getremitter_id() {
			return remitter_id;
								}
			public void setremitter_id(String remitter_id) {
			this.remitter_id = remitter_id;
								}
	    @Override
		public String toString() {
			return "Fundregistration [ account_number=" + account_number + ", transferred_amount=" + transferred_amount +", transaction_narration=" + transaction_narration +", status=" + status + ",baccount_num= " + baccount_num + ",remitter_id=" + remitter_id +"]";
		}
	}