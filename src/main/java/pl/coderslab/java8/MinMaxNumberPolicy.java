package pl.coderslab.java8;

public class MinMaxNumberPolicy implements NumberChecker {
    private int minNumber;
    private int maxNumber;

    @Override
    public boolean checkNumber(int number) {
        return (number >= minNumber && number <= maxNumber);
    }

    public MinMaxNumberPolicy(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
