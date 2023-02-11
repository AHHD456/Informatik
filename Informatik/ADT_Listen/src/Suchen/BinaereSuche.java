package Suchen;

public class BinaereSuche {

	public BinaereSuche() {
	
	}
	
	public static int Suchen(int[] array, int ges){
		
		int lowerb = 0;
		int upperb = (array.length-1);
		int index = ((upperb+lowerb)/2);
	
		while(array[index-1] != ges) {
			index = (upperb+lowerb)/2;
			if(array[index] < ges) {
				lowerb = index;
			}else if(array[index] > ges){
				upperb = index;
			}
		}
		return index;	}
	
}
