package list_1.questions_6_7.question_7;

import list_1.questions_6_7.channel.Channel;

/**
 * Consumer messages puts on {@link Channel}.
 *
 */
public class ConsumerFilterString implements Runnable {

  private final Channel<String> channel;

  public ConsumerFilterString(Channel channel) {
    this.channel = channel;
  }

  @Override
  public void run() {
    while (!this.channel.isClosed() || !this.channel.isEmpty()) {
      try {
        String alpha = this.channel.take();
        // It's necessary to check if it is null because the take operation may be
        // waiting for an element to be
        // inserted and the channel to be closed.
        if (alpha != null) {
          System.out.println("Filtered string:  " + alpha);
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}