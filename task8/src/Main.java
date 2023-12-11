import Memento.Paint;
import Memento.PaintMemento;

public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint(new PaintMemento(""));

        paint.draw("***---***");
        paint.save();
        System.out.println(paint.GetCurrentState());

        paint.draw("***");
        paint.save();
        System.out.println(paint.GetCurrentState());

        paint.restore();
        System.out.println(paint.GetCurrentState());
    }
}