package algo.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {
	public static void main(String[] args) {
		int v[] = { 30, 20, 100, 90,160 };
		int w[] = { 5, 10, 20, 30, 40 };
		double knapsackSize = 60;
		Knapsack knapsack = new Knapsack();
		ItemValue[] itemVal = new ItemValue[v.length];

		for (int i = 0; i < v.length; i++) {
			itemVal[i] = knapsack.new ItemValue(v[i], w[i]);
		}

		Arrays.sort(itemVal, new Comparator<ItemValue>() {

			@Override
			public int compare(ItemValue o1, ItemValue o2) {
				return o2.cost.compareTo(o1.cost);
			}

		});

		performKnapSack(itemVal, knapsackSize);
       for(int i=0;i<itemVal.length;i++)
    	   System.out.println(itemVal[i].cost);
	}

	public static void performKnapSack(ItemValue[] itemVal, double knapsackSize) {
		double sum = 0;

		for (ItemValue item : itemVal) {
			if (item.w <= knapsackSize) {
				knapsackSize = knapsackSize - item.w;
				sum = sum + item.v;
			} else {
				double fraction = knapsackSize / item.w;
				sum = sum + (item.v * fraction);
				break;
			}

		}
		System.out.println(sum);

	}

	public class ItemValue {
		double v;
		double w;
		Double cost;

		public ItemValue(double v, double w) {
			this.v = v;
			this.w = w;
			this.cost = v / w;
		}
	}
}
