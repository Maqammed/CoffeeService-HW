package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	
	@Override
	public void Save(Customer customer){
		System.out.println(customer.getFirstName() +" Veri Tabanina Eklendi");
		
	}

}
	