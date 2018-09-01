package chapter_13;

/**
 * 清楚的描述逻辑
 *
 * @author biezhi
 * @date 2018/9/1
 */
public class Example1 {

    private boolean isAdminRequest(){
        return false;
    }

    private String noAuthorized(){
        return "authorized.html";
    }

    class Session {

        public String getAttribute(String key) {
            return "";
        }
    }
    class Document {
        String username;
    }

    public String part1(Document document, Session session){
        boolean isAdmin = isAdminRequest();
        if(null != document){
            if(!isAdmin && document.username != session.getAttribute("username")){
                return noAuthorized();
            }
        } else {
            if(!isAdmin) {
                return noAuthorized();
            }
        }
        // 渲染正常页面
        return "biezhi.html";
    }

}
