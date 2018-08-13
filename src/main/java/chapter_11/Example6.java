package chapter_11;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * 按需重构接口
 *
 * @author biezhi
 * @date 2018/8/13
 */
public class Example6 {

    class Cipher {
        String method;
        String key;

        public Cipher(String method, String key) {
            this.method = method;
            this.key = key;
        }

        public byte[] update(String str) {
            return str.getBytes();
        }

    }

    private String toJson(Map<String, String> map) {
        return null;
    }

    public void foo() {
        Map<String, String> map = new HashMap<>();
        map.put("username", "biezhi");
        map.put("password", "123456");

        String url            = "http://exmaple.com/?user_info=" + urlSafeEncrypt(map);
        // ...
    }

    private String urlSafeEncrypt(Map<String, String> map){
        String json           = toJson(map);
        Cipher cipher         = new Cipher("aes_256", "pas5#w0rd");
        byte[] encryptedBytes = cipher.update(json);
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

}
