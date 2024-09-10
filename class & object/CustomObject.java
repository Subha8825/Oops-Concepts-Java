class Main {
    String name;
    int num;
    public void display() {
        System.out.println(name);
        System.out.println(num);
    }
    public void setValues(String str, int n) {
        name = str;
        num = n;
    }
}
class CustomObject {
    public static void main(String[] args){
        Main obj = new Main();
        obj.setValues("RDX", 10);
        obj.display();

        Main ob = new Main();
        ob.setValues("X25", 100);
        ob.display();
    }
}

// DX
// 10
// X25
// 100
