class main10{
    public static void main(String[] args){
        int[] arr = {1,-1,4,2,3,5,-2,-3,4};
        int n = arr.length;

        int k = 6;
        
        // longest subaaray with sum zero  
        // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // int maxi =0;
        // int sum = 0;
        // for(int i=0;i<n;i++){
        //     sum += arr[i];
        //     if(sum == 0){
        //         maxi =i+1;
        //     }
        //     else{
        //         if(map.get(sum) != null){
        //             maxi = Math.max(maxi,i-map.get(sum));
        //         }
        //         else{
        //             map.put(sum,i);
        //         }
        //     }
        // }
        // System.out.println(maxi);  




        // count subarray with given xor k
        // int xr = 0;
        // Map<Integer,Integer> freq = new HashMap<>();
        // freq.put(0,1);
        // int count = 0;
        // for(int i = 0;i<n;i++){
        //     xr = xr^arr[i];
        //     int x = xr^k;
        //     if(freq.containsKey(x)){
        //         count += freq.get(x);
        //     } 
        //     freq.put(x,freq.getOrDefault(x,0)+1);
        // }
        // System.out.println(count);  

    }
}