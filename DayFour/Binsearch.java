class Binsearch {
    public static void main(String args[]){
        int[] arr = {-23, -21, -4, 0, 3, 5, 6, 7, 12, 19, 20, 43};
        int target = 29;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target ){

        // beginning of array
        int start = 0;
        int end = arr.length -1;
         while(start <= end ){
            // take the middle
            int middle =  start + (end-start)/2;
            if(arr[middle ] > target){

                end = middle -1;

            }else if(arr[middle] < target){

                start = middle+1;
            }else{

                return  middle;
            }
         }


        return -1;
    }
}