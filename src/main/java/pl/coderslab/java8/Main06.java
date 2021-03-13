package pl.coderslab.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main06 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Path path1 = Paths.get("earnings.txt");
        try {
            for (String line : Files.readAllLines(path1)) {
                List<String> parts = Arrays.asList(line.split("[;,]"));
                if (parts.size() == 4) {
                    String nameOnFirstPlace = parts.get(0).trim();
                    String nameOnSecondPlace = parts.get(1).trim();
                    String name = nameOnFirstPlace + " " + nameOnSecondPlace;
                    String strSalary = parts.get(2).trim();
                    Double salary = 0.00;
                    if (strSalary.contains(" zł")) {
                        salary = Double.parseDouble(strSalary.substring(0, strSalary.length() - 3));
                    }
                    String agreement = parts.get(3).trim();
                    employees.add(new Employee(name, agreement, salary));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        employees.stream()
                .filter(employee -> !employee.getName().contains("Kowalsk"))
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(System.out::println);
    }
}
