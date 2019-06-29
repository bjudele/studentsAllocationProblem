package allocation;

import java.time.LocalDate;
import java.time.Month;

public class Main {

  public static void main(String[] args) {

    // Create students
    Student s1 = new Student("S1", 2);
    Student s2 = new Student("S2", 2);
    Student s3 = new Student("S3", 2);
    Student s4 = new Student("S4", 2);

    // Create projects
    Project a1 = new Application("A1", LocalDate.of(2019, Month.JUNE, 1),
        Language.JAVA);
    Project a2 = new Application("A2", LocalDate.of(2019, Month.JUNE, 1),
        Language.JAVA);
    Project a3 = new Application("A3", LocalDate.of(2019, Month.JUNE, 1),
        Language.JAVA);
    Project e1 = new Essay("E1", LocalDate.parse("2019-06-01"), Topic.ALGORITHMS);

    // Adding preferred projects to students
    s1.addProject(a1);
    s1.addProject(a2);
    s1.addProject(a3);
    s2.addProject(a1);
    s2.addProject(e1);

    // Ading preferred students to projects
    a1.addStudent(s1);
    a1.addStudent(s2);
    a1.addStudent(s3);

    // Creating the problem and adding the data: students and projects
    Problem problem = new Problem();
    problem.addStudent(s1);
    problem.addStudent(s2);
    problem.addStudent(s3);
    problem.addStudent(s4);

    problem.addProject(a1);
    problem.addProject(a2);
    problem.addProject(a3);
    problem.addProject(e1);

    // Displaying everything to the console (implicit toString() call)
    System.out.println(problem);

    problem.solve();
  }
}
