package design.pattern.template;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process((r, n) -> r += n);
        System.out.println(result);
    }
}
