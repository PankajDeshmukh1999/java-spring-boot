package strings;

public class StringDemo1 {
    public static void main(String[] args) {

        String str = "pune";

        System.out.println(str.concat("city"));

//        StringBuffer stringBuffer = new StringBuffer("Pune");  //StringBuffer is synchronized,immutable
//        stringBuffer.append(" city");
//        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Mumbai");// not synchronized, mutable
        stringBuilder.append("city");
        System.out.println(stringBuilder);

    }
}
