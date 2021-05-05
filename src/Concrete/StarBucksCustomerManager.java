package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService _customerCheckSercive;

	public StarBucksCustomerManager(CustomerCheckService _customerCheckSercive) {
		super();
		this._customerCheckSercive = _customerCheckSercive;
	}
	
	@Override
	public void Save(Customer customer) {
		if(_customerCheckSercive.checkIfRealPerson(customer)) 
		{
			super.Save(customer);	
		}else {
		System.out.println("Not a valid person");
	
		}
	}
		
		
		
}


