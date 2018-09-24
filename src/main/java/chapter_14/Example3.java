package chapter_14;

import java.util.*;

/**
 * 删除无用代码
 *
 * @author biezhi
 * @date 2018/9/24
 */
public class Example3 {

    public Map<String, String> readData(){
        Map<String, String> result = new HashMap<>();
        result.put("title", i18n("title", "cn"));
        result.put("bannerText", i18n("bannerText", "cn"));
        result.put("copyright", i18n("copyright", "cn"));

        return result;
    }

    public String i18n(String key, String language){
        return "";
    }
}
