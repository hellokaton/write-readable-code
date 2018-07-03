package chapter_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 把代码分成段落
 *
 * @author biezhi
 * @date 2018/7/3
 */
public class Example5 {

    private String findGameAccount(String username){
        return null;
    }

    private String findAccountArea(String account){
        return null;
    }

    public List<String> part1(List<String> users){
        List<String> accounts = users.stream().map(this::findGameAccount).collect(Collectors.toList());
        Map<String, String> accountArea = accounts.stream().collect(Collectors.toMap((account) -> account, this::findAccountArea));
        Set<Map.Entry<String, String>> entries = accountArea.entrySet();
        List<String> successUsers = new ArrayList<>();
//        for (Map.Entry<String, String> entry: entries) {
//            try {
//                System.out.println("给 ["+ entry.getKey() +"] ["+ entry.getValue() +"] 发送游戏道具");
//                System.out.println("给 ["+ entry.getKey() +"] 发送邮件通知");
//                successUsers.add(entry.getKey());
//            } catch (Exception e){
//                e.printStackTrace();
//            }
//        }
        System.out.println("2018-07-03 发送了["+ successUsers.size() +"]个 xxx 游戏道具");
        return successUsers;
    }

    public List<String> part2(List<String> users){
        // 查找游戏账号和大区
        List<String> accounts = users.stream().map(this::findGameAccount).collect(Collectors.toList());
        Map<String, String> accountArea = accounts.stream()
                .collect(Collectors.toMap((account) -> account, this::findAccountArea));

        // 给账号发送道具，并发送邮件通知
        List<String> successUsers = accountArea.entrySet().stream()
                .map(this::sendGameProp).collect(Collectors.toList());

        // 记录日志
        System.out.println("2018-07-03 发送了["+ successUsers.size() +"]个 xxx 游戏道具");
        return successUsers;
    }

    private String sendGameProp(Map.Entry<String, String> accountEntry){
        try {
            System.out.println("给 ["+ accountEntry.getKey() +"] ["+ accountEntry.getValue() +"] 发送游戏道具");
            System.out.println("给 ["+ accountEntry.getKey() +"] 发送邮件通知");
            return accountEntry.getKey();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
