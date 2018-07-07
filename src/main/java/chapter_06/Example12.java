package chapter_06;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 采用信息量高的词
 *
 * @author biezhi
 * @date 2018/7/7
 */
public class Example12 {

	/**
	 * 该类包含许多成员，这些成员和数据库存储的信息相同，但是为了提高速度而存储在此处。
	 * 在后面读取此类时，首先检查这些成员是否存在，如果存在，则返回; 否则从数据库中读取数据存储在这些成员中返回。
	 */
	class StoreAccounts {

		String     username;
		String     roleName;
		Integer    score;
		LocalDate  birthday;
		BigDecimal amount;
		// ...
	}

	/**
	 * 从街道地址中删除多余的空格，并进行大量其他清理，如将“Avenue”变为“Ave”。
	 * <p>
	 * 如果有两个不同的街道地址输入有细微的不同，它们会被清理成同一个版本，我们可以检测到它们是相同的。
	 */
	public void cleanStreet() {
		// "heuristic" "bruteforce" "native to solution"
	}
}
