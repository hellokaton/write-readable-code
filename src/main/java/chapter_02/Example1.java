package chapter_02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author biezhi
 * @date 2018/6/24
 */
public class Example1 {

    Queue<Node> nodes = new LinkedList<Node>();

    public Example1() {
        nodes.add(new Node());
        nodes.add(new Node());
    }

    public void snippet1() {
        for (Node node = nodes.peek(); node != null; node = node.next()) {
            System.out.println(node.data());
        }
    }

    public void snippet2() {
        Node node = nodes.peek();
        if (node == null) return;
        while (node.next() != null) {
            System.out.println(node.data());
            node = node.next();
        }
        if (node != null) System.out.println(node.data());
    }

}
