package pl.coderslab.java8.zad2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Zad2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");
        Predicate<String>wordOverFourLetters=
                String -> String.length()>4;
        List<String>listOverFourLetters=filterList(list, wordOverFourLetters);
        listOverFourLetters.stream()
                .forEach(System.out::println);

        Predicate<String>wordContainsLetter=
                String->String.contains("b");
        List<String>wordListWithLetter=filterList(list, wordContainsLetter);
        wordListWithLetter.stream()
                .forEach(System.out::println);

        Predicate<String>wordWithLetterAtTheEnd=
                String->String.endsWith("a");
        List<String>wordListWithLetterAtTheEnd=filterList(list, wordWithLetterAtTheEnd);
        wordListWithLetterAtTheEnd.stream()
                .forEach(System.out::println);


    }

    static List<String>filterList(List<String>list, Predicate<String>filter){
        return list.stream()
                .filter(str->filter.test(str))
                .collect(Collectors.toList());
    }

}
