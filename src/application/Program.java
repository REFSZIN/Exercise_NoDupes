package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        arr1.add("Uva");
        arr1.add("Pêra");
        arr1.add("Banana");
        arr1.add("Whey protein");

        arr2.add("Batata doce");
        arr2.add("Frango");
        arr2.add("Banana");
        arr2.add("Whey protein");

        for(String s : arr1) {
            if(arr2.contains(s)) {
                System.out.println(s);
            }
        }
    }
}
