package chapter_05;

import java.util.Map;

/**
 * 在需要时使用对齐
 *
 * @author biezhi
 * @date 2018/7/3
 */
public class Example3 {

    private Request request = new Request();

    static class Request {
        Request GET;
        Request POST;
        private Map<String, String> values;

        public String get(String key) {
            return values.get(key);
        }
    }

    public void part1() {
        // 从 POST 中获取数据
        String company       = request.POST.get("company");
        String kindergarten  = request.POST.get("kindergarten");
        String subwayStation = request.POST.get("subwayStation");
        String zoo           = request.POST.get("zoo");

    }

    public void part2() {
        // 从 POST 中获取数据
        String company       = request.POST.get("company");
        String kindergarten  = request.POST.get("kindergarten");
        String subwayStation = request.POST.get("subwayStation");
        String zoo           = request.POST.get("zoo");

        if (null != company) { /* company */}
        if (null != subwayStation) { /* subwayStation  // 这不是去幼儿园的车？*/}
        if (null != zoo) { /* zoo  */}
        if (null != kindergarten) { /* kindergarten // 为什么我在幼儿园？ */}
    }

}