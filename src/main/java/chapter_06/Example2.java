package chapter_06;

/**
 * 不用为了注释而注释
 * 不要给不好的名字加注释——应该把名字改好
 *
 * @author biezhi
 * @date 2018/7/6
 */
public class Example2 {

	static class Node {

		String name;
	}

	/**
	 * 查找具有给定名称的节点或者返回一个null
	 *
	 * 1. 如果深度 <= 0, 只检查子树
	 * 2. 如果深度 == N, 只检查子树和 N 级以下
	 */
	Node findNodeInSubTree(Node subTree, String name, int depth) {
		return null;
	}

	/**
	 * 对请求中的回复状态做限制
	 * <p>
	 * 例如返回的项目数或总字节大小等。
	 */
	void cleanReply(String request, String reply) {

	}

	/**
	 * 对请求做一个限制，确保回复状态符合 “次数/字节” 等等
	 * @param request
	 * @param reply
	 */
	void enforceLimitsForRequest(String request, String reply){

	}

	/**
	 * 释放本地的 registryKey，不会修改注册中心的实际数据
	 */
	void releaseRegistry(String registryKey) {

	}

}
