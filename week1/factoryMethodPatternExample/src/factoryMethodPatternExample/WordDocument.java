package factoryMethodPatternExample;

public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening a Word document...");
    }
}