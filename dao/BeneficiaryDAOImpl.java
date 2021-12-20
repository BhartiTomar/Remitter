package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Beneficiary;
import util.Db;

public class BeneficiaryDAOImpl implements IBeneficiaryDAO {
	
		int result;
		PreparedStatement pst;

		public int addBeneficiary(Beneficiary bbeneficiary) {
			try {
				pst = Db.getDbProperties().prepareStatement(util.Query.addBeneficiary);
				pst.setString(1, bbeneficiary.getId());
				pst.setString(2, bbeneficiary.getBname());
				pst.setString(3, bbeneficiary.getAccount_type());
				pst.setString(4, bbeneficiary.getAccount_status());
				pst.setString(5, bbeneficiary.getIFSC_code());
				pst.setString(6, bbeneficiary.getEmail());
				pst.setLong(7, bbeneficiary.getMax_limit());
				pst.setLong(8, bbeneficiary.getBaccount_num());
				result = pst.executeUpdate();
				//throw new AccountDoesNotExists();
			} catch (SQLException e) {
				System.err.println("addBeneficiary() " + e.getMessage());
			}
			
			return result;
		}

		@Override
		public int updateBeneficiary(Beneficiary bbeneficiary) {
			try {
				pst = Db.getDbProperties().prepareStatement(util.Query.updateremitter);
				pst.setString(8, bbeneficiary.getId());
				pst.setString(1, bbeneficiary.getBname());
				pst.setString(2, bbeneficiary.getAccount_type());
				pst.setString(3, bbeneficiary.getAccount_status());
				pst.setString(4, bbeneficiary.getIFSC_code());
				pst.setString(5, bbeneficiary.getEmail());
				pst.setLong(6, bbeneficiary.getBaccount_num());
				pst.setLong(7, bbeneficiary.getMax_limit());
				result = pst.executeUpdate();
			} catch (SQLException e) {
				System.err.println("updateBeneficiary() " + e.getMessage());
			}
			
			return result;
		}

}