package CC14.app.src.main.java.cc14;
 import CC10.lib.src.main.java.cc10.datastsructure.*;
public class QueueDuckGame {
    public static String DUCKDuckGoose(String[] circle, int k) {
        Queue<String> queue = new Queue<>();
        for (String str : circle) {
            queue.enqueue(str);
        }
        while (queue.getLength() > 1) {
            for (int i = 0; i < k - 1; i++) {
                String skippedString = queue.dequeue();
                queue.enqueue(skippedString);
            }
            queue.dequeue();

        }
        return queue.dequeue();
    }
}
