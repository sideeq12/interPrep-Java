import java.util.Scanner;

class SearchStrings {
    public static void main(String args[]){

        System.out.println("kindly input your string");
        Scanner message = new Scanner(System.in);
        String text = message.next();

        System.out.println("kindly input your character to search");
        Scanner data = new Scanner(System.in);

        // user input is being read as Strings , to be implemented , the character has to be selected
        char target = data.next().charAt(0);

        System.out.println(search(text, target));

    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        // for(int i = 0; i < str.length(); i++){
        //     if( target == str.charAt(i) ){
        //         return true;
        //     }
        // }

        // this can be alternatively implemented using tocharArray() method

        for( char s : str.toCharArray() ){
            if( s == target ){
                return true;
            }
        }

        // Each of the code has O(N) time complexity 
        return false;
    }
}