//Find the item it first occurs from the last

import java.util.Scanner;

public class ArrayItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={2,3,5,4,1,3,7,3,6};
        int n=arr.length;

        int item=sc.nextInt();

        System.out.println( "At index : "+LastIndexRecur(arr,item,n));
    }

    public static int LastIndexRecur(int[] arr,int item,int n){

        if(n<=0)
            return -1;

        if(arr[n-1]==item){
            return n-1;
        }

        return LastIndexRecur(arr,item,n-1);
    }
}
