package view;

import br.gui.pilhaint.Pilha;
import br.gui.filagenerica.Fila;

public class Principal {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Fila<Integer> fila = new Fila<>();
		fila.insert(18);
		fila.insert(39);
		fila.insert(12);
		fila.insert(73);
		fila.insert(90);
		fila.insert(61);
		
		try {
			fila.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		while (!fila.isEmpty()) {
			try {
				pilha.push(fila.remove());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		while (!pilha.isEmpty()) {
			try {
				fila.insert(pilha.pop());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println();
		try {
			fila.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
