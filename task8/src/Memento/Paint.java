package Memento;

public class Paint {
    private StringBuilder paint;
    private PaintMemento paintMemento;

    public void save() {
        this.paintMemento = new PaintMemento(paint.toString());
    }

    public void draw(String text) {
        paint.append(text);
    }

    public void restore() {
        this.paint = new StringBuilder(paintMemento.getState());
    }

    public String GetCurrentState() {
        return paintMemento.getState();
    }

    public Paint(PaintMemento paintMemento) {
        this.paint = new StringBuilder();
        this.paintMemento = paintMemento;
    }
}