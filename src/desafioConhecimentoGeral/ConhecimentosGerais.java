package desafioConhecimentoGeral;

import java.util.Scanner;

public class ConhecimentosGerais {

	public static void main(String[] args) {
		
		Scanner inicio = new Scanner(System.in);
		
		final int numPerguntas = 10;
		int pontoQuestao = 1;
		
		char[] gabarito = {
			'c', 'c', 'b', 'a', 'c', 'a', 'd', 'b', 'c', 'a'
		};
		
		String[] perguntas = {
			"De quem é a famosa frase “Penso, logo existo”?",
			"De onde é a invenção do chuveiro elétrico?",
			"Qual o nome do presidente do Brasil que ficou conhecido como Jango?",
			"Qual o maior animal terrestre?",
			"Qual o livro mais vendido no mundo a seguir à Bíblia?",
			"Atualmente, quantos elementos químicos a tabela periódica possui?",
			"O que a palavra legend significa em português?",
			"Quanto tempo a luz do Sol demora para chegar à Terra?",
			"Em que período da pré-história o fogo foi descoberto?",
			"Qual a montanha mais alta do Brasil?"
		};
		
		String[] alternativas = {
			"A) Platão | B) Galileu Galilei | C) Descartes | D) Sócrates",
			"A) França | B) Inglaterra | C) Brasil | D) Austrália",
			"A) Jânio Quadros | B) João Goulart | C) Jacinto Anjos",
			"A) Elefante africano | B) Girafa | C) Baleia azul",
			"A) O senhor dos anéis | B) O pequeno príncipe | C) Dom quixote",
			"A) 118 | B) 113 | C) 108 | D) 92",
			"A) Legenda | B) Conto | C) Legendário | D) Lenda",
			"A) 12 minutos | B) 8 minutos | C) 12 segundos",
			"A) Neolítico | B) Idade média | C) Paleolítico",
			"A) Pico da neblina | B) Monte roraima | C) Pico da bandeira"
		};
		
		char[] respostas = new char[numPerguntas];
		String aluno;
		char resp;
		int nota = 0;
		
		System.out.println("Informe o seu nome:");
		aluno = inicio.nextLine();
		
		for (int i = 0; i < numPerguntas; i++) {
			System.out.printf("Pergunta %d%n", i+ 1);
			System.out.printf("%s%n", perguntas[i]);
			System.out.printf("%s%n", alternativas[i]);
			
			resp = inicio.nextLine().charAt(0);
			respostas[i] = resp;
		}
		
		System.out.printf("%s%n", "Fim de prova. Confira o seu resultado:");
		
		for (int i = 0; i < numPerguntas; i++) {
			if (gabarito[i] == respostas[i]) {
				nota += pontoQuestao;
			}
		}
		
		System.out.printf("%s sua nota foi %d, você foi %s", aluno, nota, nota>= 6 
				? "muito bem. Parabéns!" : "um pouco mal. Precisa melhorar.");
		
		inicio.close();
		
	}
}
