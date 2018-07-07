package chapter_06;

import java.util.Vector;

/**
 * 给常量加注释
 *
 * @author biezhi
 * @date 2018/7/6
 */
public class Example5 {

	private static final int NUM_THREADS = 8;

	// 添加一个限制，没有人可以订阅这么多
	private static final int MAX_RSS_SUBSCRIPTIONS = 1000;

	private static final double IMAGE_QUALITY = 0.72D;

	// force vector to relinquish its memory (look up "STL swap trick")
	static class Recorder {

		Vector<Float> data;

		void clear() {
			swap(data); // ??? 不是执行 data.clear() 么，什么鬼。。。
		}

		private void swap(Vector<Float> data) {

		}
	}
}
