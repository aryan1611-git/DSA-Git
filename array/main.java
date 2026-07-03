import java.util.*;
class main{
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public int[] leftRotate(int[] arr,int n,int d){
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }




    // public static boolean checkSorted(int[] arr){
    //     for(int i =1; i<arr.length;i++){
    //     if(arr[i]<=arr[i-1]){

    //     }
    //     else{
    //         return false;
    //     }
    // }
    // return true;
    // }

    // public static int findUnique(int[] arr){
    //     int i =0;
    // for(int j=1;j<arr.length;j++){
    //     if(arr[i] != arr[j]){
    //         arr[i+1]=arr[j];
    //         i++;
    //     }
    // }
    // return i+1;
    // }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

       int arr[] = {3,2,6,8,4};
    
    // find largest  
    //    int largest = arr[0];
    //    for(int i=0; i<arr.length;i++){
    //     if(arr[i]>largest){
    //         largest = arr[i];
    //     }
    //    } 
    //    System.out.println(largest);



    // find the second largest  
    // int largest = arr[0];
    // int secondL = Integer.MIN_VALUE;
    // for(int i=1;i<arr.length;i++){
    //     if(arr[i]>largest){
    //         secondL = largest;
    //         largest = arr[i];
    //     }
    //     else if(arr[i]<largest && arr[i]>secondL){
    //         secondL = arr[i];
    //     }
    // }
    // System.out.println(secondL);



    // check if array sorted  
    // System.out.println(checkSorted(arr));
    
    // find unique  
    // System.out.println(findUnique(arr));  

//     int temp = arr[0];
//     for(int i=1;i<arr.length;i++){
//         arr[i-1]=arr[i];
//     }
//     arr[arr.length -1]=temp;

//   for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]+" ");
//     }


int d = sc.nextInt();
int n = arr.length;
main sol = new main();
int[] result = sol.leftRotate(arr,n,d);

for(int it:result){
    System.out.println(it+" ");
}
    }
}