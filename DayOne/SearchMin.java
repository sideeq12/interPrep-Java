class SearchMin{

    public static void main(String args[]){
     int[] list = { 2,4,6,1,-1, 0,-7 };
     System.out.println(sea(list));
    }

    static int sea(int[] data){
        int holder = data[0];

        for( int i = 1; i < data.length; i++ ){
            if(data[i] < holder){
                holder = data[i];
            }
        }
        return holder;
    }
}