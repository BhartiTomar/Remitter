package controller;

import dao.BeneficiaryDAOImpl;
import model.Beneficiary;

public class BeneficiaryController {
	Beneficiary beneficiary;
	BeneficiaryDAOImpl impl = new BeneficiaryDAOImpl();
	
	public int addBeneficiary(String id, String bname, String account_type, String account_status, String IFSC_code, String email, long max_limit, long baccount_num) {
		beneficiary = new Beneficiary(id,bname,account_type,account_status,IFSC_code,email,max_limit,baccount_num);
		return impl.addBeneficiary(beneficiary);
		
	}

	public int updateBeneficiary(String id, String bname, String account_type, String account_status, String IFSC_code, String email, long max_limit,long baccount_num) {
		beneficiary = new Beneficiary(id,bname,account_type,account_status,IFSC_code,email,max_limit,baccount_num);
		return impl.updateBeneficiary(beneficiary);
	}
	



}