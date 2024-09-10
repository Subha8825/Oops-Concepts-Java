class Print{
    int rollnum;
    int marks;
    
    Print(int r,int n){
        System.out.println("hello");
        rollnum=r;
        marks=n;
    }
}
class Parameter{
    public static void main(String[] args){
        Print obj=new Print(23,56);
        System.out.println(obj.rollnum);
        System.out.println(obj.marks);
    }
    
}

// hello
// 23
// 56