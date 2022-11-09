package assignment;

public class Cube55 {

    double height = 6,VolumeOfCube;
    double width = 5;
    double depth = 4;

    public void volumeOfCube(){

        VolumeOfCube = height*width*depth;

        System.out.println("Volume of cube is :"+VolumeOfCube);

    }

    public static void main(String[] args) {
        Cube55 cube55= new Cube55();
        cube55.volumeOfCube();
    }

}
