package chapter_04;

import chapter_02.Node;

import java.util.List;

/**
 * 如何权衡多个备选名字
 * ==========================================
 * experiment_id: 100
 * description: "increase font size to 14pt"
 * traffic_fraction: 5%
 * ==========================================
 *
 * @author biezhi
 * @date 2018/6/27
 */
public class Example6 {

    private void shrinkList(List<Node> list, int maxSize) {
        while (list.size() > maxSize) {
            freeNode(list.remove(0));
        }
    }

    private void freeNode(Node node) {
        System.out.println("释放了 node: " + node);
    }

}
