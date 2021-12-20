package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Fund;
import util.Db;

public class FundDAOImpl implements IFundDAO {
	int result;
	PreparedStatement pst;
	
			
		@Override
		public int addFund(Fund transfer) {
				
			try {
				pst = Db.getDbProperties().prepareStatement(util.Query.addFund);
				pst.setLong(1, transfer.getaccount_number());
				pst.setLong(2, transfer.gettransferred_amount());
				pst.setString(3, transfer.gettransaction_narration());
				pst.setString(4, transfer.getstatus());
				pst.setLong(5, transfer.baccount_num());
				pst.setString(6,transfer.getremitter_id());
				result = pst.executeUpdate();
					
			} catch (SQLException e) {
				System.err.println("addFund() " + e.getMessage());
				e.printStackTrace();
				}
			
			return result;
		}



	}