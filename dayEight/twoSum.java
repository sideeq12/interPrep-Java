import java.util.Arrays;
import java.util.HashMap;

class twoSum{
    public static void main (String args[]){
        int[] list= { 2,3,4,6,7};
        int target = 10;
        int[] ans = check(list, target);
        System.out.println(Arrays.toString(ans));

    }
    
    static int[] check(int[] arr, int target){
        HashMap<Integer, Integer> myHash = new HashMap<>();

        // using [ 2, 3, 9, 5 ] as array
        // 12 as target
        for (int i = 0; i < arr.length; i++){
            
            int addend = target -arr[i]; //12-1 ==11;

            
            if(myHash.containsKey(addend)){
                System.out.println((i));
                return new int[] { myHash.get(addend), i};
            }
            myHash.put(arr[i], i);
        }
        return new int[]{};
    }
    
}