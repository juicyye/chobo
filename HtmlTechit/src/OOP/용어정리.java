package OOP;
class Animal{
    String name; // 객체 변수 = 인스턴스 변수, 멤버 변수, 속성

    public void setName(String name){
        this.name = name; // 메소드는 클래스 내에 구현된 함수
        // Animal 클래스에 추가된 setName 메소드
    }
    int sum(int a, int b){ // a,b는 매개변수
        return a+b;
    }

}
public class 용어정리 {
    public static void main(String[] args) {
        Animal cat = new Animal(); // cat은 Animal의 객체
        // cat이라는 객체는 Animal의 인스턴스

        cat.setName("baby"); // 메소드 호출

        int c= cat.sum(3,4); // 3,4는 인수

        System.out.println(cat.name); // 객체 : cat, 객체변수 : name

    }


}
