import java.util.PriorityQueue;
import java.util.Collections;
class MedianFinder {
    private PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> upperHalf = new PriorityQueue<>();
    public void addNum(int num) {
        if (lowerHalf.isEmpty() || num <= lowerHalf.peek()) {
            lowerHalf.add(num);
        } else {
            upperHalf.add(num);
        }
        if (lowerHalf.size() > upperHalf.size() + 1) {
            upperHalf.add(lowerHalf.poll());
        } else if (upperHalf.size() > lowerHalf.size() + 1) {
            lowerHalf.add(upperHalf.poll());
        }
    }
    public double findMedian() {
        if (lowerHalf.size() == upperHalf.size()) {
            return (lowerHalf.peek() + upperHalf.peek()) / 2.0;
        }
        return lowerHalf.size() > upperHalf.size() ? lowerHalf.peek() : upperHalf.peek();
    }
}
// Standalone test version - identical logic to Hands-On Question 7
public class MedianFinderLeetcode {
    public static void main(String[] args) {
        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        System.out.println("Median = " + finder.findMedian()); // 1.5
        finder.addNum(3);
        System.out.println("Median = " + finder.findMedian()); // 2.0
    }
}