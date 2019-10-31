package list_1.questions2_3_4.question_2;

import java.util.concurrent.ExecutionException;

/**
 * Class to be test {@link HttpRequest}.
 *
 */
public class Main {

  public static void main(String args[]) throws ExecutionException, InterruptedException {

    HttpRequest httpRequest = new HttpRequest();

    String response = httpRequest.reliableRequest();

    System.out.println(response);
  }
}