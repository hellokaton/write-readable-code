package chapter_04;

/**
 * list.size
 *
 * @author biezhi
 * @date 2018/6/27
 */
public class Example5 {

    static class List<E> {
        private E[] data;
        private int pos;

        public List(E[] data) {
            this.data = data;
        }

        int countSize() {
            int size = 0;
            for (E e: data) {
                if (null != e) {
                    size += 1;
                }
            }
            return size;
        }

        int size() {
            return data.length - pos;
        }

        E popBack() {
            pos++;
            E lastItem = data[data.length - pos];
            data[data.length - pos] = null;
            return lastItem;
        }

    }

    private void shrinkList(List<String> list, int maxSize) {
        while (list.size() > maxSize) {
            freeNode(list.popBack());
        }
    }

    private void freeNode(String item) {
        System.out.println("释放了: " + item);
    }

    public static void main(String[] args) {
        String[] items = new String[10_0000];

        for (int i = 0; i < items.length; i++) {
            items[i] = "hello_#" + i;
        }

        List<String> list     = new List<>(items);
        Example5     example5 = new Example5();
        long startMs = System.currentTimeMillis();
        example5.shrinkList(list, 10);
        System.out.println((System.currentTimeMillis() - startMs) + "ms");
    }

}
