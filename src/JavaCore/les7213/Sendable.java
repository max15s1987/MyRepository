package JavaCore.les7213;

public interface Sendable<T> {

    String getTo();
    String getFrom();
    T getContent();

}
