
import java.util.ArrayList;
class main4{
    public static void main(String[] args) {
        int arr[] = {7,1,5,4,-3,2,-1};
        int n = arr.length;
        
        
        
        
        // stock buy and sell problem here  
        // int profit = 0;
        // int mini = arr[0];
        // for(int i=1;i<n;i++){
        //     int cost = arr[i]-mini;
        //     profit = Math.max(profit,cost);
        //     mini = Math.min(mini,arr[i]);
        // }
        // System.out.println(profit);




        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);

            }
            else{
                neg.add(arr[i]);
            }
        }

        if(pos.size()>neg.size()){
            for(int i = 0; i<neg.size();i++){
                arr[2*i]=pos.get(i);
                arr[2*i +1] = neg.get(i);
            }
            int index = neg.size()*2;
            for(int i =neg.size();i<pos.size();i++){
                arr[index] = pos.get(i);
                index++;
            }
        }

        else{
            for(int i = 0; i<pos.size();i++){
                arr[2*i]=pos.get(i);
                arr[2*i +1] = neg.get(i);
            }
            int index = neg.size()*2;
            for(int i =pos.size();i<neg.size();i++){
                arr[index] = neg.get(i);
                index++;
            }
        }
        for(int it:arr){
            System.out.println(it+" ");
        }


    }
    }
