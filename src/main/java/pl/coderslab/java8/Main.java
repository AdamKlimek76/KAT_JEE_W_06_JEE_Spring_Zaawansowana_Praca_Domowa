package pl.coderslab.java8;

public class Main {
    public static void main(String[] args) {
        MinMaxNumberPolicy minMaxNumberPolicy = new MinMaxNumberPolicy(0, 100);
        DivideByNumberPolicy divideByNumberPolicy = new DivideByNumberPolicy(2);

        NumberPortal numberPortal = new NumberPortal(minMaxNumberPolicy);
        numberPortal.checkNumber(50);
        numberPortal.checkNumber(101);
        minMaxNumberPolicy.setMaxNumber(101);
        numberPortal.checkNumber(101);

        //zmiana polityki
        numberPortal.setNumberChecker(divideByNumberPolicy);
        numberPortal.checkNumber(50);
        numberPortal.checkNumber(51);
        numberPortal.checkNumber(102);

    }
}
