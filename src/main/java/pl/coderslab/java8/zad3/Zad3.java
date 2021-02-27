package pl.coderslab.java8.zad3;

import java.util.function.Function;

public class Zad3 {
    public static void main(String[] args) {
        String sample="CODERSLAB";
        Function<String, String>cutWord=
            String->String.substring(2, String.length()-2).toLowerCase();
        System.out.println(cutWord(sample, cutWord));
    }

    static String cutWord(String str, Function<String, String>function){
        return function.apply(str);
    }


}


