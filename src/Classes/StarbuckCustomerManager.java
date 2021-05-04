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
			
			System.out.println("Kayýt Baþarýlý...");
			super.save(customer);
			
			
			
		}else {
			
			System.out.println("Kayýt Baþarýsýz... Kiþi Bulunamadý...");
			
			
		}
		
		
	}
	
	
	

}
