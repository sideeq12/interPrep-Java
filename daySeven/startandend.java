public class startandend {

    public static void main(String args[]){
        int[] list = {2,3,4,4,6,7};
        int target = 4;
        System.out.println(searchRange(list, target));
    }

    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        // firstly checking if the target greater than the last element of the numsay
        if(nums.length == 0){
            return new int[]{-1, -1};
        }
        while(start <= end ){
            int mid = start + (end - end )/2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                // answer found on the list
                if(nums[mid] == target && nums[mid+1] == target){
                    return new int[]{mid, mid+1};
                }else{
                     return new int[]{mid, mid};
                }
            }
}
        return new int[]{-1, -1};
    }
}
