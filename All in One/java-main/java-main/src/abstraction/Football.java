package abstraction;

public class Football extends AbsSport{
    public static void main(String[] args) {
        Football obj= new Football();
        obj.exercise();
        obj.playing();
        obj.rest();
    }

    @Override
    void playing() {
        System.out.println("Playing football");
    }

    @Override
    void exercise() {
        System.out.println("Exercise is important before playing football");
    }
}
