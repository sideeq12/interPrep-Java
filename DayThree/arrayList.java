import java.util.ArrayList;

class arrayList {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(34);
        list.add(34);
        System.out.println(list);
           list.set(1, 12);
        System.out.println(list.contains(34)); 
    }
}