public class Fibonacci {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        for (int k = 0; k <= 8; k++) {
            int n = i+j;
            i = j;
            j = n;
            System.out.println(n);

        }
    }
}
