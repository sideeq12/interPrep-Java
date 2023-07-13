class orderAgnostic{
    public static void main(String args[]){
        int[] arr = {2,3,5,7,8,9,12,55,78 };
        int target = 12;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target ){

        // beginning of array
        int start = 0;
        int end = arr.length -1;

        // confirming if its in Asc or Descending order
        boolean isAsc = arr[start] < arr[end];

         while(start <= end ){
            // take the middle
            int middle =  start + (end-start)/2;
            if(arr[middle] ==  target){
                return  middle;
            }
            if(isAsc){
                if(arr[middle ] > target){
                end = middle -1;
            }else {
                start = middle +1;
            }
            }else{
                if(arr[middle ] < target){

                end = middle -1;

            }else {
                start = middle+1;
            }
            }
         }


        return -1;
    }
}