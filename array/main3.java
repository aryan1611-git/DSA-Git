class main3{
    public static void main(String[] args){
        
        
        int arr[] = {7,5,6,1,5,5,7,1,7,7,5,5,5,5,5,5,5};
        int n = arr.length;



        // majority element  
        // int count = 0;
        // int el = 0;
        // for(int i =0;i<n;i++){
        //     if(count==0){
        //         count++;
        //         el = arr[i];
        //     }
        //     else if(arr[i] == el){
        //         count++;
        //     }
        //     else{
        //         count--;
        //     }
        // } 
        // int count1= 0;
        // for(int i =0;i<n;i++){
        //     if(arr[i]==el){
        //         count1++;
        //     }
        // }   
        // if(count1>n/2){
        //     System.out.println(el);
        // }
        // else{
        //     System.out.println(-1);
        // }



        // find maximum subarray sum
        // int sum = 0;
        // int maxi = Integer.MIN_VALUE;
        // int ans_start = -1;
        // int ans_end = -1;
        // int start = 0;

        // for(int i=0; i<n; i++){
        //     if(sum == 0){
        //         start = i;
        //     }
        //     sum = sum + arr[i];
        //     if(sum>maxi){
        //         maxi = sum;
        //         ans_start = start;
        //         ans_end = i;
        //     }
        //     if(sum<0){
        //         sum=0;
        //     }
        // }
        // System.out.println(maxi);
        // System.out.println(ans_start+ans_end);  
        
    }
}