public class ClimbStairs {
    public static void main(String[] args) {
        
        int n = 3;

        if(n <= 2){
            System.out.println(n);
            return;
        }

        int a = 1, b = 2;

        for(int i = 3; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println(b);
    }
}