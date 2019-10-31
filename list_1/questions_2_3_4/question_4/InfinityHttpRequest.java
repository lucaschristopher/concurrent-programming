package list_1.questions_2_3_4.question_4;

import list_1.questions_2_3_4.question_2.HttpRequest;

import java.util.concurrent.*;

/**
 * Call {@code httpRequest} from {@link HttpRequest} until {@link DoneVerifier}
 * finally.
 *
 */
public class InfinityHttpRequest {

  private HttpRequest httpRequest;

  public InfinityHttpRequest() {
    httpRequest = new HttpRequest();
  }

  /**
   * Executes he {@link HttpRequest} until {@link DoneVerifier} indicates that to
   * finish.
   *
   * @throws ExecutionException
   * @throws InterruptedException
   */
  public void execHttpRequest() throws ExecutionException, InterruptedException {
    DoneVerifier doneVerifier = new DoneVerifier();
    FutureTask<Long> future = new FutureTask<>(doneVerifier);
    ExecutorService executor = Executors.newFixedThreadPool(1);

    executor.execute(future);

    while (!future.isDone()) {
      System.out.println(httpRequest.reliableRequest());
    }
    executor.shutdown();
  }
}