class Method{
    void max(int a,int b){
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }

    }
    void max(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
class MethodOverloading{
    public static void main(String[] args){
        Method obj=new Method();
        obj.max(5,7);
        obj.max(8,9,0);
    }
}


// 7
// 17

