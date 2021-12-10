package com.atviPw.inOut;

import java.util.Scanner;

public class Inputar {
	private Scanner leitor;
	
	public Inputar() {
		leitor = new Scanner(System.in);
	}

	public double numeroDouble() {
		double numero = leitor.nextDouble();
		return numero;
	}

	public int numeroInteiro() {
		int numero = leitor.nextInt();
		return numero;
	}

	public String texto() {
		String texto = leitor.nextLine();
		return texto;
	}

	@Override
	protected void finalize() throws Throwable {
		leitor.close();
	}
}
