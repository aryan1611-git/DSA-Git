class main6{
    //     public static void setZeroes(int[][] matrix){
    //         int m = matrix[0].length;
    //         int n = matrix.length;
    //         int col0 = 1;
    //         for(int i=1;i<n;i++){
    //             for(int j=1;j<m;j++){
    //                 if(matrix[i][j]==0){
    //                     matrix[i][0] = 0;
    //                     if(j!=0){
    //                     matrix[0][j] = 0;}
    //                     else{
    //                         col0 = 0;
    //                     }
    //                 }
    //             }
    //         }
    //         for(int i=1;i<n;i++){
    //             for(int j=1;j<m;j++){
    //                 if(matrix[i][0]==0 || matrix[0][j] == 0){
    //                     matrix[i][j] = 0;
    //                 }
    //             }
    //         }
    //         if(matrix[0][0] == 0){
    //             for(int j=0;j<m;j++){
    //                 matrix[0][j] = 0;
    //             }
    //             if(col0 == 0){
    //                 for(int i=0;i<n;i++){
    //                     matrix[i][0] = 0;
    //                 }
    //             }
    //         }
            
    // }  
    
    
    // public static int longestConsecutive(int[] arr){
    //     int n = arr.length;
    //     int longest = 1;
    //     Set<Integer> st = new HashSet<>();
    //     for(int i=0;i<n;i++){
    //         st.add(arr[i]);
    //     };
    //     for(int i:st){
    //         if(!st.contains(i-1)){
    //             int count =1;
    //             int x =i;
    //             while(st.contains(x+1)){
    //                 x=x+1;
    //                 count = count+1;
    //             }
    //             longest = Math.max(longest,count);
    //         }
    //     }
    //     return longest;
    // }
    public static void main(String[] args) {
        // longest common subsequence  
        // int arr[] = {1,4,100,101,2,102,3,8,110};
        // System.out.println(longestConsecutive(arr));





        // set matrix zeroes
        // int[][] matrix = {{0,1,1,0},{1,1,0,1},{0,1,1,1},{1,1,1,0}};
        // setZeroes(matrix);
        // for(int[] row: matrix){
        //     for(int val: row){
        //         System.out.print(val+" ");
        //     }
        //     System.out.println();
        // }  
    }
}