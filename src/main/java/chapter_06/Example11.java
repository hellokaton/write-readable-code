package chapter_06;

import java.util.List;

/**
 * 声明代码的意图
 *
 * @author biezhi
 * @date 2018/7/7
 */
public class Example11 {
	static class Product{
		Integer price;
	}
	public void displayProducts(List<Product> products){
		products.sort(this::compareProductByPrice);

		// 以相反的顺序遍历列表
		for (int i = products.size() - 1; i >= 0; i--) {
			displayPrice(products.get(i).price);
		}
	}

	private void displayPrice(Integer price) {
	}

	private int compareProductByPrice(Product p1, Product p2) {
		return p2.price.compareTo(p1.price);
	}

}
