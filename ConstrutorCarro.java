package Construtor;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro ("GVC7D77", 290329612);
		Carro carro2 = new Carro ("ADC8G22", 123456789);
		Carro carro3 = new Carro ("KJTJ7G12", 63112931);
		System.out.println(carro1.getNumChassi());
		System.out.println(carro1.getPlaca());
		System.out.println(carro2.getNumChassi());
		System.out.println(carro2.getPlaca());
		System.out.println(carro3.getNumChassi());
		System.out.println(carro3.getPlaca());
	}



}


