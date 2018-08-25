package chapter_12;

import java.util.HashMap;
import java.util.Map;

/**
 * 大一点的例子
 *
 * @author biezhi
 * @date 2018/8/25
 */
public class Example3 {

    private Map<String, Map<String, Integer>> counts = new HashMap<>();

    class EventLog {
        String exitState;

        boolean hasExitState() {
            return exitState != null;
        }

    }

    class HttpHeaders {
        int    code;
        String contentType;

        boolean hasResponseCode() {
            return true;
        }

        boolean hasContentType() {
            return true;
        }
    }

    class HttpDownload {
        EventLog    eventLog;
        HttpHeaders httpHeaders;

        boolean hasEventLog() {
            return eventLog != null;
        }

        boolean hasHttpHeaders() {
            return httpHeaders != null;
        }
    }

    void updateCounts1(HttpDownload hd) {
        // counts["exitState"][hd.exitState()]++;     "SUCCESS" | "FAILURE"
        // counts["httpStatus"][hd.statusCode()]++;   "404" | "200"
        // counts["contentType"][hd.contentType()]++; "text/html" | "application/json"
    }

//    void updateCounts2(HttpDownload hd) {
//        if (!hd.hasEventLog() || !hd.eventLog.hasExitState()) {
//            int plus = 0; // 计算当前值+1
//            counts.get("exitState").putIfAbsent("unknown", plus);
//        } else {
//            int    plus  = 0;
//            String state = hd.eventLog.exitState;
//            counts.get("exitState").putIfAbsent(state, plus);
//        }
//
//        if (!hd.hasHttpHeaders()) {
//            int plus = 0;
//            counts.get("httpStatus").putIfAbsent("unknown", plus);
//            counts.get("contentType").putIfAbsent("unknown", plus);
//            return;
//        }
//
//        HttpHeaders httpHeaders = hd.httpHeaders;
//
//        // 记录 httpStatus 的计数，不存在则记录为 unknown
//        if (!httpHeaders.hasResponseCode()) {
//            int plus = 0; // 计算当前值+1
//            counts.get("httpStatus").putIfAbsent("unknown", plus);
//        } else {
//            int    plus = 0;
//            String code = String.valueOf(httpHeaders.code);
//            counts.get("httpStatus").putIfAbsent(code, plus);
//        }
//
//        // 记录 contentType 的计数，不存在则记录为 unknown
//        if (!httpHeaders.hasContentType()) {
//            int plus = 0;
//            counts.get("contentType").putIfAbsent("unknown", plus);
//        } else {
//            int    plus        = 0;
//            String contentType = httpHeaders.contentType;
//            counts.get("contentType").putIfAbsent(contentType, plus);
//        }
//    }

    void updateCounts3(HttpDownload hd) {
        String exitState = "unknown";
        String httpStatus = "unknown";
        String contentType = "unknown";

        if (hd.hasEventLog() && hd.eventLog.hasExitState()) {
            exitState = hd.eventLog.exitState;
        }

        if(hd.hasHttpHeaders() && hd.httpHeaders.hasResponseCode()){
            httpStatus = String.valueOf(hd.httpHeaders.code);
        }

        if(hd.hasHttpHeaders() && hd.httpHeaders.hasContentType()){
            contentType = hd.httpHeaders.contentType;
        }

        int plus = 0; // 计算当前值+1
        counts.get("exitState").putIfAbsent(exitState, plus);
        counts.get("httpStatus").putIfAbsent(httpStatus, plus);
        counts.get("contentType").putIfAbsent(contentType, plus);
    }

}
