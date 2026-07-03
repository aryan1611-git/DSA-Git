class main8{
    // public static int ncr(int c, int r){
    //     int res = 1;
    //     for(int i=0;i<r;i++){
    //         res = res*(c-i);
    //         res = res/(i+1);
    //     }
    //     return res;
    // }
    // public static List<Long> generateRow(int n1){
        

    //     long ans1 = 1;
    //     List<Long> ans2 = new ArrayList<>();
    //     ans2.add(ans1);
    //     for(int col=1; col<n1;col++){
    //         ans1 = ans1*(n1-col);
    //         ans1 = ans1/(col);
    //         ans2.add(ans1);
    //     }
    //     return ans2;
    // }
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,2,2,2};




    // pascal triangle  
    //     int c=5;
    //     int r=2;
    //   System.out.println(ncr(c-1,r-1));

    //   int n=6;
    //   int ans=1;
    //   System.out.print(ans);
    //   for(int i=1;i<n;i++){
    //     ans = ans*(n-i);
    //     ans = ans/(i);
    //     System.out.print(ans);
    //   };

    //   List<List<Long>> result = new ArrayList();
    //   int n2= 6;
    //   for(int i=1;i<=  n2;i++){
    //     result.add(generateRow(i));
    //   }

    //   System.out.print(result);







    // majority element
    //   int count1 =0;
    //   int count2 = 0;
    //   int n = arr.length;
    //   int el1 = Integer.MIN_VALUE;
    //   int el2 = Integer.MIN_VALUE;
    //   for(int i=0;i<arr.length;i++){
    //     if(count1 == 0 && arr[i]!=el2){
    //         count1 = 1;
    //         el1 = arr[i];
    //     }
    //     else if(count2 == 0 && arr[i]!=el1){
    //         count2 = 1;
    //         el2 = arr[i];
    //     }
    //     else if(el1 == arr[i]){
    //         count1++;
    //     }
    //      else if(el2 == arr[i]){
    //         count2++;
    //     }
    //     else{
    //         count1--;
    //         count2--;
    //     }
    //   }


    //   count1= 0;
    //   count2 = 0;
    //   for(int i=0;i<n;i++){
    //     if(arr[i] == el1){
    //         count1++;
    //     }
    //     if(arr[i] == el2){
    //         count2++;
    //     }
    //   }

    //   int mini = n/3 + 1;
    //   if(count1>=mini){
    //     System.out.print(el1+" ");
    //   }
    //   if(count2>=mini){
    //     System.out.print(el2);
    //   }  

    }
}