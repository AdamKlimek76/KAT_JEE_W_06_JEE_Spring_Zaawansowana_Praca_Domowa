package pl.coderslab.java8;

public class DivideByNumberPolicy implements NumberChecker {
    private int divideNumber;

    @Override
    public boolean checkNumber(int number) {
        return (number % this.divideNumber == 0);
    }

    public int getDivideNumber() {
        return divideNumber;
    }

    public void setDivideNumber(int divideNumber) {
        this.divideNumber = divideNumber;
    }

    public DivideByNumberPolicy(int divideNumber) {
        this.divideNumber = divideNumber;
    }
}
