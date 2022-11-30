import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        NextPerm(arr,n);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static int [] NextPerm(int arr[],int n){
        int i=n-2;
        if(n<=1 || arr==null)
            return arr;
        while(i>=0 && arr[i]>=arr[i+1]){        //To get index where arr[i]<arr[i+1];
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(j>=0 && arr[j]<=arr[i]){
                j--;
            }
            Swap(i,j,arr);
        }
      Reverse(arr,i+1,n-1);
        return arr;
    }

    public static void Swap(int i,int j, int [] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void Reverse(int[] arr,int i,int j){
        while(i<j){
            Swap(i++,j--,arr);
        }

    }
}
