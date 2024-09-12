class Method{
     static int leg=4;
     static void print(){
        System.out.println("printing");
    }
}
class Static{
    public static void main(String[] args){
        Method.print();
        System.out.println(Method.leg);
        
    }
}

// printing
// 4