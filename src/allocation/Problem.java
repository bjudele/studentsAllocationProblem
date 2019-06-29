package allocation;

import java.util.ArrayList;
import java.util.List;

public class Problem {

  private List<Student> students;
  private List<Project> projects;

  public Problem() {
    this.students = new ArrayList<>();
    this.projects = new ArrayList<>();
  }

  public void addStudent(Student student) {
    this.students.add(student);

  }

  public void addProject(Project project) {
    this.projects.add(project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("There are " + students.size() + " students and "
        + projects.size() + " projects");

    for (int i = 0; i < students.size(); i++) {
      Student student = students.get(i);
      sb.append(student);
    }

    for (int i = 0; i < projects.size(); i++) {
      Project project = projects.get(i);
      sb.append(project);
    }

    return sb.toString();
  }

  public void solve() {
    /* TODO */
    /* Add logic here to create <Student, Project> pairs based on their preferences */
  }
}
