// Generic class
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

// Main class to test generics
public class GenericExample {
    public static void main(String[] args) {
        // Create a Box of Integer type
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(10);
        int intValue = integerBox.getContent();
        System.out.println("Integer value: " + intValue);

        // Create a Box of String type
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics!");
        String strValue = stringBox.getContent();
        System.out.println("String value: " + strValue);
    }
}
