class Itself{
    public static void print(int a){
        if(a==1)
        {
            System.out.println(a);
        }
        else{
            System.out.println(a);
            print(a-1);

        }

    }
    public static void main(String[] args){
        print(10);
    }
}


// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1