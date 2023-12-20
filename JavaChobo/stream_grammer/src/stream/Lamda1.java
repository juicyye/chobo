package stream;

import java.util.ArrayList;
import java.util.List;

public class Lamda1 {
    // 반환타입과 이름을 없앰
    // 반환값이 잇는 경우 식과 값만 적음

   /* 기본
    int max(int a, int b){
        return a>b ? a: b;
    }*/

    /*(int a, int b) ->{
        return a > b ? a:b;
    }*/


   /* (int a, int b) -> a > b? a:b */

     /*매개변수의 타입이 추론가능하면 생략가능
        (a,b) -> a > b ? a:b*/


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("c");
        list.add("react");

        list.stream().forEach((String str) -> { // List를 통해 String을 출력하는걸 알기떄문에 삭제가능
            System.out.println(str);
        });

        list.stream().forEach(str -> System.out.println(str)); // 위랑 같음
        list.stream().forEach( System.out::println); // 위랑 같음



    }
}
