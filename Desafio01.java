public class Desafio01   
{  
static int reverso(int numero)
{
	int reverse = 0;  
	while(numero != 0)   
	{  
	int resto = numero % 10;  
	reverse = reverse * 10 + resto;  
	numero = numero/10;
	return numero;
	}
	return reverse;
}
public static void main(String[] args)   
{
	for(int i=11; i < 1000000; i++) {
		int soma = i + reverso(i);
		if(soma % 2 != 0) {
			System.out.println(soma);
		}
	}
}

}  
