class fullysorted2d {
    public static void main(String args[]){
            
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
        return new int[]{-1, -1};
    }
}