
public class ClaseSecundaria {
	private int[] numeros;

	public ClaseSecundaria(int[] numeros) {
		super();
		this.numeros = numeros;
	}



	public String buscarNum (int num) {
		
		boolean encontrar = false;
		if(numeros.length == 0 || numeros == null) {
			return "NO";
		}else{
			for (int i = 0; i < numeros.length; i++) {
				if(num == numeros[i]) {
					return "SI";
				
				}
			}
		}
		return "Numero no encontrado";
			
		
	}
}


	

