package chapter_06;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 精确的描述方法的行为
 *
 * @author biezhi
 * @date 2018/7/7
 */
public class Example9 {

	/**
	 * 返回此文件中的行数
	 * count how many newline bytes ('\n') are in the file
	 */
	int countLines(String fileName) {
		try {
			return Files.readAllLines(Paths.get(fileName)).size();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
