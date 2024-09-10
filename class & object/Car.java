class Car{
    String name;// variables
    int num;

    void display(){//methods
        System.out.println(name);
        System.out.println(num);
    }
    public static void main(String[] args){
        Car obj=new Car();
        obj.name="RDX"; // accessing the member of the class
        obj.num=123;
        obj.display();
    }
}