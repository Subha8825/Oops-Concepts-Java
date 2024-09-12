class Father{
    char gender;
    int age;
    void print(char gender,int age){
        this.gender=gender;
        this.age=age;
    }
}
class Daughter extends Father{
    char gender;
    
}

class This{
    public static void main(String[] args){
        Father ob=new Father();
        ob.print('M',25);
        System.out.println(ob.gender);
        System.out.println(ob.age);     
    }
}

// M
// 25