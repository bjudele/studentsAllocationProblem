package allocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

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

  public void solve() throws IllegalArgumentException {
    /* TODO */
    /* Add logic here to create <Student, Project> pairs based on their preferences */
    Map<Student, Queue<Project>> studentPreferences = new HashMap<>();
    for (Student student : students) {
      Queue<Project> projectsQueue = new LinkedList<>(student.getPreferredProjects());
      studentPreferences.put(student, projectsQueue);
    }

    Queue<Student> studentsQueue = new LinkedList<>(students);
    while (!studentsQueue.isEmpty()) {
      Student student = studentsQueue.remove();
      Project preferredProject = studentPreferences.get(student).poll();
      if (preferredProject == null) {
        throw new IllegalArgumentException();
      }
      if (preferredProject.getAllocatedStudent() == null) {
        allocate(student, preferredProject);
      } else {
        Student initialAllocated = preferredProject.getAllocatedStudent();
        Student toBeAddedToQueue = null;
        if (preferredProject.prefersFirstOverSecond(student, initialAllocated)) {
          allocate(student, preferredProject);
          reset(initialAllocated);
          toBeAddedToQueue = initialAllocated;
        } else {
          toBeAddedToQueue = student;

        }
        studentsQueue.add(toBeAddedToQueue);
      }


    }

  }

  private void reset(Student initialAllocated) {
    initialAllocated.setAllocatedProject(null);
  }

  private void allocate(Student student, Project preferredProject) {
    preferredProject.setAllocatedStudent(student);
    student.setAllocatedProject(preferredProject);
  }
}
