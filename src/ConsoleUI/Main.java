package ConsoleUI;


import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapder;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.Save(new Customer(1,"Maqa","Mmed",LocalDate.of(2003,1,1),"12345678910"));
		
		BaseCustomerManager customerManager2 = new StarBucksCustomerManager(new MernisServiceAdapder());
	    customerManager2.Save(new Customer(2, "Fatma", "Gundogdu",LocalDate.of(1901,1,1), "12345678920"));
		 

	}

}
 