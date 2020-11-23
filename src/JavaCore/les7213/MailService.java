package JavaCore.les7213;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MailService<T> implements Consumer<Sendable<T>> {

    private Map<String, List<T>> mailBox = new Map<>();


    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Sendable<T> mailMessage) {

        String mailTo = mailMessage.getTo();
        List<T> list = new ArrayList<>();
        list.add(mailMessage.getContent());

        if (mailBox.containsKey(mailTo)) {
            mailBox.get(mailTo).add(mailMessage.getContent());
        } else {
            mailBox.put(mailMessage.getTo(), list);
        }

    }
}









/*
    @Override
    public void accept(MailMessage mailMessage) {
        String mailTo = mailMessage.getTo();
        List<T> list = new ArrayList<>();
        list.add((T) mailMessage.getContent());

        if (mailBox.containsKey(mailTo)) {
            mailBox.get(mailTo).add((T) mailMessage.getContent());
        } else {
            mailBox.put(mailMessage.getTo(), list);
        }

    }

    @Override
    public Consumer<MailMessage> andThen(Consumer<? super MailMessage> after) {
        return null;
    }



}
*/