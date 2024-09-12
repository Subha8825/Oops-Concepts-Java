class Father{
    int pro=35;
    public static void male(){
        System.out.println(" i have 35 pro");
    }
}
class Son extends Father{

}
class Single{
    public static void main(String[] args){
        Son obj=new Son();
        System.out.println(obj.pro);
        obj.male();
    }
}

// 35
// i have 35 pro