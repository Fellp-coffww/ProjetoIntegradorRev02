import java.util.Scanner;

public class Main {


		Scanner ler = new Scanner(System.in);
		
		//Variável auxiliar para evitar o problema do nextLine
		String aux;

		System.out.println("CADASTRO DE SESSAO");
		
		System.out.println("");

		// A ideia e travar a quantidade de informaçoes para todos os parametros
		// Assim o vetor de armazenamento desses dados ja sao criados no tamanho necessario
		System.out.print("Infome o numero de sessoes que deseja cadastrar: ");
		int N = ler.nextInt();
		//leitura do pula linha da leitura do inteiro anterior (nextLine)
		aux = ler.nextLine();
		
		//vetores criados com mesmo tamanho para armazenamento dos dados com mesmo tamanho
		String[] Sessao = new String[N];
		String[] Sala_Sessao = new String[N];
		String[] Filme_Sessao = new String[N];
		String[] Dia_Sessao = new String[N];
		String[] Hora_Sessao = new String[N];

			// preenchimento das informacoes de maneira sequencial de acordo com o indice do vetor
			// dessa forma as informacoes dos vetores se correlacionam pelo indice
			for (int i = 0; i < N; i++) {

				System.out.println("");
				System.out.println("");
				
				System.out.println("SESSAO " + (i + 1));
				
				System.out.println("");

				System.out.print("Nome da sessao : ");
				Sessao[i] = ler.nextLine();		

				//Aqui pensei em printar o array list para o usuario ver a lista de salas cadastradas
				//Assim ele cadastra aqui a sala de sua preferencia
				System.out.print("Nome da sala : ");
				Sala_Sessao[i] = ler.nextLine();
				
				//Aqui pensei em printar o array list para o usuario ver a lista de filmes cadastrados
				//Assim ele cadastra aqui a sala de sua preferencia
				System.out.print("Nome do filme : ");
				Filme_Sessao[i] = ler.nextLine();


				System.out.print("Infome o dia : ");
				Dia_Sessao[i] = ler.nextLine();

				System.out.print("Infome o horario: ");
				Hora_Sessao[i] = ler.nextLine();

			}
			System.out.println("");
			System.out.println("");
			
			System.out.println("-------------------SESSOES CADASTRADAS----------------------");
			
			System.out.println("");
			System.out.println("");
			
			for(int i = 0; i < N; i++ ) {
				System.out.println("SESSAO: " + Sessao [i] + "\t SALA: " + Sala_Sessao[i] + "\t FILME: " + Filme_Sessao[i] + "\t DIA: " + Dia_Sessao[i] + "\t HORARIO: " + Hora_Sessao[i]);
				System.out.println("");
			}
			
		ler.close();
	}
