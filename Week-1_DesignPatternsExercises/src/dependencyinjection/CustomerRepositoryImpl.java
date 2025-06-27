package dependencyinjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String customerId) {
        // Simulate DB lookup
        return "Customer[ID=" + customerId + ", Name=John Doe]";
    }
}
