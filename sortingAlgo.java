import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sortingAlgo extends PApplet {

float[] values;

public void setup(){
  
  values = new float[width];
  for(int i = 0; i < values.length; i++)
  {
    values[i] = random(height);
  }
  
  for(int i = 0; i < values.length; i++)
  {
    for(int j = 0; j < values.length - i - 1; j++)
    {
    float a = values[j];
    float b = values[j + 1];
    if(a > b){
      swap(values, j, j+1);
    }
    }
  }
}

public void draw(){
 background(0);
 for(int i = 0; i < values.length; i++)
  {
    stroke(225);
    line(i, height, i, height - values[i]);
  }
}

public void swap(float[] arr, int a, int b)
{
   float temp = arr[a];
   arr[a] = arr[b];
   arr[b] = temp;
}
  public void settings() {  size(600, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sortingAlgo" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
