package interfaces;

import entities.Customer;


public class BaseCostumer implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("DataBaseye ba�ar�yla eklendi...");
		
		
	}
	
	
	
	

}
