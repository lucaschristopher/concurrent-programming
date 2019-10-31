package list_1.questions_2_3_4.question_4;

import list_1.utils.Utils;

import java.util.concurrent.Callable;

/**
 * Class that indicates when {@link InfinityHttpRequest} should stop making
 * requests.
 *
 */
public class DoneVerifier implements Callable<Long> {

  public DoneVerifier() {
  }

  @Override
  public Long call() {
    Utils.sleep(2000);
    return 2000l;
  }
}