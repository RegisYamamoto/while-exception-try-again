package com.regis;
import java.util.Arrays;
import java.util.List;

public class TesteException {

	private List<String> nomes = Arrays.asList("Mario", "Tiago", "Mariane", "José", "Joáo");
	
	private List<Integer> index = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	private boolean validacao = false;
	
	public void teste() throws InterruptedException {
		for (int i : index) {
			validacao = false;
			while (validacao == false) {	
				try {
					imprimiNomes(i);
					validacao = true;
				} catch (Exception e) {
					System.out.println("erro de conexão com a Vtex");
					Thread.sleep(3000);
				}
			}
			
		}
		
		System.out.println("Terminou o programa");
	}
	
	public void imprimiNomes(int num) throws InterruptedException {
		System.out.println(nomes.get(num));
	}
	
}