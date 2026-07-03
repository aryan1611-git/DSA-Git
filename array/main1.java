class main1 {

    // public static void union(int[] a, int[] b) {
    //     int n1 = a.length;
    //     int n2 = b.length;
    //     int i = 0, j = 0;

    //     ArrayList<Integer> temp = new ArrayList<>();
    //     // Merge both arrays
    //     while (i < n1 && j < n2) {
    //         if (a[i] < b[j]) {
    //             if (temp.size() == 0 || temp.get(temp.size() - 1) != a[i]) {
    //                 temp.add(a[i]);
    //             }
    //             i++;
    //         } 
    //         else if (a[i] > b[j]) {
    //             if (temp.size() == 0 || temp.get(temp.size() - 1) != b[j]) {
    //                 temp.add(b[j]);
    //             }
    //             j++;
    //         } 
    //         else { // equal elements
    //             if (temp.size() == 0 || temp.get(temp.size() - 1) != a[i]) {
    //                 temp.add(a[i]);
    //             }
    //             i++;
    //             j++;
    //         }
    //     }

    //     // Remaining elements of a
    //     while (i < n1) {
    //         if (temp.get(temp.size() - 1) != a[i]) {
    //             temp.add(a[i]);
    //         }
    //         i++;
    //     }

    //     // Remaining elements of b
    //     while (j < n2) {
    //         if (temp.get(temp.size() - 1) != b[j]) {
    //             temp.add(b[j]);
    //         }
    //         j++;
    //     }

    //     System.out.println("Union: " + temp);
    // }

    // public static void intersection(int[] a, int[] b){
    //     int n1 = a.length;
    //     int n2 = b.length;
    //     int i = 0;
    //     int j = 0;
    //     ArrayList<Integer> array = new ArrayList<>();
    //     int size = array.size();
    //     while(i<n1&&j<n2){
    //         if(a[i]<b[j]){
    //             i++;
    //         }
    //         else if(b[j]<a[i]){
    //             j++;
    //         }
    //         else{
    //             array.add(a[i]);
    //             i++;
    //             j++;
    //         }
    //     }
    //     System.out.println(array);
    // }


    public static void main(String[] args) {
        // int[] a = {1, 2, 2, 3,4, 4,8};
        // int[] b = {2, 3,4,5, 6};

        
        
        // union and intersection of two sorted array  
        // union(a, b);
        // intersection(a,b);

        // Scanner sc = new Scanner(System.in);
        

        int[] arr = {1,1,2,3,3,4,4,6,6};
        int n = arr.length;
        
        // find the missing number  
        // int xor1 = 0;
        // int xor2 = 0;

        // for(int i=0;i<n-1;i++){
        //     xor2 = xor2^arr[i];
        //     xor1= xor1^(i+1);
        // }
        // xor1 = xor1^n;
        // System.out.println(xor1^xor2);

        // maximum consecutive one in array  
        // int maxi = 0;
        // int count = 0;
        // for(int i=0;i<n;i++){
        //     if(arr[i] == 1){
        //         count=count+1;
        //         maxi = Math.max(count,maxi);
        //     }
        //     else{
        //         count = 0;
        //     }
        // }
        // System.out.println(maxi);

        
        // find number which appear once where all number appear twice  
        int xor = 0;
        for(int i=0; i<n;i++){
            xor = xor^arr[i];
        }
        System.out.println(xor);
        
        
        // move zeroes to the end  
        // int j=-1;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         j = i;
        //         break;
        //     }
        // }
        // for(int i=j+1;i<arr.length;i++){
        //     if(arr[i] != 0){
        //         int temp = arr[j];
        //         arr[j]=arr[i];
        //         arr[i]=temp;
        //         j++;
        //     }
        // }



        // linear search of number  
        // int num = sc.nextInt();
        // for(int i =0;i<arr.length;i++){
        //     if(arr[i]==num){
        //         System.out.println(i);
        //     }
        // }


        




        // for(int it:arr){
        //     System.out.print(it+" ");
        // }
}
}