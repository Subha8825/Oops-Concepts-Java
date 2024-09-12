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

class GrandDaughter extends Daughter{
    void print(){
         System.out.println("2child class");

    }
}

class Hybrid{
    public static void main(String[] args){
        Son obj=new Son();
         System.out.println(obj.gender);
        obj.print();

        GrandDaughter ob=new GrandDaughter();
         System.out.println(ob.gender);
        ob.print();

    }
}

// M
// child class
// F
// 2child class