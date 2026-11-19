package pacote;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		
	//Dados do carro
	
	carro.setMarca("Ford");
	System.out.println("Marca: "+ carro.getMarca());
	
	carro.setModelo("Fiesta");
	System.out.println("Modelo: "+ carro.getModelo());
	
	carro.setAno(2014);
	System.out.println("Ano: "+ carro.getAno());
	}
}