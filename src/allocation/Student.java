package allocation;

import java.util.ArrayList;
import java.util.List;

public class Student {

  private String name;
  private int yearOfStudy;
  private List<Project> preferredProjects;

  public Student(String name, int yearOfStudy) {
    this.name = name;
    this.yearOfStudy = yearOfStudy;
    this.preferredProjects = new ArrayList<>();
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
}
