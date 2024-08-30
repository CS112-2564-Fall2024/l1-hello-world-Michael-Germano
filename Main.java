public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        voidMethod(10, 15);
    }

    public static void voidMethod(int num1, int num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + add(num1, num2));
    }
    
    public static int add(int num1, int num2) {
        
        return num1 + num2;
    }

}