class Father{
    char gender='M';
    void print(){
        System.out.println("parent class");
    }
}
class Son extends Father{
    void print(){
        System.out.println("child class");
    }
}
class Daughter extends Father{
    char gender='F';
    void print(){
        System.out.println("child class");

    }
}

class Hierarchical{
    public static void main(String[] args){
        Son obj=new Son();
         System.out.println(obj.gender);
        obj.print();

        Daughter ob=new Daughter();
         System.out.println(ob.gender);
        ob.print();

    }
}

// M
// child class
// F
// child class