class main11{
    // public static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2){
    //     if(arr1[ind1]>arr2[ind2]){
    //         int temp = arr1[ind1];
    //         arr1[ind1] = arr2[ind2];
    //         arr2[ind2] = temp;
    //     }
    // }
    public static void main(String[] args){
        int[][] arr = {{1,3},{2,5},{3,5},{7,8},{8,10}};
        int n4 = arr.length;

        int arr1[] ={1,5,7,8};
        int arr2[] ={2,4,0,3,6};
        int n = arr1.length;
        int n2 = arr2.length;




        // merge overlapping intervals  
        // Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        // List<List<Integer>> result = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(result.isEmpty() || result.get(result.size() -1).get(1) < arr[i][0]){
        //    List<Integer> temp = new ArrayList<>();
        //         temp.add(arr[i][0]);
        //         temp.add(arr[i][1]);
        //         result.add(temp);
        //     }
        //     else{
        //         int lastIndex = result.size()-1;
        //         int maxEnd = Math.max(result.get(lastIndex).get(1),arr[i] [1]);
        //         result.get(lastIndex).set(1,maxEnd);
        //     }
        // }



        // merge two sorted array without extra space
        // int len = n+n2;
        // int gap = (len/2) + (len%2);
        // while(gap>0){
        //     int left = 0;
        //     int right = left+gap;
        //     while(right<len){
        //         if(left<n && right>=n){
        //             swapIfGreater(arr1,arr2,left,right-n);
        //         }
        //         else if(left>=n){
        //             swapIfGreater(arr2, arr2, left-n, right-n);
        //         }
        //         else{
        //             swapIfGreater(arr1, arr1, left, right);
        //         }
        //         left++;
        //         right++;
        //     }
        //     if(gap==1){
        //             break;
        //         }
        //         gap = (gap/2) + (gap%2);
        // }
        // for(int it1:arr1){
        //     System.out.print(it1+" ");
        // }
        // for(int it2:arr2){
        //     System.out.print(it2+" ");
        // }  



        // for(List<Integer> var: result){
        //     for(int it: var){
        //         System.out.println(it+" ");
        //     }
        //     System.out.println();
        // }
    }
}