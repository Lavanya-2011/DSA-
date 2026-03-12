import java.util.Scanner;
class bye {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        bye:
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){ 
                if(i==1)
                    continue bye;
                    System.out.println(i);
            }
        }
    }
    
}
