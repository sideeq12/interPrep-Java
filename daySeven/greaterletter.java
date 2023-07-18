public class greaterletter {
    public static void main(String args[]){
    char[] list = { 'a', 'b', 'c', 'd'};
    char target = 'b';
    System.out.println(nextGreatestLetter(list, target));

    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        // firstly checking if the target greater than the last element of the lettersay
        while(start <= end ){
            //setting the mid 
            int mid = start + (end - end )/2;

            if(target < letters[mid]){
                end = mid - 1; 
            }else {
                start = mid + 1;
            }
        };
        return letters[start % letters.length ];
    }
}
