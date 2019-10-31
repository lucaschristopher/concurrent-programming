package list_1.question_1;

public interface Channel {

  void putMessage(String message);

  String takeMessage();
}