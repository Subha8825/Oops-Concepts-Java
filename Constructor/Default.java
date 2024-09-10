class Print{
    int rollnum;
    int marks;
    
    Print(){
        System.out.println("hello");
        rollnum=78;
    }
}

class Default{
    public static void main(String[] args){
        Print obj=new Print();
        System.out.println(obj.rollnum);
    }
    
}

// hello
// 78