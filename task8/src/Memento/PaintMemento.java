package Memento;

public class PaintMemento {
    private final String paintState;

    public PaintMemento(String paintState) {
        this.paintState = paintState;
    }

    public String getState() {
        return paintState;
    }

}