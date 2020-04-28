package ds.array;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolateHackerRank {
	
public static void main(String[] args) {
	List<Integer> chocolates=new ArrayList<>();
	chocolates.add(4);
	chocolates.add(3);
	chocolates.add(4);
	chocolates.add(3);
	chocolates.add(1);
	chocolates.add(6);
	int date=7;
	int month=2;
	int numberOfWays=birthday(chocolates, date, month);
	System.out.println("number of ways "+numberOfWays);
}

static int birthday(List<Integer> s, int d, int m) {
    int sum=0;
    int totalChoc=s.size();
    for(int i=0;i<=totalChoc-m;i++){
        int weight=0;
        for(int j=i;j<i+m;j++){
           weight=weight+s.get(j);
        }
        if(weight==d)
        sum=sum+1;
    }
    return sum;
}

}
