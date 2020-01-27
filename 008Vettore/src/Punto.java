public class Punto {
    int x;
    int y;

    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Punto()
    {
        super();
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{ il Punto: \"X\":" + x + "," + "\"Y\":" + y + "}";
    }


}
