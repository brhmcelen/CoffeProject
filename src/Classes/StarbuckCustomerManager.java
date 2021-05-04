package Classes;
import entities.Customer;
import interfaces.BaseCostumer;
import interfaces.CustomerCheck;



public class StarbuckCustomerManager extends BaseCostumer{
	
	CustomerCheck customerCheck;
	
	public StarbuckCustomerManager(CustomerCheck customerCheck) {
		
		
		this.customerCheck = customerCheck;
		
			
	}
	
	@Override
	
	public void save(Customer customer) {
		
		if (customerCheck.CheckPerson(customer)) {
			
			System.out.println("Kay�t Ba�ar�l�...");
			super.save(customer);
			
			
			
		}else {
			
			System.out.println("Kay�t Ba�ar�s�z... Ki�i Bulunamad�...");
			
			
		}
		
		
	}
	
	
	

}
