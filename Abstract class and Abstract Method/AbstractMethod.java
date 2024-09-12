abstract class Computer{
    abstract void turnOff();//only decalaration
    void turnOn(){
        System.out.println("turn on");
    }
}
class Hp extends Computer{
    void turnOff(){
            System.out.println("turnOff");
        }

}
class AbstractMethod {
    public static void main(String[] args){
        Hp obj=new Hp();
        obj.turnOn();
        obj.turnOff();
        
    }
}

// turn on
// turnOff