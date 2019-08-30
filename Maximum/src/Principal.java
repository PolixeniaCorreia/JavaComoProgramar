import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite três valores de ponto flutuante separados por espaços");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		double result = maior(num1,num2,num3);
		
		System.out.println("Maior num é:" + result);
	
	}
	public static double maior(double x, double y, double k) {
		double maiorvalor = x;
		
		if (y > maiorvalor)
			maiorvalor = y;
		
		if(k > maiorvalor)
			maiorvalor = k;
		
		return maiorvalor;
	}
	

}
