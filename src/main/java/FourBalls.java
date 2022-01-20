import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int wSpeed = 1;
    int xSpeed = 2;
    int ySpeed = 3;
    int zSpeed = 4;
    int wHeight = HEIGHT / 5;
    int xHeight = 2 * (HEIGHT / 5);
    int yHeight = 3 * (HEIGHT / 5);
    int zHeight = 4 * (HEIGHT / 5);

    public static void main(String[] args) {PApplet.main("FourBalls", args); }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        paintBackgroundWhite();
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {

        ellipse(wSpeed, wHeight, DIAMETER,DIAMETER);
        wSpeed += 1;

        ellipse(xSpeed, xHeight, DIAMETER,DIAMETER);
        xSpeed += 2;

        ellipse(ySpeed, yHeight, DIAMETER,DIAMETER);
        ySpeed += 3;

        ellipse(zSpeed, zHeight, DIAMETER,DIAMETER);
        zSpeed += 4;
    }

    private void paintBackgroundWhite() {
        background(255);
    }
}

