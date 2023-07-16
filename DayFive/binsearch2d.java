import java.util.Arrays;

class binsearch2d{
    public static void main(String args[]){
        int[][] list= {
            {2,3,4,6},
            {13,14,17,18}, 
            {23,34,45,93},
            {20,40,60,80}
        };
        // int[][] list = {
        //     {1, 3}
        // };
        int target = 40;
        System.out.println(Arrays.toString(search(list, target)));

    }

    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr[row].length -1 ; // col = 1-1 = 0
        while( row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{ row, col};
            }
            if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1 , -1};
    }
}