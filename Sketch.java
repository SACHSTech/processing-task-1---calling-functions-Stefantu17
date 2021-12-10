import processing.core.PApplet;

public class Sketch extends PApplet {
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // Set size of application
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Set background colour to sky blue
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Stroke settings for foreground
    stroke(0,255,0);
    strokeWeight(4);

    // Fill rectangle in brown
    fill(139,69,19);

    // Foreground
    rect(-20, 375, 440, 400);

    // Fill everything else in white
    fill(255, 255, 255);

    // Stroke settings for ears
    strokeWeight(10);
    stroke(0);

    // Ears
    triangle(120,105,130,40,170,75);
    triangle(280,105,270,40,230,75);
    circle(200, 200, 250);

    // Set stroke settings for eyes and mouth
    strokeWeight(7);

    // Eyes and mouth
    arc(150, 175, 50, 50, -PI, 0);
    arc(250, 175, 50, 50, -PI, 0);
    arc(200, 225, 25, 25, 0, PI);

    // Stroke settings for body
    strokeWeight(2);
    stroke(0);

    // Lines for body
    line(200, 325, 200, 350);
    line(200, 350, 190, 374);
    line(200, 350, 210, 374);
    line(200, 338, 180, 340);
    line(200, 338, 220, 340);
  }
}