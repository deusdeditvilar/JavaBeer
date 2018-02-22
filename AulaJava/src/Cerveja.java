import java.util.Scanner;

public class Cerveja {

	public static void main(String[] args){
		
		int cerveja = 99;
		String opcao;

		
		System.out.println("99 cervejas no freezer.");
		
		while (cerveja > 1){
			
			System.out.println("Pego uma garrafa, passo pra frente.");
			cerveja = cerveja - 1;
			System.out.println("Agora são " + cerveja + " cervejas" );
			if(cerveja == 1){
				System.out.println("Chegou em uma cerveja");
				System.out.println("Deseja repor?" );
				Scanner leitor = new Scanner(System.in);
			    String opc = leitor.nextLine();
				if(opc.equals("Sim") || opc.equals("sim") || opc.equals("S")){
					
					cerveja = cerveja + 98;
					
				}
				else if(opc.equals("Não") || opc.equals("Nao") || opc.equals("não") || opc.equals("nao") || opc.equals("n")){
					
					System.out.println("Ok");
					
					
				}
				
				
				
			}
			
}
	}
}
