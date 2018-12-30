package ktl.extensions;

public class StringUtils {

    public static String javaUpperCaseFirstLetter(String st){
    return st.substring(0, 1).toUpperCase() + st.substring(1);
    }
}
