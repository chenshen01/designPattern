package utils;

/**
 * description
 *
 * @author liuzhixiang 2020/08/04 22:09
 */
public class StringUtils {

    public static boolean isNull(String string){
        if (string == null || "".equals(string.trim())) {
            return true;
        }
        return false;
    }

    public static boolean isNotNull(String string){
        return !isNull(string);
    }
}
