package ExampleFour;
import java.util.Date;

import adapters.MernisServiceAdapter;
import Classes.CustomerCheckManager;
import Classes.NeroCustomerManager;
import Classes.StarbuckCustomerManager;
import entities.Customer;
import interfaces.BaseCostumer;


public class Main {

	public static void main(String[] args) {
		
		Customer realCustomer = new Customer(1,"İbrahim","Çelen","14254545544",new Date(1997,2,1));
		
		Customer fakeCustomer = new Customer(2,"Gizem","Çelen","2222227777",new Date(2001,6,8));
		
		BaseCostumer neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(realCustomer);
		
		BaseCostumer starbucksCustomerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(realCustomer);
		starbucksCustomerManager.save(fakeCustomer);
	}

	}


