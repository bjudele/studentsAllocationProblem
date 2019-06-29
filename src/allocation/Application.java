package allocation;

import java.time.LocalDate;

public class Application extends Project {

  private Language language;


  public Application(String name, LocalDate deadline,
      Language language) {
    super(name, deadline);
    this.language = language;
  }

  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }
}
