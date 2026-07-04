import java.util.*;
class main9{
    
    public static void main(String[] args){
        int arr[] = {1,1,1,2,2,3,3,4,4,4};
        int n = arr.length;

        int target = 8;



        






        // 3 sum  
        // List<List<Integer>> ans = new ArrayList<>();
        // Arrays.sort(arr);
        // for(int i=0;i<n;i++){
        //     if(i>0 && arr[i] == arr[i-1]){
        //         continue;
        //     }
        //     int j = i+1;
        //     int k=n-1;
        //     while(j<k){
        //         int sum = arr[i]+arr[j]+arr[k];
        //         if(sum<0){
        //             j++;
        //         }
        //         else if(sum>0){
        //             k--;
        //         }
        //         else{
        //             ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
        //             j++;
        //             k--;
        //             while(j<k && arr[j] == arr[j-1]){
        //                 j++;
        //             }
        //             while(j<k && arr[k] == arr[k+1]){
        //                 k--;
        //             }
        //         }
        //     }
            
        // }






        // 4 sum
        // Arrays.sort(arr);
        // List<List<Integer>> st = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(i>0 && arr[i] == arr[i-1]){
        //         continue;
        //     }
        //     for(int j= i+1; j<n; j++){
        //         if(j>0 && arr[j] == arr[j-1]){
        //             continue;
        //         }
        //         int k = j+1;
        //         int l = n-1;
        //         while(k<l){
        //             int sum = arr[i];
        //             sum += arr[j];
        //             sum+= arr[k];
        //             sum += arr[l];
        //             if(sum == target){
        //                 st.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
        //                 k++;
        //                 l--;
        //                 while(k<l && arr[k]==arr[k-1]){
        //                     k++;
        //                 }
        //                 while(k<l && arr[l]==arr[l+1]){
        //                     l--;
        //                 }
        //             }
        //             else if(sum<target){
        //                 k++;
        //             }
        //             else{
        //                 l--;
        //             }
        //         }
        //     }
        // }  






        for(List<Integer> quad : st){
                for(int num: quad){
                    System.out.println(num+ " ");
                }
            } 

    }
}