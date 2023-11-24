package com.snob.universityconsole;

import com.snob.universityconsole.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@AllArgsConstructor
@SpringBootApplication
public class UniversityConsoleApplication implements CommandLineRunner {
    private final UniversityService universityService;

    public static void main(String[] args) {
        SpringApplication.run(UniversityConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter your command (type 'exit' to quit): ");
            String userInput = scanner.nextLine();

            String[] inputParts = userInput.trim().split(" ");

            switch (inputParts[0].toLowerCase()) {
                case "who" -> handleWhoCommand(userInput);
                case "global" -> handleGlobalCommand(userInput);
                case "show" -> handleShowCommand(userInput);
                case "exit" -> running = false;
                default -> System.out.println("Command not recognized.");
            }
        }
    }

    private void handleWhoCommand(String command) {
        String showKeyword =  "Who is head of department ";
        String trim = command.substring(showKeyword.length()).trim();
        if (universityService.isValidDepartment(trim)) {
            System.out.println("Head of " + trim + " department is " + universityService.findHeadOfDepartment(trim));
        }else {
            System.out.println("Invalid department name");
        }
    }
    private void handleGlobalCommand(String command) {
        String showKeyword =  "Global search by ";
        System.out.println(universityService.globalSearch(command.substring(showKeyword.length()).trim()));
    }
    private void handleShowCommand(String command) {
        if (command.endsWith("statistics") ) {
            String trim = command.substring(5, command.indexOf(" statistics")).trim();
            if (universityService.isValidDepartment(trim)) {
                System.out.println(universityService.showDepartmentStatistics(trim));
            }else {
                System.out.println("Invalid department name");
            }
        } else if (command.startsWith("Show the average salary")) {
            String showKeyword = "Show the average salary for the department ";
            String trim = command.substring(showKeyword.length()).trim();
            if (universityService.isValidDepartment(trim)) {
                System.out.println(" The average salary of " + trim + " is " + universityService.findAverageSalaryByDepartment(trim));
            }else {
                System.out.println("Invalid department name");
            }
        } else if (command.startsWith("Show count of employee")) {
            String showKeyword =  "Show count of employee for ";
            String trim = command.substring(showKeyword.length()).trim();
            if (universityService.isValidDepartment(trim)) {
                System.out.println(universityService.countEmployeesByDepartment(trim));
            }else {
                System.out.println("Invalid department name");
            }
        } else {
            System.out.println("Command not recognized.");
        }
    }
}
