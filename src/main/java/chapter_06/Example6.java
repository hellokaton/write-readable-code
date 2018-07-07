package chapter_06;

/**
 * 公布可能的陷阱
 *
 * @author biezhi
 * @date 2018/7/6
 */
public class Example6 {

	// 调用外部API发送邮件，1分钟后超时。
	void sendEmail(String to, String subject, String body) {

	}

	// 运行时间可以达到 O(标签数 * 标签深度)，小心深层嵌套的输入
	void fixBrokenHtml(String html) {

	}

	/**
	 * 这个文件包含一些辅助方法，为我们的文件系统提供了方便的接口。
	 * 它处理了文件权限和一些其他的细节。
	 */
	class BiezhiUtils {

	}
}
