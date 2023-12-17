import java.util.Random;

public class Animal {

    private String name;
    private int x_axis;
    private int y_axis;

    public Animal(String name) {
        this.name = name;
        this.x_axis = new Random().nextInt(101);
        this.y_axis = new Random().nextInt(101);
    }

    public int getX_axis() {
        return x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }



    public String getName() {
        return name;
    }
    public void move(){
       x_axis = new Random().nextInt(101);
       y_axis = new Random().nextInt(101);
    }
}
