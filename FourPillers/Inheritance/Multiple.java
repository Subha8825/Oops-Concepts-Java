interface Father{
    abstract void talk();
    abstract void walk();
}
interface Mother{
    abstract void talk();
    abstract void walk();

}
class Multiple implements Father,Mother{
    public void talk(){
        System.out.println("talking1");
    }
    public void walk(){
        System.out.println("walking2");
    }
    public static void main(String[] args){
        Multiple obj=new Multiple();
        obj.walk();
        obj.talk();
}
}


// walking2
// talking1