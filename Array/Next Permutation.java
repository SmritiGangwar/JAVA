class Solution {
    public void nextPermutation(int[] arr) {
        int idx = -1;
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        //If there is no possible next Permutation
        if(idx==-1){
            Reverse(arr,0,n-1);
            return;
        }

        for(int i=n-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                //Swap
                Swap(arr,i,idx);
                break;
            }
        }

        Reverse(arr,idx+1,n-1);

    }
    public static void Swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    public static void Reverse(int [] arr,int i,int j){
        while(i<j){
            Swap(arr,i++,j--);
        }
    }
}
