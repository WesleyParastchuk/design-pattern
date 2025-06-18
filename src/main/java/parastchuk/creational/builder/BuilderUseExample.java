package parastchuk.creational.builder;

import parastchuk.UseExample;

public class BuilderUseExample implements UseExample {

    public void run() {
        UserDirector userDirector = new UserDirector(new User.Builder());

        User customer = userDirector.createCustomer("Alice");
        User employee = userDirector.createEmployee("Bob");
        User admin = userDirector.createAdmin("Charlie");

        System.out.println(customer.toString());
        System.out.println(employee.toString());
        System.out.println(admin.toString());
    }
}
