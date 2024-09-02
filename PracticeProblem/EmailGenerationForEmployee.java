package PracticeProblem;

import java.util.*;

class Employee {

    private String firstName;
    private String middleName;
    private String lastName;

    public Employee() {
    }

    public Employee(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

public class EmailGenerationForEmployee {

    public String solution(String S, String C) {

        String eList[] = S.split("; ");
        for (String element : eList) {
            String name[] = element.split(" ");
            if (name.length > 2) {
                String fName = name[0];
                String lName = name[2];
            } else {
                String fName = name[0];
                String lName = name[1];
            }
            

        }
        return null;
    };

    public static void main(String[] args) {

        String employeeList = "john doe; Peter Reniamin Parker; Mary Jane; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
    }
}
