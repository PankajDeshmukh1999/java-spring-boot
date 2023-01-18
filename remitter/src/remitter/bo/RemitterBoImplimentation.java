package remitter.bo;

import remitter.dao.RemitterDaoImplimentation;
import remitter.entity.BeneficiaryInfo;
import remitter.entity.RemitterInfo;

public class RemitterBoImplimentation {
	
	//add remitter information 
	public int addRemitter(RemitterInfo info) {
		RemitterDaoImplimentation rdi = new  RemitterDaoImplimentation();
		int result = rdi.addRemitter(info);
		return result;
	}
	
	//add beneficiary information
	public int addbeneficiary(BeneficiaryInfo info) {
		RemitterDaoImplimentation rdi = new  RemitterDaoImplimentation();
		int result = rdi.addBeneficiary(info);
		return result;
	}
	
	public boolean Login(int accountNumber,String password) {
		RemitterDaoImplimentation rdi  = new RemitterDaoImplimentation();
		return rdi.loginRemitter(accountNumber,password);
	}

	public int fundTransfer(int rac, int bac, double amount) {
		RemitterDaoImplimentation rdi = new RemitterDaoImplimentation();
		return rdi.fundTransfer(rac,bac,amount);
	}
}
