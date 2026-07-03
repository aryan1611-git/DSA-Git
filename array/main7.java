class main7{
    // public static void swap(int[][] matrix,int i, int j){
    //     int temp = matrix[i][j];
    //     matrix[i][j] = matrix[j][i];
    //     matrix[j][i] = temp;
    // }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        

        int[] arr = {1,2,-1,3,-3,1,4,5,2,1,1,1,4};
        int n = arr.length;
        
        
        
        
        // rotate matrix by 90 degree  
        // int n =matrix.length;
        // for(int i =0; i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         swap(matrix,i,j);
        //     }
        // }
        // for(int i =0;i<n;i++){
        //     int left =0;
        //     int right =n-1;
        //     while(left<right){
        //         int temp = matrix[i][left];
        //         matrix[i][left] = matrix[i][right];
        //         matrix[i][right] = temp;
        //         left++;
        //         right--;
        //     }
        // }

        
        
        
        // printing matrix in spiral order  
        // List result = new ArrayList<>();
        // int top = 0;
        // int bottom = matrix.length-1;
        // int left = 0;
        // int right = matrix[0].length-1;

        // while(top<=bottom && left<=right){
        //     for(int i=left;i<=right;i++){
        //         result.add(matrix[top][i]);
        //     }
        //     top++;
        //     for(int i =top;i<=bottom;i++){
        //         result.add(matrix[i][right]);
        //     }
        //     right--;
        //     if(top<=bottom){
        //         for(int i =right;i>=left;i--){
        //             result.add(matrix[bottom][i]);
        //         }
        //         bottom--;
        //     }
        //     if(left<=right){
        //         for(int i =bottom;i>=top;i--){
        //             result.add(matrix[i][left]);
        //         }
        //         left++;
        //     }
        // }

        // System.out.print(result);




        // number of subarray of sum k
        // int k = 3;
        // int preSum = 0;
        // int count = 0;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(0,1);
        // for(int i=0;i<n;i++){
        //     preSum += arr[i];
        //     int remove = preSum-k;
        //     count += map.getOrDefault(remove,0);
        //     map.put(preSum,map.getOrDefault(preSum,0) + 1);
        //     }

        //     System.out.print(count);  

        
        
        
        // for(int[] row:matrix){
        //     for(int val:row){
        //         System.out.print(val+" ");
        //         System.out.println();
        //     }
        // }
    }
}