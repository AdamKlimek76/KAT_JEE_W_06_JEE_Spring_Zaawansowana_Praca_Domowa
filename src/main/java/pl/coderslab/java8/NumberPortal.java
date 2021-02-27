package pl.coderslab.java8;

public class NumberPortal {

    private NumberChecker numberChecker;

    public NumberPortal(NumberChecker numberChecker) {
        this.numberChecker = numberChecker;
    }

    public void setNumberChecker(NumberChecker numberChecker) {
        this.numberChecker = numberChecker;
    }

    public void checkNumber(int number) {
        if (numberChecker.checkNumber(number)) {
            System.out.println("Poprawna liczba");
        } else {
            System.out.println("Niepoprawna liczba");
        }
    }
}
