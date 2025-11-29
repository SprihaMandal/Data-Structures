package threading.topic1;

public class EmailJobRunner implements Runnable {
    private final EmailSender emailSender;

    EmailJobRunner(EmailSender e) {
        this.emailSender = e;
    }

    @Override
    public void run() {
        emailSender.sendEmail();
    }

}
