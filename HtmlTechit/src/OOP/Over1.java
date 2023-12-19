package OOP;
class Animal1{
    String name;
    void setName(String name){
        this.name = name;
    }
}
class Dog extends Animal1{
    void sleep(){
        System.out.println(this.name + "zzzz ");
    }
}
class HouseDog extends Dog{
    HouseDog(String name){
        this.setName(name);
    }
    void sleep(){ // 메소드 오버라이딩
        System.out.println(this.name +"zzz in house " );
    }
    void sleep(int hour){ // 메소드 오버로딩
        System.out.println(this.name +"zzz in house for "+ hour +"hours");
    }

}

public class Over1 {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
