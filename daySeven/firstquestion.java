class firstquestion{
    public static void main(String args[]){
        int[]  list = {0, 1, 2, 3};
        int target = 3;
        int ans = ceiling(list, target);
        System.out.println("ceiling value is "+ ans);
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int result = 0;
        while(start <= end){
            int mid = start + (end - start)/2;

            // the algorithm will run down the array to remain just one element
            if(mid == 0){
               result =  arr[mid];
               System.out.println("ceiling value  "+ arr[mid]);
            }

            // firstly checking if the middle element is less than target
            // then we remove lower bound of the array
             // arr[1] = 1
            if(arr[mid] < target){
                start = mid + 1;
            }
           
            // then if middle element is great or equal to target
            // and the left element is also greater then we continue seiving
            else if(arr[mid] >= target && arr[mid-1] >= target){
                end = mid-1;
            }
            // but if left element is not greater, then we have found our answer
            else if(arr[mid] >= target && arr[mid-1] < target){
                result = arr[mid];
            }
        }
        return result;
    }
}