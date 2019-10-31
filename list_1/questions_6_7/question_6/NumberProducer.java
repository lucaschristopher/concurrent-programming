package list_1.questions_6_7.question_6;

import list_1.questions_6_7.channel.Channel;
import list_1.utils.Utils;

import java.util.Random;

public class NumberProducer implements Runnable {

  private final Channel<Integer> channel;

  public NumberProducer(Channel channel) {
    this.channel = channel;
  }

  @Override
  public void run() {
    Random random = new Random();
    for (int i = 0; i < 30; i++) {
      Integer randomNumber = random.nextInt(50);
      this.channel.put(randomNumber);

      // Sleep for 1 second
      Utils.sleep(100);
    }
    // try {
    this.channel.closeChannel();
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
  }
}
