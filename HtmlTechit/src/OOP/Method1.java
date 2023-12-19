package OOP;

public class Method1 {
    int a; // 객체변수 a

    void varTest(/*Method1 method1*/){
        /*method1.a++;*/
        this.a++;
    }

    public static void main(String[] args) {
        Method1 method1 = new Method1();
        method1.a = 1;
        method1.varTest(/*method1*/);
        System.out.println(method1.a);
    }
}
