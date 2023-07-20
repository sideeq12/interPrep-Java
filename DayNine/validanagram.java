import java.util.Arrays;

class validanagram {
    public static void main(String args[]){
    String text = "anagram";
    String s = "nagaram";
    System.out.println(sortlist(s).equals(sortlist(text)));
   
    }

     // firtly create a function that covert the string and sort it
        static String sortlist(String str){
            char mylist[] = str.toCharArray();
            Arrays.sort(mylist);
        
            return new String(mylist);
        }
}