import java.util.*;


public  class ArraySortingExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] array = {1,2,3,6336,783,66};
        for(int i: array){
            arr.add(i);
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println("ArrayList Sorted: "+arr);

        Arrays.sort(array);
        
        System.out.println("Arrays Sorted: "+Arrays.toString(array));


    }
}
