class Method1{
    public static int add(int a,int b){//non void with parameter
        int r=a+b;
        return r;
        
    }
    public static void main(String[] args){
        int r=add(10,12);
        int s=r*10;
        System.out.println(s);
        System.out.println("a is printed");

        

    }
}