package exerciciosManzano_EstruturaRepeticaoDO_WHILE;

public class FuncoesDO_WHILE {
	public int Chamada(int valor) {
		return valor * valor;
	}; 
	
	public void DivisivelPorQuatrp(int valor) {
		if(valor%4==0) {
			System.out.println("O seguinte valor: " + valor + " é divisível por 4!");
		}
	}
	
	public int Media(int SomatoriaValores, int contadorValores) { 
		
		int media = SomatoriaValores / contadorValores; 
		
		return media; 
	}
	
	public int Somatoria(int[] ArrayValores) {
		int somaTotal = 0; 
		
		for(int i = 0; i < ArrayValores.length; i++) {
			somaTotal += ArrayValores[i];
		}
		
		return somaTotal;
	}
}
