public class ReverseStringRec {

    public static String reverse(String string){
        if(string.isBlank() || string.length() == 1){
            return string;
        }
        return reverse(string.substring(1)) + string.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }
}
