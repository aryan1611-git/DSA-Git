class main12{
    // public static void merge(int[] arr,int low,int mid,int high){
    //     ArrayList<Integer> temp = new ArrayList<>();
    //     int left = low;
    //     int right = mid+1;
    //     int k = 0;
    //     int count = 0;

    //     while(left<= mid&& right <= high){
    //         if(arr[left] <= arr[right]){
    //             temp.add(arr[left]);
    //             left++;
    //         }
    //         else{
    //             temp.add(arr[right]);
    //             right++;
    //         }
    //     }
    //     while(left<=mid){
    //         temp.add(arr[left]);
    //         left++;
    //     }
    //     while(right<=high){
    //         temp.add(arr[right]);
    //         right++;
    //     }
    //     for(int i=low;i<=high;i++){
    //         arr[i] = temp.get(i-low);
    //     }
        
    // }
    // public static int countPairs(int[] arr,int low, int mid,int high){
    //     int right = mid+1;
    //     int count = 0;
    //     for(int i = low; i<=mid;i++){
    //         while(right<=high && arr[i]>2 * arr[right]){
    //             right++;
                
    //         }
    //         count+=(right-(mid+1));
    //     }

    //     return count;
    // }
    // public static int mergeSort(int[] arr, int low, int high){
    //     int count =0;
    //     if(low>=high){
    //         return count;
    //     }
    //     int mid = (low+high)/2;
    //     count += mergeSort(arr,low,mid);
    //     count+=mergeSort(arr,mid+1,high);
    //     count += countPairs(arr, low, mid,high);
    //     merge(arr,low,mid,high);
    //     return count;
    // }
    // public static int team(int[] skill,int n){
    //     return mergeSort(skill,0,n-1);
    // }


    // public static int merge1(int[] arr,int low,int mid,int high){
    //     int[] temp = new int[high-low+1];
    //     int left = low;
    //     int right = mid+1;
    //     int k = 0;
    //     int count = 0;

    //     while(left<= mid&& right <= high){
    //         if(arr[left] <= arr[right]){
    //             temp[k++] = arr[left++];
    //         }
    //         else{
    //             temp[k++] = arr[right++];
    //             count += (mid-left+1);
    //         }
    //     }
    //     while(left<=mid){
    //         temp[k++] = arr[left++];
    //     }
    //     while(right<=high){
    //         temp[k++] = arr[right++];
    //     }
    //     for(int i=low;i<=high;i++){
    //         arr[i] = temp[i-low];
    //     }
    //     return count;
    // }
    // public static int mergeSort1(int[] arr,int low, int high){
    //     int count = 0;
    //     if(low>=high){
    //         return count;
    //     }
    //     int mid = (low+high)/2;
    //     count += mergeSort(arr,low,mid);
    //     count += mergeSort(arr,mid+1,high);
    //     count += merge(arr,low,mid,high);

    //     return count;
    // }
    // public static int numberOfInversions1(int[] arr){
    //     return mergeSort(arr,0,arr.length-1);
    // }
    public static void main(String[] args){
        int arr[] = {2,3,5,6,1,1};
        int n = arr.length;
        
        
        
        // find the repeating and missing number  
        // // int xr = 0;
        // for(int i=0;i<n;i++){
        //     xr = xr^arr[i];
        //     xr = xr^(i+1);
        // }
        // int number = (xr & ~(xr-1));
        // int zero = 0;
        // int one = 0;
        // for(int i = 0; i<n; i++){
        //     if((arr[i] & number) != 0){
        //         one^=arr[i];
        //     }
        //     else{
        //         zero ^= arr[i];
        //     }
        // }
        // for(int i=1;i<=n;i++){
        //     if((i & number) != 0){
        //         one^=i;
        //     }
        //     else{
        //         zero ^= i;
        //     }
        
        // }
        // int count = 0;
        // for(int i=0;i<n;i++){
        //     if(arr[i] == zero){
        //         count++;
        //     }}
        //     if(count == 2){
        //         System.out.println(zero+" "+one);
        //     }
            
        //  System.out.println(one+" "+zero);




        // count inversions  
        //  int count = numberOfInversions1(arr);
        //  System.out.println(count);

        
        
        
        // reverse pairs  
        //  int count = team(arr,n);
        //  System.out.println(count);



        // maximum product subarray in an array
        //  int res = arr[0];
        //  int maxprod = arr[0];
        //  int minprod = arr[0];
        //  for(int i = 1;i<n;i++){
        //     int curr = arr[i];
        //     if(curr<0){
        //         int temp = maxprod;
        //         maxprod = minprod;
        //         minprod = temp;
        //     }
        //     maxprod = Math.max(curr,maxprod*curr);
        //     minprod = Math.min(curr,minprod*curr);

        //     res = Math.max(res,maxprod );
        //  }
        //  System.out.println(res );  


    }
}