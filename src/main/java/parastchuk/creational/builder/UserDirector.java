package parastchuk.creational.builder;

public class UserDirector {
    private final User.Builder builder;

    public UserDirector(User.Builder builder) {
        this.builder = builder;
    }

    public User createCustomer(String name) {
        return builder.reset()
                .name(name)
                .role("Customer")
                .build();
    }
    
    public User createEmployee(String name) {
        return builder.reset()
                .name(name)
                .role("Employee")
                .build();
    }

    public User createAdmin(String name) {
        return builder.reset()
                .name(name)
                .role("Admin")
                .build();
    }
}
