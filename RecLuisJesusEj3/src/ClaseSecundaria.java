
public class ClaseSecundaria {
	private int[] numeros;

	public ClaseSecundaria(int[] numeros) {
		super();
		this.numeros = numeros;
	}



	public static String (int num,int[] numeros) {
		
		
		if(numeros.length == 0 || numeros == null) {
			return "NO";
		}else{
			for (int i = 0; i < numeros.length; i++) {
				if(num == numeros[i]) {
					return "SI";
				}
			}
		}
			
		
	}
}


	

