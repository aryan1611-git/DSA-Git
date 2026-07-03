class main2{
    // public static void swap(int a, int b){
    //     int temp = b;
    //     b = a;
    //     a=b;
    // }



    // public static void sort(int arr[]){
    //     int num = arr.length;
    //     for(int i =num-1; i>=1;i--){
    //         for(int j=0; j<i-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }
    public static void main(String[] args){
        int arr[] = {0,1,2,1,1,1,0,2,1,2};
        int n = arr.length;
        // int left = 0;
        // int right = n-1; 
        // int sum = 0;
        // int k = 6;
        
        
        
        
        // longest subarray of sum k positive and the negative 
        // int maxLen = 0;
        // while(right<n){
        //     sum += arr[right];
        //     while(sum>k){
        //         sum -= arr[left];
        //         left++;
        //     }
        //     if(sum==k){
        //         maxLen = Math.max(maxLen,right-left+1);
        //     }
        //     right++;
        // }
        // System.out.println(maxLen);



        
        // two sum  
        // sort(arr);
        // while(left<right){
        //     sum = arr[left]+ arr[right];
        //     if(sum==k){
        //         System.out.println("yes");
        //     }
        //     else if(sum<k){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // System.out.println("no");



        // sort an array of 0,1,2  
        // int low = 0;
        // int mid = 0;
        // int high = n-1;
        // while(mid<=high){
        //     if(arr[mid] == 0){
        //         int temp = arr[mid];
        // arr[mid]= arr[low];
        // arr[low]= temp;
        //         low++;
        //         mid++;
        //     }
        //     else if(arr[mid]==1){
        //         mid++;
        //     }
        //     else{
        //         int temp1 = arr[high];
        // arr[high]= arr[mid];
        // arr[mid]= temp1;
        //         high--;
        //     }
        // }

        for(int it:arr){
            System.out.println(it+ " ");
        }

    }
}