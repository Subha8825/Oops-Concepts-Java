class Father{
    char gender='M';
    void print(){
        System.out.println("printing");
    }
}
class Daughter extends Father{
    char gender='F';
    void print(){
        System.out.println("Daughter class");
        super.print();
    }
}

class Super{
    public static void main(String[] args){
        Father ob=new Father();
        System.out.println(ob.gender);
        Daughter obj=new Daughter();
        obj.print();      
    }
}

// M
// Daughter class
// printing
