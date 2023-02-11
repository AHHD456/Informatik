package Suchen;

public class LineareSuche {

	public LineareSuche() {
		
	}
	
	public static int Suchen(int[] array, int ges) {
		
		int index = 0;
	

		while(array[index] != ges) {
			if(index < array.length) {
				index ++; 
			}else {
				return 0;
			}
		}
		
		return index +1;
	}
}
