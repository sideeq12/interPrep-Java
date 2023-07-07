import java.util.Arrays;

class Search2D {

    public static void main(String args[]){
        int[][] myArr = {
            {2,3,4}, 
            {-1,4,6,2},
            {0,3,-2,7,4,-1}
        };
        int[] result = search(myArr, 2);
    System.out.println(Arrays.toString(result));
    }

    static int[] search(int[][] list, int target){
        for(int row = 0; row <  list.length; row++){
            for(int col = 0; col < list[row].length; col++){
                if(list[row][col] ==  target ){
                    return new int[]{row, col };
                }
            }
        }
        return new int[]{-1 , -1};
    }
}