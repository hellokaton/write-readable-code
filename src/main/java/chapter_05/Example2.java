package chapter_05;

/**
 * 重新安排换行来保持一致和紧凑
 *
 * @author biezhi
 * @date 2018/7/3
 */
public class Example2 {

    static class Cookie {
        private String name;
        private String value;
        private int maxAge;
        private boolean isSecure;

        public Cookie(String name, String value, int maxAge, boolean isSecure) {
            this.name = name;
            this.value = value;
            this.maxAge = maxAge;
            this.isSecure = isSecure;
        }
    }

    public void part1(){
        Cookie c1 = new Cookie(
                "uid",/* key */
                "2018",  /* value */
                1800,/* expire time, seconds */
                false /* is safe */
        );

        Cookie c2 = new Cookie(
                "PICK_KEY",/* key */
                "ahmd13ldsws8cw",  /* value */10800,/* expire time, seconds */
                true /* is safe */
        );

        Cookie c3 = new Cookie("REMEMBER_ME",/* key */
                "true",  /* value */10800,/* expire time, seconds */
                true /* is safe */
        );
    }

    public void part2(){
        // Cookie(name,  value ,  maxAge, isSecure)
        //      [string | string | seconds | true/false]
        Cookie c1 = new Cookie("uid", "2018", 1800,false);
        Cookie c2 = new Cookie("PICK_KEY", "ahmd13ldsws8cw",10800,true);
        Cookie c3 = new Cookie("REMEMBER_ME","true",10800,true);
    }

}
