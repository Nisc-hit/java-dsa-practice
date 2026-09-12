import java.util.HashMap;
import java.util.Map;
class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int fib(int n) {
        if (n <= 1) return n;
        if (cache.containsKey(n)) return cache.get(n);
        int result = fib(n - 1) + fib(n - 2);
        cache.put(n, result);
        return result;
    }
}
// Standalone test version
public class FibonacciLeetcodeMemo {
    static Map<Integer, Integer> cache = new HashMap<>();
    public static void main(String[] args) {
        int n = 10;
        System.out.println("fib(" + n + ") = " + fib(n));
    }
    static int fib(int n) {
        if (n <= 1) return n;
        if (cache.containsKey(n)) return cache.get(n);
        int result = fib(n - 1) + fib(n - 2);
        cache.put(n, result);
        return result;
    }
}