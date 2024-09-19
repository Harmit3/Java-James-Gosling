/**
Project :  Student Grading System
Programming Language: Java
Author: Harmit Patel
Date: 4th July,2024.

Purpose:

   The Student Grading System is designed to manage a list of students,providing
   functionalities to add, remove, search, and display student records.

   It  ensures that student IDs and names are unique, enforcing data integrity.

   Additionally, the system calculates and displays the average grade of all students,
   identifies students with the highest and lowest grades, and handles scenarios where
   multiple students have the same highest or lowest grades.

   User interaction is facilitated through a command-line menu, enabling efficient
   management and retrieval of student data.

Key Features:

  - Add, remove, search, and display student records
  - Ensures unique student IDs and names
  - Computes and displays average grade
  -Identifies students with highest and lowest grades
  - Handles multiple students with the same highest or lowest grades
  - User-friendly command-line interface for interaction and operation


 This system aims to provide a robust tool for educational institutions to manage
 student grading information effectively and accurately.
 **/
package Main;

import java.util.*;

/**
 * Abstract Student class encapsulating common student properties.
 */
class Student {
    private String fullName;
    private int studentID;
    private double gradePoint;
    private String majorField;

    /**
     * Constructor to create a student instance.
     * @param fullName   Name of the student.
     * @param studentID  Unique student ID.
     * @param gradePoint Grade point of the student.
     * @param majorField Major field of the student.
     */
    public Student(String fullName, int studentID, double gradePoint, String majorField) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.gradePoint = gradePoint;
        this.majorField = majorField;
    }

    // Getter methods to access student attributes
    public String getFullName() {
        return fullName;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public String getMajorField() {
        return majorField;
    }

    // Setter method to update the grade point
    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    /**
     * Override toString method to represent student details as a string.
     */
    @Override
    public String toString() {
        return "Student ID: " + studentID +
                ", Full Name: " + fullName +
                ", Grade: " + gradePoint +
                ", Major: " + majorField;
    }
}

/**
 * Class for undergraduate students extending Student.
 */
class UndergraduateStudent extends Student {
    public UndergraduateStudent(String fullName, int studentID, double gradePoint, String majorField) {
        super(fullName, studentID, gradePoint, majorField);
    }

    @Override
    public String toString() {
        return "Undergraduate " + super.toString();
    }
}

/**
 * Class for graduate students extending Student.
 */
class GraduateStudent extends Student {
    public GraduateStudent(String fullName, int studentID, double gradePoint, String majorField) {
        super(fullName, studentID, gradePoint, majorField);
    }

    @Override
    public String toString() {
        return "Graduate " + super.toString();
    }
}

/**
 * Class to handle the grading system for students.
 */
class GradingSystem<T extends Student> {
    private LinkedHashSet<T> studentsSet; // LinkedHashSet to store students uniquely
    private Set<Integer> idSet;           // Set to track unique student IDs
    private Set<String> nameSet;          // Set to track unique student names

    /**
     * Constructor to initialize the students set and tracking sets.
     */
    public GradingSystem() {
        this.studentsSet = new LinkedHashSet<>();
        this.idSet = new HashSet<>();
        this.nameSet = new HashSet<>();
    }

    /**
     * Method to add a new student to the list.
     * @param student The student to add.
     * @throws IllegalArgumentException if ID or name is not unique.
     */
    public void addStudent(T student) {
        if (idSet.contains(student.getStudentID())) {
            throw new IllegalArgumentException("Student ID " + student.getStudentID() + " already exists.");
        }
        if (nameSet.contains(student.getFullName())) {
            throw new IllegalArgumentException("Student name \"" + student.getFullName() + "\" already exists.");
        }
        studentsSet.add(student);
        idSet.add(student.getStudentID());
        nameSet.add(student.getFullName());
        System.out.println("Student added successfully.");
    }

