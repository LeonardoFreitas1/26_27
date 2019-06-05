import java.util.Random;
public class Megasena {

	public static void main(String[] args) {
		
		int sort[] = new int[6];
		int cart[][] = new int[6][7];
		int cont = 0;
		Random gerador = new Random();
		for (int i = 0; i < 6; i++) {
            sort[i] = gerador.nextInt(61);
            
        }
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				cart[i][j] = gerador.nextInt(10);
				
			}
			
			
            
        }
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				if(sort[i] == cart[i][j]) {
					cont++;
				}
				
			}

		}	System.out.print("Obteve: " + cont + " acertos!");

	}
}
