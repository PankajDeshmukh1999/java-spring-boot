package java8;

public class DefaultAndStatic implements MyInterface6 ,MyInterface7{
    public static void main(String[] args) {
        DefaultAndStatic obj = new DefaultAndStatic();

        System.out.println(obj.msg());
        System.out.println(obj.add(5,6,9));
        System.out.println(MyInterface6.display());

    }

    @Override
    public String msg() {
        return "hi";
    }

    @Override
    public int add(int i, int j,int k) {
        return MyInterface7.super.add(i, j , k);
    }
}
interface MyInterface6{
    String msg();

    default int add(int i, int j){
        return i+j;
    }
    static String display(){
        return "In static method";
    }

}
interface MyInterface7{
    default int add(int i, int j, int k){
        return i+j+k;
    }
}
