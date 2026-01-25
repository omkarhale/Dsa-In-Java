package queue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue();
        customQueue.insert(23);
        customQueue.insert(24);
        customQueue.insert(25);
        customQueue.insert(26);
        customQueue.insert(27);
        customQueue.display();

    }
}
