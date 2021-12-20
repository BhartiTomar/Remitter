package dao;

import model.Beneficiary;

public interface IBeneficiaryDAO {

	int addBeneficiary(Beneficiary bbeneficiary);

	int updateBeneficiary(Beneficiary bbeneficiary);

}