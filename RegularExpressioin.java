import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressioin {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[7-8][0-9]{8}[7-8]");
        Matcher m =p.matcher("7830296478");
        int c=0;
        while(m.find())
        {
            c++;
        }
        System.out.println(c);
    }
}
