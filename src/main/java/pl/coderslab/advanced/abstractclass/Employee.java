package pl.coderslab.advanced.abstractclass;

public class Employee extends User implements Payable {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void pay() {
        System.out.println(super.getName() + " paid");
    }
}
