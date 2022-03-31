import java.util.Random;

/*Escreva um programa em Java que preencha uma matriz quadrada de ordem 4 com 
valores inteiros aleat�rios (gerados a partir da classe Random) e, em seguida, fa�a a impress�o dos 
elementos no formato de uma tabela (impress�o como apresentado durante as aulas). Ap�s a 
impress�o o seu programa dever� trocar os elementos armazenados no tri�ngulo superior da matriz 
com os elementos armazenados no tri�ngulo inferior. Imprima novamente a matriz no v�deo para 
confer�ncia. Veja o exemplo abaixo indicando como a troca dos elementos dever� ser realizada. */

public class exercico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L [][] = gerarmatriz ();
		trocarmatriz (L);
	}

		
		public static int [][] gerarmatriz (){		
		Random random = new Random();
		int[][] z = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int na = random.nextInt(101);
				z[i][j] = na;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(z[i][j] + "  ");
			}
			System.out.println();
		}
		return z;}
		
		public static void trocarmatriz (int L [][]) {
			int aux;
			int z [][] = L;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				if (i != j) {
					aux = z[i][j];
					z[i][j] = z[j][i];
					 z[j][i]= aux;
				}
			}

		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(z[i][j] + "  ");
			}
			System.out.println();
		}
	}

}