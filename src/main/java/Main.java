public class Main {

    public static void main(String[] args) {
        String str1 = "hello";
        String str3 = str1.intern();
        String str2 = "hello";
        System.out.println(str2 == str3);
       System.out.println(str1.equals(str2));
    }

    public static String change(String newStr) {
        newStr += "World";
        return newStr;
    }
}
