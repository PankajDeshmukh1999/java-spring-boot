package strings;

public class DuplicateString {
    public static void main(String[] args) {

        String str ="Pankaj";
        StringBuilder stringBuilder = new StringBuilder(str);
        String rev =" ";

//        for (int i= stringBuilder.length()-1; i>=0;i--){
//            rev = rev + stringBuilder.charAt(i);
//        }
//        System.out.println(rev);

        for (int i=0; i<stringBuilder.length(); i++){
            for (int j=i+1; j<stringBuilder.length();j++){
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)){
                    stringBuilder.deleteCharAt(i);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
