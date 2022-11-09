package assignment;

public class Rectangle59 {
    double length ;
    double width ;
    double rectangleArea;
    double rectanglePerimeter;

    Rectangle59(double length,double width){
        this.length = length;
        this.width = width;

        System.out.println("Length="+length+ " Width="+width);
    }

    public void rectangleArea(){
        rectangleArea = length * width;
        System.out.println(rectangleArea);
    }
    public void rectanglePerimeter(){
        rectanglePerimeter = 2*length * 2*width;
        System.out.println(rectanglePerimeter);

    }

    public static void main(String[] args) {
        Rectangle59 rectangle59 = new Rectangle59(4,5);
        rectangle59.rectangleArea();
        rectangle59.rectanglePerimeter();

        System.out.println("Rectangle of Area:"+rectangle59.rectangleArea);
        System.out.println("Rectangle of Perimeter:"+rectangle59.rectanglePerimeter);

    }

}
