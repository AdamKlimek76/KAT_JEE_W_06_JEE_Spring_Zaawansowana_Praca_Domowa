package pl.coderslab.advanced.abstractclass;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        List<Person>personList=new ArrayList<>();
        personList.add(new Person("adam", "klimek"));
        personList.add(new Person ("ewelina", "kula"));
        personList.add(new Person ("ola", "krzempek"));
        personList.add(new Person ("jacek", "awarowski"));

        Collections.sort(personList);
        personList.stream()
                .forEach(System.out::println);


    }



}
