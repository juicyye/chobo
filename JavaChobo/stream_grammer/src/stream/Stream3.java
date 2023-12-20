package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("aa",45));
        customers.add(new Customer("kim",33));
        customers.add(new Customer("park",21));
        customers.add(new Customer("choi",19));
        customers.add(new Customer("lee",67));

        Stream<Customer> stream1 = customers.stream(); // 이름만 가져와서 출력하고 싶을때 Map
        stream1.map(Customer::getName)
                .collect(Collectors.toList());
    }
}
