

	import java.util.Scanner;

	public class NovasCervejas {
		public static void main(String[] args) {
			//declara�ao de variavel contador
			int cerveja = 99;
			//declara�ao de variavel ativadora do primeiro while 
			boolean verdadeiro = true;
			
			
			while(verdadeiro){
				System.out.println("agora s�o " + cerveja +  " cervejas na freezer.");
				boolean ativador = true;
				//segundo while ativador
				
				while(ativador){
					//segundo while de intera��o
				System.out.println("Pego uma garrafa, passo pra frente?");
				System.out.println("sim ou n�o?");
					//scanner que armazena o valor da string
				Scanner leitor = new Scanner(System.in);
				String sim = leitor.nextLine();
				if(sim.equals("sim") || sim.equals("s") || sim.equals("SIM") || sim.equals("S") || sim.equals("yes")){
					cerveja = cerveja - 1;
					System.out.println("agora s�o " + cerveja +  " cervejas na freezer.");
						//contador de cervejas	
					while(cerveja == 1){
						verdadeiro = false; //quando o valor das cervejas for = 1 a variavel ativadora sera = false
						System.out.println("Deseja reabastecer?");
					    Scanner reabastecer = new Scanner(System.in);
					    String confirmar = reabastecer.nextLine(); 
					    if(confirmar.equals("sim") || confirmar.equals("S") || confirmar.equals("s") || confirmar.equals("SIM") || confirmar.equals("yes")){
					    	cerveja = 99;//recome�o do ciclo
					    	verdadeiro = true;
					    	break;
					    }
					    else if(confirmar.equals("nao") || confirmar.equals("no") || confirmar.equals("n�o") || confirmar.equals("n")){
					    	System.out.println("Beba com modera��o!");//caso a resposta seja = nao 
					    	ativador = false;//os ativadores serao desligados
							verdadeiro = false;
							break;
							
					    }
					    else{
							System.out.println("Vamos l�, digite sim ou n�o!");//caso um valor invalido seja inserido
					    }
			
					}
	            
					
				}
				else if(sim.equals("nao") || sim.equals("n�o") || sim.equals("n") || sim.equals("no")){
					System.out.println("Beba com modera��o!");//vide linha 37
					verdadeiro = false;
					break;
					
					
				}
				else{
					System.out.println("Vamos l�, digite sim ou n�o!");//vide linha 44
				
				}
				
				
			}

			}
		}

}
