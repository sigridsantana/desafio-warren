import java.util.Scanner;
public class Desafio02 {

	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int x, totalAlunos;
			int TempoChegada[] = new int[100];
			int contNormal = 0;
			System.out.printf("Informe o número minímo de alunos para começar a aula: ");
			x = scanner.nextInt();
			System.out.printf("Informe o número total de alunos: ");
			totalAlunos = scanner.nextInt();
			for(int i = 0; i < totalAlunos; i++)
			{
			    System.out.printf("Informe o Tempo de Chegada do " + (i + 1) + "° aluno: ");
			    TempoChegada[i] = scanner.nextInt();
			    if(TempoChegada[i] <= 0)
			    {
			        contNormal++;
			    }
			    else
			    {
			    }
			}
			if(contNormal >= x)
			{
			    System.out.println("AULA NORMAL!");
			}
			else
			{
			    System.out.println("AULA CANCELADA! ");
			}
		}
        
}
}
