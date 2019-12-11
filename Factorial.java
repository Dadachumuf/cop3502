public class Factorial {
    public static long pureRecursive(int n) {
        long factResult;

        if (n <= 1) {
            factResult = 1;
        }
        else {
            factResult = n * pureRecursive(n-1);
        }
        return factResult;

    }
    public static long tailRecursive(int n) {
        return tail(n,1);

    }
    private static long tail(int n, int a) {
        if (n == 0) {
            return a;
        }
        return tail(n-1, n * a);


    }
    public static long iterative(int n) {
        long factResult = 1;
        for (int i = 1; i <= n; i++) {
            factResult = factResult * i;
        }
        return factResult;
    }
    public static void main (String [] Args) throws IllegalArgumentException {
        int n = 3;
        if (n <= 0) {
            throw new IllegalArgumentException("n must be non-negative as well as non-zero");
        }
        //System.out.println(pureRecursive(n));
        System.out.println(tailRecursive(n));
        //System.out.println(iterative(n));
    }
}
