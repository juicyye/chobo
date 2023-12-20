package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("aa",45));
        customers.add(new Customer("kim",33));
        customers.add(new Customer("park",21));
        customers.add(new Customer("choi",19));
        customers.add(new Customer("lee",67));

        Stream<Customer> stream = customers.stream();
        stream.filter( customers2 -> customers2.getAge() >30)
                .distinct()
                .forEach(System.out::println);

        Stream<Customer> stream2 = customers.stream(); // 이름으로 정렬한 다음 출력
        stream2.sorted(Comparator.comparing(Customer::getName))
                .forEach(System.out::println);

        /*List<String> list = customers.stream()
                .filter(customer -> customer.getAge() >30)
                .distinct()
                .forEach(System.out::println);
*/
    }

}
