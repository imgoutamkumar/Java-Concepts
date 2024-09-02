package PracticeProblem;

import java.util.*;

class Employee {
    private int id;
    private String designation;
    private int salary;

    public Employee() {
    }

    public Employee(
            int id,
            String designation,
            int salary) {
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }
}

public class HikeSalaryHashMap {
    // HashMap<Integer, Integer> hikedSalaries = new HashMap<>();

    public HashMap<Integer, Integer> increaseSalaries(HashMap<Integer, Integer> s, HashMap<Integer, String> d,
            HashMap<Integer, Integer> hikedSalaries) {

        Iterator<Map.Entry<Integer, String>> itr = d.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();

            if (entry.getValue().equals("manager")) {
                hikedSalaries.put(entry.getKey(), (s.get(entry.getKey()) + 5000));
            }
        }

        return hikedSalaries;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> desig = new HashMap<>();
        HashMap<Integer, Integer> sal = new HashMap<>();

        System.out.println("Enter number of Employee:");
        int numberOfEmployee = input.nextInt();
        HashMap<Integer, Integer> hikedSalaries = new HashMap<>();
        for (int index = 0; index < numberOfEmployee; index++) {
            System.out.println("Enter id:");
            int id = input.nextInt();
            System.out.println("Enter designation:");
            String designation = input.next();
            System.out.println("Enter salary:");
            int salary = input.nextInt();
            sal.put(id, salary);
            desig.put(id, designation);
        }
        input.close();
        HikeSalaryHashMap hikeSalary = new HikeSalaryHashMap();

        System.out.println(hikeSalary.increaseSalaries(sal, desig, hikedSalaries));

    }
}
