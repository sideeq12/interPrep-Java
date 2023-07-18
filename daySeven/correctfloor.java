public class correctfloor {
    public static void main(String args[]){
        int[] list = { 1,2,3,4,5,16,17,18};
        int target = 7;
        System.out.println(floor(list, target));

    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end ){
            int mid = start + (end - end )/2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                // answer found on the list
                return mid;
            }
        };
        return end;
    }
}
