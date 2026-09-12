public class FibonacciPlainRecursion {
    public static void main(String[] args) {
        int n = 40;
        long startTime = System.currentTimeMillis();
        long result = fib(n);
        long endTime = System.currentTimeMillis();
        System.out.println("fib(" + n + ") = " + result);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
    static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}