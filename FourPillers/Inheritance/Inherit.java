class Animal{
    int leg=4;

    public static void walk(){
        System.out.println("i am walking");
    }
    public static void eat(){
        System.out.println("i am eating");
    }

}
class Dog extends Animal{
    Boolean can=true;
}

class  Inherit{
    public static void main(String[] args){
        Dog obj=new Dog();
        System.out.println(obj.leg);
        System.out.println(obj.can);
        obj.eat();
        obj.walk();
    }
}

// 4
// true
// i am eating
// i am walking