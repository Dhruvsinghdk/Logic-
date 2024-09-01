public class Logic {
    public static void main(String[] args) {
        int n = 2224;
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum = sum + r;
            n = n/10;
        }
        System.out.println(sum);
    }
}
