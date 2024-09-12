abstract class Computer{
    void turnOn(){
        System.out.println("turn on");
    }
}
class Hp extends Computer{

}
class AbstractClass {
    public static void main(String[] args){
        Hp obj=new Hp();
        obj.turnOn();
    }
}

// turn on