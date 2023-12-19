package OOP;
class Counter{
    static int count =0;
    Counter(){
        count++;
        System.out.println(count);
    }
    public static int getCount(){
        return count;
    }
}
public class Static1 {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        Counter count2= new Counter();
        System.out.println(Counter.getCount());

    }


}
