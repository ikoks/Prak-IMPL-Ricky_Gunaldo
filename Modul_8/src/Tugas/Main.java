package Tugas;

public class Main {
    public static void main(String[] args) {
        DrawingContext context = new DrawingContext();

        ConsoleWindow cw = new ConsoleWindow("Console");
        DialogBox db = new DialogBox("Save Dialog");
        DataController dc = new DataController();
        db.setController(dc);

        Frame frame = new Frame(cw);
        frame.getMainWindow().open();
        frame.getMainWindow().display();

        Circle c = new Circle(15f, new Point(25, 25));
        c.draw(context);
        System.out.println("Circle area = " + c.area());
        System.out.println("Circle circum = " + c.circum());

        Rectangle r = new Rectangle(new Point(13, 30), 50, 25);
        r.draw(context);
        Point[] pts = {new Point(0, 0), new Point(20, 50), new Point(30, 60), new Point(0, 30)};
        Polygon p = new Polygon(pts);
        p.draw(context);
    }
}