package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapder implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		if(customer.getFirstName().length()<2) {
			System.out.println("OK");
			return false;
		}else {
			System.out.println("NOT OK");
			return true;
		}
		
	}

}
