package list_1.questions_2_3_4.question_3.exception;

/**
 * Exception to represent time limit of Threads running.
 *
 */
public class ThreadsTimeLimitException extends Exception {

  public ThreadsTimeLimitException(String message) {
    super(message);
  }
}