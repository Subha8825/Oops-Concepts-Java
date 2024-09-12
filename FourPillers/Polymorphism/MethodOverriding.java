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
    int leg =5;

    public static void walk(){
        System.out.println("DOG am walking");
    }  
}

class  MethodOverriding{
    public static void main(String[] args){
        Dog obj=new Dog();
        System.out.println(obj.leg);
        System.out.println(obj.can);
        obj.eat();
        obj.walk();
    }
}

/*
true
i am eating
DOG am walking*/