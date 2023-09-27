package ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Adicionar e Remover Elementos: Crie um ArrayList de números inteiros.
		 * Adicione alguns elementos a ele e, em seguida, remova elementos específicos
		 * com base em seu valor.
		 */

		String resposta = null;

		ArrayList<Integer> numeros = new ArrayList<>();

		int tamanho = 4, contagem = 1, insereNumero = 0;

		while (contagem <= tamanho) {

			try {

				insereNumero = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Insira o " + contagem++ + " ° Número no Array"));

				if (insereNumero <= 0) {

					JOptionPane.showMessageDialog(null,

							"Não é possível inserir números negativos ou igual a 0 ( zero ) ");
					break;

				}

				else {

					// Não é uma boa prática iterar sobre um array dinâmico para remover ou
					// adicionar elementos.

					numeros.add(insereNumero);

				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Os dados inseridos não são válidos");

				JOptionPane.showMessageDialog(null, erro.getMessage());

				break;

			}

			resposta = JOptionPane.showInputDialog(null, "Deseja remover os dados?? \nSIM \nNÃO");

			resposta = resposta.toLowerCase();

			switch (resposta) {

			case "sim":

				int valorRemovido = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Digite um número que será removido"));

				if (numeros.contains(valorRemovido)) {

					/*
					 * Integer.valueOf(valorRemovido): Esta parte cria um objeto do tipo Integer a
					 * partir do valor contido na variável valorRemovido. Como o método remove do
					 * ArrayList espera um objeto como argumento, É precisa envolver o valor em um
					 * objeto Integer. Isso é feito usando Integer.valueOf().
					 */

					numeros.remove(Integer.valueOf(valorRemovido));

					JOptionPane.showMessageDialog(null,
							"O numero fornecido = " + valorRemovido + " Existe e foi removido");

				}

				else {

					JOptionPane.showMessageDialog(null, "O valor selecionado não existe!");

					break;
				}

			case "não":

				for (int i = 0; i < numeros.size(); i++) {

					System.out.print(" " + numeros.get(i) + " ");
				}

				break;

			default:

				JOptionPane.showMessageDialog(null, "Você não selecionou nenhuma resposta válida, fim da aplicação");

				break;
			}
		}

	}

}
