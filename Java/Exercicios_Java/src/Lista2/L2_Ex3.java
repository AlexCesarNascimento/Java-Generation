/*L2_Ex3
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/

package Lista2;

import java.util.Scanner;

public class L2_Ex3
{

	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		System.out.println("\n============================");

		if (idade >= 10 && idade<=14)
		{
			System.out.printf("  Classíficação: infantil");
		}
		else if (idade >= 15 && idade <= 17)
		{
			System.out.printf("  Classíficação: juvenil");
		}
		else
		{
			System.out.printf("  Classíficação: adulto");
		}

		ler.nextLine();		
		System.out.println("\n============================");
	}

}
