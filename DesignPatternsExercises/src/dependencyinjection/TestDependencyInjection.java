package dependencyinjection;

public class TestDependencyInjection {
    public static void main(String[] args) {
        // Create repository (dependency)
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject into service
        CustomerService service = new CustomerService(repository);

        // Use service
        service.printCustomer("C102");
    }
}
