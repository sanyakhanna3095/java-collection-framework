package com.bridgelabz.mapInterface;

import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        // Input employees
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name:");
            String name = sc.nextLine();
            System.out.println("Enter department:");
            String department = sc.nextLine();
            employees.add(new Employee(name, department));
        }

        // Group by department
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee emp : employees) {
            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }


        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

/*
I/P->
Enter number of employees:
3
Enter employee name:
Alice
Enter department:
HR
Enter employee name:
Bob
Enter department:
IT
Enter employee name:
Carol
Enter department:
HR

O/P->
HR: [Alice, Carol]
IT: [Bob]
 */