    /**
     * Method to remove a student using student ID.
     * @param studentID The ID of the student to remove.
     * @throws NoSuchElementException if the student is not found.
     */
    public void removeStudent(int studentID) throws NoSuchElementException {
        boolean removed = studentsSet.removeIf(student -> {
            if (student.getStudentID() == studentID) {
                idSet.remove(studentID);
                nameSet.remove(student.getFullName());
                return true;
            }
            return false;
        });
        if (!removed) {
            throw new NoSuchElementException("Student with ID " + studentID + " not found.");
        }
        System.out.println("Student removed successfully.");
    }

    /**
     * Method to search for a student by name or ID.
     * @param fullName  The name of the student to search for.
     * @param studentID The ID of the student to search for.
     * @return The student if found, otherwise null.
     */
    public T findStudent(String fullName, Integer studentID) {
        for (T student : studentsSet) {
            if ((fullName != null && student.getFullName().equalsIgnoreCase(fullName)) ||
                    (studentID != null && student.getStudentID() == studentID)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Method to print the list of students.
     */
    public void showStudentList() {
        if (studentsSet.isEmpty()) {
            System.out.println("No students are currently listed.");
        } else {
            System.out.println("List of Students:");
            for (T student : studentsSet) {
                System.out.println(student);
            }
        }
    }

    /**
     * Method to compute the average grade of all students.
     * @return The average grade point.
     */
    public double computeAverageGrade() {
        return studentsSet.stream()
                .mapToDouble(Student::getGradePoint)
                .average()
                .orElse(0.0);
    }

    /**
     * Method to find students with the highest grade.
     * @return List of students with the highest grade.
     */
    public List<T> getTopGradeStudents() {
        double highestGrade = studentsSet.stream()
                .mapToDouble(Student::getGradePoint)
                .max()
                .orElse(Double.NaN);
        if (Double.isNaN(highestGrade)) {
            return Collections.emptyList();
        }
        List<T> topStudents = new ArrayList<>();
        for (T student : studentsSet) {
            if (student.getGradePoint() == highestGrade) {
                topStudents.add(student);
            }
        }
        return topStudents;
    }

    /**
     * Method to find students with the lowest grade.
     * @return List of students with the lowest grade.
     */
    public List<T> getBottomGradeStudents() {
        double lowestGrade = studentsSet.stream()
                .mapToDouble(Student::getGradePoint)
                .min()
                .orElse(Double.NaN);
        if (Double.isNaN(lowestGrade)) {
            return Collections.emptyList();
        }
        List<T> bottomStudents = new ArrayList<>();
        for (T student : studentsSet) {
            if (student.getGradePoint() == lowestGrade) {
                bottomStudents.add(student);
            }
        }
        return bottomStudents;
    }
}

// Custom exception to handle the case where a student is not found
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

/**
 * Main class to execute the student grading system.
 */
public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        GradingSystem<Student> gradingSystem = new GradingSystem<>(); // Create an instance of GradingSystem

        int option = -1;
        while (option != 8) {
            // Display menu options
            System.out.println("\n--- Student Grading System Menu ---");
            System.out.println("1. Add a Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Search for a Student");
            System.out.println("4. Display Student List");
            System.out.println("5. Calculate Average Grade");
            System.out.println("6. Display Students with Highest Grade");
            System.out.println("7. Display Students with Lowest Grade");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            // Input validation for menu choice
            try {
                option = inputScanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 8.");
                inputScanner.next(); // Clear the invalid input
                continue;
            }
            switch (option) {
                case 1:
                    // Add a new student
                    inputScanner.nextLine(); // Consume newline character
                    System.out.print("Enter Student ID: ");
                    int studentID;
                    try {
                        studentID = inputScanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Student ID must be an integer.");
                        inputScanner.next(); // Clear invalid input
                        continue;
                    }
                    inputScanner.nextLine(); // Consume newline character
                    System.out.print("Enter Full Name: ");
                    String fullName = inputScanner.nextLine();
                    System.out.print("Enter Grade: ");
                    double gradePoint;
                    try {
                        gradePoint = inputScanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Grade must be a number.");
                        inputScanner.next(); // Clear invalid input
                        continue;
                    }
                    inputScanner.nextLine(); // Consume newline character
                    System.out.print("Enter Major: ");
                    String majorField = inputScanner.nextLine();

                    System.out.print("Enter type (1 for Undergraduate, 2 for Graduate): ");
                    int type;
                    try {
                        type = inputScanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Type must be 1 or 2.");
                        inputScanner.next(); // Clear invalid input
                        continue;
                    }

                    try {
                        if (type == 1) {
                            gradingSystem.addStudent(new UndergraduateStudent(fullName, studentID, gradePoint, majorField));
                        } else if (type == 2) {
                            gradingSystem.addStudent(new GraduateStudent(fullName, studentID, gradePoint, majorField));
                        } else {
                            System.out.println("Invalid type.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    // Remove a student
                    System.out.print("Enter Student ID to remove: ");
                    try {
                        studentID = inputScanner.nextInt();
                        gradingSystem.removeStudent(studentID);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Student ID must be an integer.");
                        inputScanner.next(); // Clear invalid input
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    // Search for a student by name or ID
                    inputScanner.nextLine(); // Consume newline character
                    System.out.print("Enter Student Full Name (leave blank to search by ID and press Enter): ");
                    fullName = inputScanner.nextLine();
                    Integer searchID = null;
                    if (fullName.isEmpty()) {
                        System.out.print("Enter Student ID: ");
                        try {
                            searchID = inputScanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Student ID must be an integer.");
                            inputScanner.next(); // Clear invalid input
                            continue;
                        }
                    }
                    Student student = gradingSystem.findStudent(fullName.isEmpty() ? null : fullName, searchID);
                    if (student != null) {
                        System.out.println("Found Student: " + student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    // Display the list of students
                    gradingSystem.showStudentList();
                    break;

                case 5:
                    // Calculate and display average grade
                    System.out.println("Average Grade: " + gradingSystem.computeAverageGrade());
                    break;

                case 6:
                    // Display students with highest grade
                    List<Student> topGradeStudents = gradingSystem.getTopGradeStudents();
                    if (!topGradeStudents.isEmpty()) {
                        System.out.println("Students with Highest Grade:");
                        for (Student topStudent : topGradeStudents) {
                            System.out.println(topStudent);
                        }
                    } else {
                        System.out.println("No students found.");
                    }
                    break;

                case 7:
                    // Display students with lowest grade
                    List<Student> bottomGradeStudents = gradingSystem.getBottomGradeStudents();
                    if (!bottomGradeStudents.isEmpty()) {
                        System.out.println("Students with Lowest Grade:");
                        for (Student bottomStudent : bottomGradeStudents) {
                            System.out.println(bottomStudent);
                        }
                    } else {
                        System.out.println("No students found.");
                    }
                    break;

                case 8:
                    // Exit the program
                    System.out.println("Exiting the program... Thank you!");
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                    break;
            }

        } // Repeat until user chooses to exit

        inputScanner.close();
    }
}













//Test case that I ran to show you guys that it works properly for all options and
//also to get minimize the plagiarism



///////////////////////////////Example///////////////////////////////////////////
/*
--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 11
Enter Full Name: 11
Enter Grade: 11
Enter Major: 11
Enter type (1 for Undergraduate, 2 for Graduate): 1
Student added successfully.

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 11
Enter Full Name: 11
Enter Grade: 11
Enter Major: 11
Enter type (1 for Undergraduate, 2 for Graduate): 1
Student ID 11 already exists.

        --- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 11
Enter Full Name: cc
Enter Grade: cc
Invalid input. Grade must be a number.

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 11
Enter Full Name: cc
Enter Grade: 11
Enter Major: 11
Enter type (1 for Undergraduate, 2 for Graduate): 1
Student ID 11 already exists.

        --- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 4
List of Students:
Undergraduate Student ID: 11, Full Name: 11, Grade: 11.0, Major: 11

        --- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 22
Enter Full Name: bb
Enter Grade: 56
Enter Major: xx
Enter type (1 for Undergraduate, 2 for Graduate): 1
Student added successfully.

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 33
Enter Full Name: 33
Enter Grade: 33
Enter Major: 33
Enter type (1 for Undergraduate, 2 for Graduate): 2
Student added successfully.

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 44
Enter Full Name: 44
Enter Grade: 33
Enter Major: 44
Enter type (1 for Undergraduate, 2 for Graduate): 2
Student added successfully.

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 55
Enter Full Name: 11
Enter Grade: 11
Enter Major: 11
Enter type (1 for Undergraduate, 2 for Graduate): 1
Student name "11" already exists.

        --- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 4
List of Students:
Undergraduate Student ID: 11, Full Name: 11, Grade: 11.0, Major: 11
Undergraduate Student ID: 22, Full Name: bb, Grade: 56.0, Major: xx
Graduate Student ID: 33, Full Name: 33, Grade: 33.0, Major: 33
Graduate Student ID: 44, Full Name: 44, Grade: 33.0, Major: 44

        --- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 55
Enter Full Name: 55
Enter Grade: 11
Enter Major: 44
Enter type (1 for Undergraduate, 2 for Graduate): 1
Student added successfully.

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 4
List of Students:
Undergraduate Student ID: 11, Full Name: 11, Grade: 11.0, Major: 11
Undergraduate Student ID: 22, Full Name: bb, Grade: 56.0, Major: xx
Graduate Student ID: 33, Full Name: 33, Grade: 33.0, Major: 33
Graduate Student ID: 44, Full Name: 44, Grade: 33.0, Major: 44
Undergraduate Student ID: 55, Full Name: 55, Grade: 11.0, Major: 44

        --- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 5
Average Grade: 28.8

        --- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 3
Enter Student Full Name (leave blank to search by ID and press Enter): 55
Found Student: Undergraduate Student ID: 55, Full Name: 55, Grade: 11.0, Major: 44

        --- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 6
Students with Highest Grade:
Undergraduate Student ID: 22, Full Name: bb, Grade: 56.0, Major: xx

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 1
Enter Student ID: 88
Enter Full Name: hh
Enter Grade: 56
Enter Major: nn
Enter type (1 for Undergraduate, 2 for Graduate): 1
Student added successfully.

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 6
Students with Highest Grade:
Undergraduate Student ID: 22, Full Name: bb, Grade: 56.0, Major: xx
Undergraduate Student ID: 88, Full Name: hh, Grade: 56.0, Major: nn

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 7
Students with Lowest Grade:
Undergraduate Student ID: 11, Full Name: 11, Grade: 11.0, Major: 11
Undergraduate Student ID: 55, Full Name: 55, Grade: 11.0, Major: 44

        --- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 2
Enter Student ID to remove: 11
Student removed successfully.

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: 4
List of Students:
Undergraduate Student ID: 22, Full Name: bb, Grade: 56.0, Major: xx
Graduate Student ID: 33, Full Name: 33, Grade: 33.0, Major: 33
Graduate Student ID: 44, Full Name: 44, Grade: 33.0, Major: 44
Undergraduate Student ID: 55, Full Name: 55, Grade: 11.0, Major: 44
Undergraduate Student ID: 88, Full Name: hh, Grade: 56.0, Major: nn

--- Student Grading System Menu ---
        1. Add a Student
2. Remove a Student
3. Search for a Student
4. Display Student List
5. Calculate Average Grade
6. Display Students with Highest Grade
7. Display Students with Lowest Grade
8. Exit
Enter your choice: */