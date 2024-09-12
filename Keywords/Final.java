class Father{
    final char gender='M';
     int pro=2;
    final void print(){
        System.out.println("printing");
    }
}
class Daughter extends Father{
    char gender='F';
}

class Final{
    public static void main(String[] args){
        Daughter obj=new Daughter();
        System.out.println(obj.pro);
        obj.print();
        
    }
}

// 2
// printing