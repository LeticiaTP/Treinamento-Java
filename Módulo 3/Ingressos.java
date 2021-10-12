import java.util.Scanner; 

public class Ingressos
{
	public static void main(String[] args) {
	    
	    int classeA = 50;
	    int classeB = 30;
	    int classeC = 20;
	    
		System.out.println("Para calcular sua renda total, siga as instruções do programa! :D");
		System.out.println("-----------------------------------------------------------------");
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Insira o total de ingressos vendidos para a Classe A");
		    int rendaA = input.nextInt();
		    rendaA = rendaA * classeA;
		    
		System.out.println("Insira o total de ingressos vendidos para a Classe B");
		    int rendaB = input.nextInt();
		    rendaB = rendaB * classeB;

		System.out.println("Insira o total de ingressos vendidos para a Classe C");
		    int rendaC = input.nextInt();
		    rendaC = rendaC * classeC;
		    
		System.out.println("-------------- RESULTADOS ------------------"); 
		System.out.printf("A venda de ingressos geraram " + (rendaA+rendaB+rendaC) + "R$!");
		System.out.printf("\n A Classe A gerou " + rendaA + "R$.");
		System.out.printf("\n A Classe B gerou " + rendaB + "R$.");
		System.out.printf("\n A Classe C gerou " + rendaC + "R$.");
	}
}
