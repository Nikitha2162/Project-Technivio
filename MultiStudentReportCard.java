import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine(); // consume leftover newline

        // Arrays to store data for multiple students
        String[] names = new String[numberOfStudents];
        int[] ages = new int[numberOfStudents];
        double[] mathMarks = new double[numberOfStudents];
        double[] scienceMarks = new double[numberOfStudents];
        double[] englishMarks = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        boolean[] passed = new boolean[numberOfStudents];

        // Loop to take input for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");

            System.out.print("Enter name: ");
            names[i] = input.nextLine();

            System.out.print("Enter age: ");
            ages[i] = input.nextInt();

            System.out.print("Enter Math marks: ");
            mathMarks[i] = input.nextDouble();

            System.out.print("Enter Science marks: ");
            scienceMarks[i] = input.nextDouble();

            System.out.print("Enter English marks: ");
            englishMarks[i] = input.nextDouble();

            input.nextLine(); // consume leftover newline

            // Calculate total and average
            double average = (mathMarks[i] + scienceMarks[i] + englishMarks[i]) / 3;

            // Determine grade
            if (average >= 90) {
                grades[i] = 'A';
            } else if (average >= 75) {
                grades[i] = 'B';
            } else if (average >= 60) {
                grades[i] = 'C';
            } else if (average >= 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }

            // Determine pass/fail
            passed[i] = average >= 40;
        }

        // Print all student reports
        System.out.println("\n====== STUDENT REPORTS ======");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Math Marks: " + mathMarks[i]);
            System.out.println("Science Marks: " + scienceMarks[i]);
            System.out.println("English Marks: " + englishMarks[i]);
            double total = mathMarks[i] + scienceMarks[i] + englishMarks[i];
            double average = total / 3;
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
            System.out.println("Grade: " + grades[i]);
            System.out.println("Result: " + (passed[i] ? "Passed ✅" : "Failed ❌"));
        }

        // Calculate class average
        double totalClassAverage = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            double total = mathMarks[i] + scienceMarks[i] + englishMarks[i];
            totalClassAverage += total / 3;
        }
        double classAverage = totalClassAverage / numberOfStudents;
        System.out.println("\nClass Average: " + classAverage);

        input.close();
    }
}
