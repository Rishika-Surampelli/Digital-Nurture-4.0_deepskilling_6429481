package decorator;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        // Base notifier: Email only
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("System down alert");

        System.out.println();

        // Decorated with SMS
        Notifier emailAndSMS = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSMS.send("Server restart scheduled");

        System.out.println();

        // Decorated with SMS and Slack
        Notifier multiChannel = new SlackNotifierDecorator(
                                  new SMSNotifierDecorator(
                                      new EmailNotifier()));
        multiChannel.send("High memory usage detected");
    }
}
