package strings;

public class RemoveAllSpace {
    public static void main(String[] args) {
        String str = "India         is  my country";
        str = str.replaceAll("","");
        System.out.println(str);
    }
}
