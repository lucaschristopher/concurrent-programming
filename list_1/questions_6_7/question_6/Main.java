package list_1.questions_6_7.question_6;

import list_1.questions_6_7.channel.Channel;

public class Main {

  public static void main(String args[]) throws InterruptedException {
    Channel<Integer> channel = new Channel<>("channel");

    NumberProducer numberProducer = new NumberProducer(channel);
    NumberConsumer numberConsumer = new NumberConsumer(channel);
    NumberConsumer numberConsumer2 = new NumberConsumer(channel);
    NumberConsumer numberConsumer3 = new NumberConsumer(channel);

    Thread threadNumberProducer = new Thread(numberProducer);
    Thread threadNumberConsumer = new Thread(numberConsumer);
    Thread threadNumberConsumer2 = new Thread(numberConsumer2);
    Thread threadNumberConsumer3 = new Thread(numberConsumer3);

    threadNumberProducer.start();
    threadNumberConsumer.start();
    threadNumberConsumer2.start();
    threadNumberConsumer3.start();

    threadNumberConsumer.join();
    threadNumberConsumer2.join();
    threadNumberConsumer3.join();
    threadNumberProducer.join();
  }
}
