package chapter_05;

/**
 * 把声明按块组织起来
 *
 * @author biezhi
 * @date 2018/7/3
 */
public class Example4 {

    interface RouteContext {
        String contentType();
        String header(String name);
        String cookie(String name);
        RouteContext attribute(String key, Object value);
        String uri();
        void render(String view);
        RouteContext status(int status);
        String pathString(String name);
    }

}
