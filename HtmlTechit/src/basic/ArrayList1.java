package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayList1 {
    public static void main(String[] args) {
        /*ArrayList<String> pitches = new ArrayList();
        pitches.add("1");
        pitches.add("2");
        pitches.add(0,"133");

        pitches.add("5");

        System.out.println(pitches.remove(1));



        for (int i = 0; i < pitches.size(); i++) {
            System.out.println(pitches.get(i));*/

        String[] data = {"133","129","234"};
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("133","122","156"));
        pitches.sort(Comparator.naturalOrder()); // 오름차순으로 정렬
        String result = String.join(",",pitches); // 콤마로 배열을 String으로 합침

        System.out.println(result);

        }
    }

