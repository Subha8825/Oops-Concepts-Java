class Throw {
    static void check(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age invalid");
        }
    }

    public static void main(String[] args) {
        try {
            check(17);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("hello world");
    }
}

// Age invalid
// hello world
