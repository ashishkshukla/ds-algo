package practice;
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int n= game.length;
        int index=0;
        boolean ifWins=false;
        boolean [] visited = new boolean[n];
        for(int i=0;i<n;i++)
        visited[i]=false;

        while(index < n-1 && index >=0  && visited[index]==false ){
            if(index>=0 && index < n-1)
           visited[index]=true;
              if(index+leap <n-1){
                   if(game[index+leap]==0)
                   index=index+leap;
                   else if(game[index+1]==1){
                    index=index-1;
                   }else 
                   {
                    index=index+1;
                   }
              }else{
                  index=index+leap;
                  ifWins=true;
              }

           
        }

        return ifWins;
        // Return true if you can win the game; otherwise, return false.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

