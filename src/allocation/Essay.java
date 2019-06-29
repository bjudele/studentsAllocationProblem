package allocation;

import java.time.LocalDate;

public class Essay extends Project {

  private Topic topic;


  public Essay(String name, LocalDate deadline, Topic topic) {
    super(name, deadline);
    this.topic = topic;
  }


  public Topic getTopic() {
    return topic;
  }

  public void setTopic(Topic topic) {
    this.topic = topic;
  }
}
