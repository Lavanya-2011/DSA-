import java.util.Scanner;
public class length {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[];
        arr=new int[4];
        arr[0]=30;

        byte new_arr[] = {11,0,-40,51,-40,32,-58,85};
        //min value
        int min=new_arr[0];
        for(int i=0;i<new_arr.length;i++) {
            if(min>new_arr[i])
                min=new_arr[i];
        }
        System.out.println(min);

    }
}
