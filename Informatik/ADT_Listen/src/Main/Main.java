package Main;

import Suchen.LineareSuche;
import Suchen.BinaereSuche;

public class Main {

	public static int[] array = new int[100];
	
	public static void main(String args[]) {
		
		
			array = befuellen(array);
			
		System.out.println(BinaereSuche.Suchen(array,49));
		
		
		
	}
	
	public static int[] befuellen(int[] array) {
		
		for(int i = 0; i < array.length; i++ ) {
			array[i] = i+1;
		}
		return array;
	} //shhsw
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		
		ArrayQueue Queueii = new ArrayQueue(100);
		ArrayQueue Queueiii = new ArrayQueue(100);
		
		System.out.println(Queueii.Empty());
		Queueii.Enqueue(102);
		Queueii.Enqueue(992);
		for(int i = 0; i<19; i++) {
			Queueii.Enqueue(i);
		}
		System.out.println(Queueii.Front());
		Queueii.Dequeue();
		Queueii.Dequeue();
		System.out.println(Queueii.Front());
		
		for(int i =19; i > 0; i--) {
			Queueiii.Enqueue(i);
		}
		
		Queueii.concat(Queueiii);
		Queueii.Dequeue();
		Queueii.Dequeue();
		Queueii.Dequeue();
		System.out.println(Queueii.Front());
		System.out.println(Queueii.search(99));
		
		/*
		ArrayStack Stacki = new ArrayStack(100);
		ArrayStack tmp =new ArrayStack(100);
		ArrayStack copy =new ArrayStack(100);
		
		for(int i =0; i<100; i++) {
			Stacki.push(i);
			
		}
		System.out.println("copystartet");
		while(Stacki.empty() ==false) {
			System.out.println(Stacki.top());
			tmp.push(Stacki.top());
			Stacki.pop();
		}
		System.out.println("tmpr�ckcopy");
		while(tmp.empty() ==false) {
			System.out.println(tmp.top());
			int x = tmp.top();
			Stacki.push(x);
			copy.push(x);
			tmp.pop();
		}
		System.out.println(Stacki.top());
		System.out.println(copy.top());
		*/
		
		
		/*
		
		ListenElement element1 = new ListenElement(4);
		ListenElement element2 = new ListenElement(42);
		Queue myQueue = new Queue(3);
		myQueue.enqueue(6);
		System.out.println("Gr��e: " + myQueue.getGroesse());

		try {
			myQueue.dequeue();
		} catch (Exception e) {

			System.out.println("Die ist leer!");
		}

		System.out.println("Gr��e: " + myQueue.getGroesse());
*/
	

/*
 * try { stack.top(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.pop(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * System.out.println("Gr��e: " + stack.getGroesse()); try { stack.pop(); }
 * catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.pop(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.top(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * /* Liste liste = new Liste(3); liste.add(5); liste.add(7); liste.add(999);
 * liste.add(1001); System.out.println(liste);
 * System.out.println(liste.getGroesse());
 */