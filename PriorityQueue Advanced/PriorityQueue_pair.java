import java.util.*;
public class MyClass { 
    public static class pair{
        int v1=0;
        int v2=0;
        pair(int v1, int v2){
            this.v1 = v1;
            this.v2 = v2;      
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
          return a.v1-b.v1;  // for creating min heap priority queue
          // for creating max heap priority queue use return b.v1-a.v1;
        });
        
        for(int i=0;i<5;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            pq.add(new pair(a,b));
        }
        
        while(!pq.isEmpty()){
            pair k = pq.poll();
            System.out.println(k.v1 + " ok"  + k.v2);
            
        }
    }
}