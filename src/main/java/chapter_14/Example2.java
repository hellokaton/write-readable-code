package chapter_14;

/**
 * 缓存设计
 * <p>
 * 读取 a.txt
 * 读取 a.txt
 * 读取 a.txt
 * 读取 b.txt
 * 读取 b.txt
 * 读取 c.txt
 * 读取 d.txt
 * 读取 d.txt
 *
 * @author biezhi
 * @date 2018/9/24
 */
public class Example2 {

    private DiskText lastUsed;

    // 加载磁盘文件
    public DiskText loadDiskText(String key) {
        // 从本地加载
        return new DiskText(key, "");
    }

    // 根据 key 获取磁盘文件
    public DiskText lookUp(String key) {
        if (lastUsed == null || !lastUsed.key().equals(key)) {
            lastUsed = loadDiskText(key);
        }
        return lastUsed;
    }

    class DiskText {
        private String key;
        private String value;

        public DiskText(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String value() {
            return value;
        }

        public String key() {
            return key;
        }
    }

}