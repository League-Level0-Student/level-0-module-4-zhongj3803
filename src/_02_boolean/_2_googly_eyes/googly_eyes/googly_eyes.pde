PImage face;
int x=266;
int y=282;
void setup() {
face = loadImage("face (2).jpg");
face.resize(width,height);
size(800,600);
face.resize(width,height);
}
void draw() {
background(face);
fill (#FFFFFF);
ellipse(x,y,110,110);
ellipse(x+185,y+7,110,110);

boolean xInBetween = false;
if (mouseX < x+50 && mouseX > x-50) {
  xInBetween = true;
}
boolean yInBetween = false;
if (mouseY < y+50 && mouseY > y-50) {
  yInBetween = true; 
}
boolean xInBetween1 = false;
if (mouseX < x+185+50 && mouseX > x+185-50) {
  xInBetween1 = true;
}
boolean yInBetween1 = false;
if (mouseY < y+7+50 && mouseY > y+7-50) {
  yInBetween1 = true; 
}
fill(#030303);
if (xInBetween && yInBetween) {
ellipse(mouseX,mouseY,20,20);
ellipse(mouseX+185,mouseY+7,20,20);
}
else if (xInBetween1 && yInBetween1) {
ellipse(mouseX,mouseY,20,20);
ellipse(mouseX-185,mouseY-7,20,20);
}
else {
ellipse(x,y,20,20);
ellipse(x+185,y+7,20,20);
}
}
