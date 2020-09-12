package utils;

/**
 * description
 *
 * @author liuzhixiang 2020/08/04 22:09
 */
public class StringUtils {

    private StringUtils(){
        
    }

    public static boolean isNull(String string){
        if (string == null || "".equals(string.trim())) {
            return true;
        }
        System.out.println();
        return false;
    }

    public static boolean isNotNull(String string){
        return !isNull(string);
    }
}
