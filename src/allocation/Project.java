package allocation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Project {

  private String name;
  private LocalDate deadline;
  private List<Student> preferredStudents;

  public Project(String name, LocalDate deadline) {
    this.name = name;
    this.deadline = deadline;
    preferredStudents = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDeadline() {
    return deadline;
  }

  public void setDeadline(LocalDate deadline) {
    this.deadline = deadline;
  }

  public void addStudent(Student student) {
    this.preferredStudents.add(student);
  }

  @Override
  public String toString() {
    String result = "\nSunt proiectul " + name
        + " si imi plac urmatorii studenti: ";
    for (int index = 0; index < preferredStudents.size(); index++) {
      Student student = preferredStudents.get(index);
      result = result + student.getName();
      if (index < preferredStudents.size() - 1) {
        result = result + ", ";
      }
    }
    return result;
  }
}
