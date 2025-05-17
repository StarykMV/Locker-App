package app;

public class DataHandler {

    private final Locker lock = new Locker();

    public int modify(int num) {
        lock.lock();
        try {
            num = num * 3;
            return num;
        } finally {
            lock.unlock();
        }
    }
}
