import java.util.Scanner;  // Import Scanner to take input from the user

public class StudentReport {
    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Asking for student's details
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        
        System.out.print("Enter student age: ");
        int age = input.nextInt();
        
        System.out.print("Enter marks in Math: ");
        double mathMarks = input.nextDouble();
        
        System.out.print("Enter marks in Science: ");
        double scienceMarks = input.nextDouble();
        
        System.out.print("Enter marks in English: ");
        double englishMarks = input.nextDouble();
        
        // Calculate total and average
        double total = mathMarks + scienceMarks + englishMarks;
        double average = total / 3;
        
        // Determine grade using if-else
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Determine pass/fail
        boolean isPassed = average >= 40;
        
        // Display the report
        System.out.println("\n====== Student Report ======");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (isPassed ? "Passed ✅" : "Failed ❌"));
        
        // Close the scanner to avoid memory leaks
        input.close();
    }
}
