import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {

		// (head) <- ooooooooooo <- (tail) FIFO
		
		// Bounded - max 3
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		// BlockingQueue() .put() and .take() are blocking...
		// also can have timer on .offer()/.poll()
		// queues, blocking queue good for multi-threading
		// note: LinkList Queue is unbounded
		
		
		//System.out.println("q1 element " + q1.element());
		// throws NoSuchElementException

		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("q1 element " + q1.element());	// 10
		
		try {
			q1.add(40);	// IllegalStateException: Queue full, runtime exception
			
		} catch (IllegalStateException e) {
			//e.printStackTrace();
			System.out.println(" -- q1 full ");
		}
		
		for( Integer i: q1) {
			System.out.println(i);
		}
		
		System.out.println("q1: " + q1);	// [10, 20, 30]
		
		System.out.println("Removed " + q1.remove());	// 10
		System.out.println("Removed " + q1.remove());	// 20
		System.out.println("Removed " + q1.remove());	// 30
		
		try {
			System.out.println("Removed " + q1.remove());	// NoSuchElementException
			
		} catch (NoSuchElementException e) {
			System.out.println(" -- q1 empty ");		
		}
		
		
		////////////////////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		System.out.println("q2 peek " + q2.peek());	// null

		q2.offer(10);
		q2.offer(20);
		
		System.out.println("q2 peek " + q2.peek());	// 10

		if( q2.offer(30) == false ) {
			System.out.println("Failed to add third item");
		}
		
		System.out.println("q2: " + q2);	// [10, 20]
		
		for( Integer i: q2) {
			System.out.println(i);
		}

		System.out.println("Poll " + q2.poll());	// 10
		System.out.println("Poll " + q2.poll());	// 20
		System.out.println("Poll " + q2.poll());	// null

	}
	
}
