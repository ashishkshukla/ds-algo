package ds.array;

public class MaxCoin {
public static void main(String[] args) {
	int[] coins={14,55,12,23};
	System.out.println(Strategy(coins));
	int [] coinsSet2 = { 20, 30, 6, 12, 21, 32}; 
	System.out.println(Strategy(coinsSet2));

}
public static int Strategy(int[] coins){
	int sum =0;
	for (int i=0;i<coins.length;i++)
		sum=sum+coins[i];
	return getMaxVal(coins, 0, coins.length-1, sum);
}

public static int getMaxVal(int[] coins,int i, int j, int sum){
	if(j==i+1)
		return Math.max(coins[i], coins[j]);
	return Math.max((sum-getMaxVal(coins, i+1, j, sum-coins[i])),(sum-getMaxVal(coins, i, j-1, sum-coins[j])));
}
}
