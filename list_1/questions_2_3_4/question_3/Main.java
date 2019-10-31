package list_1.questions_2_3_4.question_3;

import list_1.questions_2_3_4.question_3.exception.ThreadsTimeLimitException;

import java.util.concurrent.ExecutionException;

/**
 * Class to be test {@link HttpRequest}.
 *
 */
public class Main {

  public static void main(String args[]) throws ExecutionException, InterruptedException, ThreadsTimeLimitException {
    HttpRequest httpRequest = new HttpRequest();

    String response = httpRequest.reliableRequest();

    System.out.println(response);
  }
}