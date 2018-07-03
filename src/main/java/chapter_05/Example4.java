package chapter_05;

/**
 * 把声明按块组织起来
 *
 * @author biezhi
 * @date 2018/7/3
 */
public class Example4 {

    interface RouteContext {

        // 读取Request信息
        String uri();
        String contentType();
        String header(String name);
        String cookie(String name);
        String pathString(String name);

        // 向Request写入数据
        RouteContext attribute(String key, Object value);

        // 向客户端发送数据
        void render(String view);
        RouteContext status(int status);

    }

}
