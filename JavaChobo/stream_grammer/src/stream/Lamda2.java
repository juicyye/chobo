package stream;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda2 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("song",45));
        customers.add(new Customer("kim",33));
        customers.add(new Customer("park",21));
        customers.add(new Customer("choi",19));
        customers.add(new Customer("lee",67));

        // 나이가 30이상 && 오름차순 정렬 &&이름 string 추출

        List<String> list = customers.stream()
                .filter(customer -> customer.getAge() > 30)
                .sorted()
                .map(Customer::getName)
                .collect(Collectors.toList());

        for(String name :list){
            System.out.println(name);
        }




    }
}
