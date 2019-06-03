import java.util.Scanner;
public class Extenso {

	public static void main(String[] args) { 
		
		String conv;		
		String U[] = {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezeseis", "Dezesete","Dezoito", "Dezenove"};	
		String d[] = {"","","Vinte", "Trinta", "Quareta", "Cinquenta", "Sessenta","Setenta", "Oitenta", "Noventa"};		
		String c[] = {"", "Cento", "Duzentos","Trezentos", "Quatrocentos", "Quinhentos", "Seicentos", "Setecentos", "Oitocentos", "Novecentos", "Mil"};	
		int num ;	


		 System.out.print("Digite um numero: ");
		Scanner ler = new Scanner(System.in); 
		 num = ler.nextInt();
		 ler.close();
		 
		conv = Integer.toString(num); 

		if (num ==1000){ 
			System.out.print("O numero digitado foi:" + c[10]);	
		}  

			if (num > 1000){ 
			System.out.print("O numero digitado não é válido");
		} 
			

			
			if (num<=19){ 
			System.out.print("O numero digitado foi: " + U[num]);
		} 
	if (num > 19 && num < 100){ 
		int dez = Integer.parseInt(conv.substring(0,1)); 
		int uni = Integer.parseInt(conv.substring(1,2)); 
		if (uni == 0){ 
			System.out.print("O numero digitado foi: " + d[dez]);
			}   
		else { 
		System.out.print("O numero digitado foi: " + d[dez] + " e " + U[uni]);
	}
	}
	
	if (num >99 && num < 1000){
		int cen = Integer.parseInt(conv.substring(0,1));
		
		int dez = Integer.parseInt(conv.substring(1,2));
		int uni = Integer.parseInt(conv.substring(2,3));
		if (cen ==1 && dez == 0 && uni == 0)
		{ c[1]= "Cem";
		System.out.print("O numero digitado foi: " + c[cen]);
		} else
		if (dez == 0 && uni ==0){
			System.out.print("O numero digitado foi: " + c[cen]); 
		} else
		if (dez ==0){ 
			System.out.print("O numero digitado foi: " + c[cen] + " e " + U[uni]);
		} else
		if (uni == 0){
			System.out.print("O numero digitado foi: " + c[cen] + " e " + d[dez]);
		} else 
			if (dez ==1){
			int dezeuni = Integer.parseInt(conv.substring(1,3));
System.out.print("O numero digitado foi: " + c[cen] + " e " + U[dezeuni]);		
			}
		else { 
			System.out.print("O numero digitado foi: " + c[cen] + " e " + d[dez]+ " e " + U[uni]);
			
					
				}
			}
		
	}
}
