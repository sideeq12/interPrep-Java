import java.util.Arrays;

public class firstandlast {
   public static void main(String args[]){
    int[] list = { 2,3,3,3,5,6,8};
    int target = 3;
    int[] ans = data(list, target);
    System.out.println(Arrays.toString(ans));

   }
   
   static int[] data(int[] arr, int target){

    int[] result = {-1, -1};
    result[0] = binSearch(arr, target, true);
    result[1] = binSearch(arr, target, false);
    return result;
    
   }
 
   static int binSearch(int[] arr, int target, boolean isLeft){
      
    int ans = -1;
    int start = 0;
    int end = arr.length-1;
    while(start <= end ){
        int mid = start + (end - start)/2;
        if(target < arr[mid]){
            end = mid -1;
        }else if( target > arr[mid]){
            start = mid +1;
        }else{
            ans = mid;
            if(isLeft){
               end = mid -1; 
            }else{
                start = mid+1;
            }
        }
    }
    return ans;
   }

}
