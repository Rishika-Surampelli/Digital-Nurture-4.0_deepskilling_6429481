package dependencyinjection;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void printCustomer(String customerId) {
        String customerInfo = customerRepository.findCustomerById(customerId);
        System.out.println("Fetched Customer Info: " + customerInfo);
    }
}
