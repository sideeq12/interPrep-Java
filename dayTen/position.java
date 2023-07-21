class position {
    public static void main(String args[]){
        int[]  list = { 2,3,4,8,9,10};
        int targ = 7;
        int res = binsearch(list, targ);
        System.out.println("layer is "+ res);
    }

    static int binsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(arr[end] == target){
            return end;
        }else if(arr[end] < target){
            return end+1;
        }
        while(start <= end){
            int middle = start + (end - start)/2;
            System.out.println("the mid here is "+middle);
            if(arr[middle] < target){
                start = middle + 1;
                System.out.println("the start here is "+ start);
            }else if(arr[middle] > target){
                end = middle -1;
                System.out.println("the end here is "+ end);
            }else{
                 System.out.println("the end here is run");
                return middle;
            }
        }
        return -1;
    }
}