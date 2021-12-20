package controller;

import dao.FundDAOImpl;
import model.Fund;

public class FundController {
	Fund transfer;
	  FundDAOImpl imp1=new FundDAOImpl();
   public int addFund(Long account_number,Long transferred_amount,String transaction_narration,String status,Long baccount_num,String remitter_id) {
  	 transfer = new Fund(account_number,transferred_amount,transaction_narration,status,baccount_num,remitter_id);
    	return imp1.addFund(transfer);
		
    }
}