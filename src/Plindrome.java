public class Plindrome {
    public static void main(String[] args) {
        int n = 1212;
        int sum = 0;
        int temp = n;
        while(n>0){
            int r = n%10;
            sum = sum*10 + r;
            n = n/10;
        }
       if(temp == sum){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not palidrome");
       }
    }
}
