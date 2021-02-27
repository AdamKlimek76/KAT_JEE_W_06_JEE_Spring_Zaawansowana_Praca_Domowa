package pl.coderslab.advanced.abstractclass;


import java.util.ArrayList;
import java.util.List;

public class Main04 {

    public static void main(String[] args) {
        Employee employee = new Employee("martyna");
        employee.pay();
        User user2 = (User) employee;
        Payable paidUser = (Payable) user2;
        paidUser.pay();

        List<User> users = new ArrayList<>();
        users.add(new Employee("adam"));
        users.add(new Company("firma1"));
        users.add(new Employee("ewa"));
        users.add(new Company("spólka"));
        users.add(new Employee("Michał"));
        users.add(new Company("SA"));

        for (User user : users) {
            try {
                Employee employee1 = (Employee) user;
                employee1.pay();
            } catch (ClassCastException e) {
                continue;
            }
        }

    }

}
