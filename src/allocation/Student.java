package allocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

  private String name;
  private int yearOfStudy;
  private List<Project> preferredProjects;
  private Long CNP;
  private Project allocatedProject;

  public Student(String name, int yearOfStudy, Long CNP) {
    this.name = name;
    this.yearOfStudy = yearOfStudy;
    this.preferredProjects = new ArrayList<>();
    this.CNP = CNP;
  }

  public void addProject(Project app) {
    this.preferredProjects.add(app);
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYearOfStudy() {
    return yearOfStudy;
  }

  public void setYearOfStudy(int yearOfStudy) {
    this.yearOfStudy = yearOfStudy;
  }

  public List<Project> getPreferredProjects() {
    return preferredProjects;
  }

  public Project getAllocatedProject() {
    return allocatedProject;
  }

  public void setAllocatedProject(Project allocatedProject) {
    this.allocatedProject = allocatedProject;
  }

  @Override
  public String toString() {
    String result = "\nSunt studentul " + name
        + " si imi plac urmatoarele proiecte: ";
    for (int index = 0; index < preferredProjects.size(); index++) {
      Project project = preferredProjects.get(index);
      result = result + project.getName();
      if (index < preferredProjects.size() - 1) {
        result = result + ", ";
      }
    }
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(CNP, student.CNP);
  }

  @Override
  public int hashCode() {

    return Objects.hash(CNP);
  }
}
