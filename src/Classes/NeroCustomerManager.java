package Classes;
import entities.Customer;
import interfaces.BaseCostumer;
import interfaces.CustomerCheck;


public class NeroCustomerManager extends BaseCostumer{
	
	CustomerCheck customerCheck;
	
	public NeroCustomerManager(CustomerCheck customerCheckService) {
		this.customerCheck = customerCheckService;
	}
	
	@Override
	
	public void save(Customer customer) {
		if(customerCheck.CheckPerson(customer)) {
			
			System.out.println("Nero kay�t ba�ar�l�...");
			
			super.save(customer);
			
			
		}else {
			System.out.println("Nero kay�t ba�ar�s�z.. Ki�i bulunamad�..");
		}
	}
	

	
	

}
