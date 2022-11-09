package strings;

public class StringDemo {
    public static void main(String[] args) {
//        char[] arr = {'M','U','M','B','A','I'};

        String str = new String("pune");//2
        String str1 = "pune";//0
        String str2 = "pune";//0
        String str3 = "pune";//0
        String str4 = new String("pune");//1
        String str5 = new String("pune");//1

        System.out.println(str==str1); //reference(boolean)
        System.out.println(str.equalsIgnoreCase(str1));  //content
        System.out.println(str1.concat("city"));   //connect one string to another string
        System.out.println(str1.hashCode());       // generate number
    }
}
// String is immutable (scp= string cons. pool)
