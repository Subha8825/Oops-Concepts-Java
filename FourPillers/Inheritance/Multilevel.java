class GrandFather{
    int pro=35;
    void male(){
        System.out.println(" i have 50 pro");
    }
}
class Father extends GrandFather{
    //int pro =45;
    void male(){
        System.out.println(" i have 45 pro");

    }

}
class Son extends Father{

}
class Multilevel{
    public static void main(String[] args){
        Son obj=new Son();
        System.out.println(obj.pro);
        obj.male();
    }
}

// 45
// i have 50 pro

// 35
//  i have 45 pro