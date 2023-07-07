class linearSearch  {

    public static void main(String args[]){
        int[] list = { 2, 3,25,56,7,2,4,9};
        int result = linSearch2(list, 34);
        System.out.println("The result is "+ result);
    }



// search the list and return the element itself 
    static int linSearch2(int[] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for( int data : arr ) {
                if ( data == target ) {
                    return data;
                }
        }
        
        return -1;
    }

// search the list and return the index
    static int linSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }else{
            for( int index =  0; index < arr.length; index++){
                int data = arr[index];
                if(data == target){
                    return index;
                }
            }
        }
        return -1;
    }
}