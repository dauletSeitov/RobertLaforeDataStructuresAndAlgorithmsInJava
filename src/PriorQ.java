import java.util.PriorityQueue;

public class PriorQ {


	public static void main (String [] arg){

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.offer(3);
		pq.offer(5);
		pq.offer(8);
		pq.offer(1);
		pq.offer(33);


		while (!pq.isEmpty()){

			System.out.println(pq.poll());

		}


	}


} 