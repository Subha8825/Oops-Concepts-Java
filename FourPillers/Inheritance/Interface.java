interface Method{
    abstract void talk();
    abstract void walk();
}
class Interface implements Method{
    public void talk(){
        System.out.println("talking");
    }
    public void walk(){
        System.out.println("walking");
    }
    public static void main(String[] args){
        Interface obj=new Interface();
        obj.walk();
        obj.talk();
}
}

