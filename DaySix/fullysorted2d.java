import java.util.Arrays;

class fullysorted2d {
    public static void main(String args[]){
        int[][] list = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 3;
        int[] result = fullsearch(list, target);
        System.out.println(Arrays.toString(result));    
    }
    // simple binsearch within an array specifying the range of the search
    static int[] binsearch(int[][] matrixes, int row, int colstart, int cEnd, int target){
        while(colstart < cEnd ){
            int mid = colstart + (cEnd - colstart)/2;
            if(matrixes[row][mid] ==  target){
                return new int[]{ row, mid};
            }
            if(matrixes[row][mid] < target){
                    colstart = mid+1;
            }else{
                cEnd = mid -1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] fullsearch(int[][] matrix, int target){
        int rows  = matrix.length;
        int col = matrix[0].length;
        if(rows == 1){
            return binsearch(matrix, rows, 0, col-1, target);
        }
        
        int rstart = 0;
        int rEnd = rows -1;
        int cMid = col /2;
           while(rstart < (rEnd -1) ){ //while this is true, it will eliminate rows till it certainly remains just two rows
            int mid = rstart + (rEnd-rstart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid}; 
            }
            if(matrix[mid][cMid] < target){
                rstart = mid;
            }else{
                rEnd = mid;
            }
        }
    //   now we have two rows in the matrix
        // check ig the target is in the cols of the two rums
        if(matrix[rstart][cMid] == target){
            return new int[]{ rstart, cMid};
        }
        if(matrix[rstart+1][cMid] == target){
            return new int[]{ rstart+1, cMid};
        }
        
        //  searching through the first list ( top left side)
        if(target <= matrix[rstart][cMid-1]){
            return binsearch(matrix, rstart, 0, cMid-1, target);
        }

        // searching thrpud
        if(target >= matrix[rstart][cMid+1] && target <= matrix[rstart][col]){
            return binsearch(matrix, rstart, cMid+1, col-1, target);
        }
        if(target <= matrix[rstart+1][cMid-1]){
            return binsearch(matrix, rstart+1, 0, cMid-1, target);
        }{
            return binsearch(matrix, rstart+1, cMid+1, col-1, target);
        }
    }
}