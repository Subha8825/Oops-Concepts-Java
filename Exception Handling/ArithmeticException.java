class ArithmeticException{
    public static void main(String[] args){
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(Exception E){
            System.out.println("b is 0");
        }
        finally{ // if error occurs also its print and without error also its print
            System.out.println("finally block");
        }

        System.out.println("hello world");
    }
}

// b is 0
// finally block
// hello world