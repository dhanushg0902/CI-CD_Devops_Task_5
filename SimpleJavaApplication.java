public class SimpleJavaApplication {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Dhanush");
        
        myObject.displayMessage();
        
        int result = myObject.add(5, 3);
        System.out.println("Result of addition: " + result);
    }
}

class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public void displayMessage() {
        System.out.println("Hello, " + name + "!");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
