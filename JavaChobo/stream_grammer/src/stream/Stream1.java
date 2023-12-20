package stream;

import java.util.List;

public class Stream1 {
    // 스트림 : 데이터를 어떻게 다룰것인가?
    // 구성 : 생성 -> 가공 ->
    // 생성 : 리스트, 맵, 배열으로 생성
    // 가공 : 중간연산자를 통해 스트림을 함,
    public static void main(String[] args) {
        List<String> names = List.of("pobi","jason","neo","gugu");
        names.stream()
                .filter(str ->{
                    System.out.println("first filter = " + str);
                    return str.length()>3;
                })
                .filter(str -> {
                    System.out.println("second filter = " +str);
                    return !str.contains("gu");
                })
                .map(str -> {
                    System.out.println("map = " +str);
                    return str.toUpperCase();

                })
                .forEach(str -> {
                    System.out.println("forEach = " + str + "\n");
                });

    }


}
