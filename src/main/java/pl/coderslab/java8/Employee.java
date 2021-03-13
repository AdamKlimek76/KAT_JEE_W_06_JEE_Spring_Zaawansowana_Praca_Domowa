package pl.coderslab.java8;

public class Employee {

    private String name;
    private String agreement;
    private Double salary;

    public Employee(String name, String agreement, Double salary) {
        this.name = name;
        this.agreement = agreement;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", agreement='" + agreement + '\'' +
                ", salary=" + salary +
                '}';
    }
}
