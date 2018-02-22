

	import java.util.Scanner;

	public class NovasCervejas {
		public static void main(String[] args) {
			//declaraçao de variavel contador
			int cerveja = 99;
			//declaraçao de variavel ativadora do primeiro while 
			boolean verdadeiro = true;
			
			
			while(verdadeiro){
				System.out.println("agora são " + cerveja +  " cervejas na freezer.");
				boolean ativador = true;
				//segundo while ativador
				
				while(ativador){
					//segundo while de interação
				System.out.println("Pego uma garrafa, passo pra frente?");
				System.out.println("sim ou não?");
					//scanner que armazena o valor da string
				Scanner leitor = new Scanner(System.in);
				String sim = leitor.nextLine();
				if(sim.equals("sim") || sim.equals("s") || sim.equals("SIM") || sim.equals("S") || sim.equals("yes")){
					cerveja = cerveja - 1;
					System.out.println("agora são " + cerveja +  " cervejas na freezer.");
						//contador de cervejas	
					while(cerveja == 1){
						verdadeiro = false; //quando o valor das cervejas for = 1 a variavel ativadora sera = false
						System.out.println("Deseja reabastecer?");
					    Scanner reabastecer = new Scanner(System.in);
					    String confirmar = reabastecer.nextLine(); 
					    if(confirmar.equals("sim") || confirmar.equals("S") || confirmar.equals("s") || confirmar.equals("SIM") || confirmar.equals("yes")){
					    	cerveja = 99;//recomeço do ciclo
					    	verdadeiro = true;
					    	break;
					    }
					    else if(confirmar.equals("nao") || confirmar.equals("no") || confirmar.equals("não") || confirmar.equals("n")){
					    	System.out.println("Beba com moderação!");//caso a resposta seja = nao 
					    	ativador = false;//os ativadores serao desligados
							verdadeiro = false;
							break;
							
					    }
					    else{
							System.out.println("Vamos lá, digite sim ou não!");//caso um valor invalido seja inserido
					    }
			
					}
	            
					
				}
				else if(sim.equals("nao") || sim.equals("não") || sim.equals("n") || sim.equals("no")){
					System.out.println("Beba com moderação!");//vide linha 37
					verdadeiro = false;
					break;
					
					
				}
				else{
					System.out.println("Vamos lá, digite sim ou não!");//vide linha 44
				
				}
				
				
			}

			}
		}

}
