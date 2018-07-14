package chapter_09;

/**
 * 总结变量
 *
 * @author biezhi
 * @date 2018/7/14
 */
public class Example2 {

    class User {

        long id;
    }

    class Request {

        User user;
    }

    class Document {

        long ownerId;
    }

    public void part1(Request request, Document document) {
        if (request.user.id == document.ownerId) {
            // 允许该用户编辑文档
        }
        if (request.user.id != document.ownerId) {
            // 文档只读
        }
    }

    public void part2(Request request, Document document) {
        boolean userOwnsDocument = (request.user.id == document.ownerId);
        if (userOwnsDocument) {
            // 允许该用户编辑文档
        }
        if (!userOwnsDocument) {
            // 文档只读
        }
    }

}
