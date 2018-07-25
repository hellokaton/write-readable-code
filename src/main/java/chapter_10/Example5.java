package chapter_10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 把定义向下移
 *
 * @author biezhi
 * @date 2018/7/25
 */
public class Example5 {

    private static final int MAX_SPAM_VOTES = 10;

    private Map<Long, Message>     messages = new HashMap<>();
    private Map<Long, List<Reply>> replies  = new HashMap<>();

    class Message {
        int           viewCount;
        LocalDateTime lastViewTime;

        public void save() {
            // do save
        }
    }

    class Reply {
        int spamVotes;
    }

//    public List<Reply> viewFilterdReplies(Long originalId) {
//        List<Reply> filteredReplies = new ArrayList<>();
//        Message     rootMessage     = messages.get(originalId);
//        List<Reply> allReplies      = replies.get(originalId);
//
//        rootMessage.viewCount += 1;
//        rootMessage.lastViewTime = LocalDateTime.now();
//        rootMessage.save();
//
//        for (Reply reply : allReplies) {
//            if (reply.spamVotes > MAX_SPAM_VOTES) {
//                filteredReplies.add(reply);
//            }
//        }
//        return filteredReplies;
//    }

    public List<Reply> viewFilterdReplies(Long originalId) {

        Message rootMessage = messages.get(originalId);
        rootMessage.viewCount += 1;
        rootMessage.lastViewTime = LocalDateTime.now();
        rootMessage.save();

        List<Reply> filteredReplies = new ArrayList<>();
        List<Reply> allReplies      = replies.get(originalId);
        for (Reply reply : allReplies) {
            if (reply.spamVotes > MAX_SPAM_VOTES) {
                filteredReplies.add(reply);
            }
        }
        return filteredReplies;
    }

}
