package Tugas;

public class ConsoleWindow extends Window {
    public ConsoleWindow() {

    }

    public ConsoleWindow(String title) {
        super(title);
    }

    @Override
    public void display() {
        System.out.println("[Console Window] display: " + getTitle());
    }
}
