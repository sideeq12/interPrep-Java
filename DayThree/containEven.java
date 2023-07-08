class containEven{

    public static void main(String args[]){
        int[] numb = {2,45,6,88,9990};
        System.out.println(findNumbers(numb));
    }

 static int findNumbers(int[] nums) {

    int result  = 0;
    for(int i = 0; i < nums.length; i++){
        if(isEven(nums[i])){
            result++;
        }
    }
    return result;
 }

 static boolean isEven(int num){

    int numberOfDigits = digits(num);
    return numberOfDigits % 2 == 0 ;
 }
 static int digits(int num){
     if(num < 0 ){
        num = num * -1;
    }
    return (int)(Math.log10(num))+1;
 }
}