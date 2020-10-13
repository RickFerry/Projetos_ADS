package controller;

public class Conversor {
	public int converter(int dia, int mes, int ano) {
		int data = dia + mes + ano;
		int base = 15 + 10 + 1582;
		int response = 0;
		if(mes<3) {
			ano -= 1;
			mes +=12;
		}
		if(data>=base) {
			double a = ano / 100;
			double b = a / 4;
			double c = 2 - a + b;
			double d = 365.25 * (ano + 4716);
			double e = 30.6001 * mes + 1;
			double dataju = (d + e + dia + 0.5 + c - 1524.5) + 30;
			String aux = "" + dataju;
			if(!aux.contains(".")) {
				dataju --;
				response = Integer.parseInt(aux);
			}else {
				char [] aux2 = aux.toCharArray();
				String aux3 = "";
				for(char var : aux2) {
					if(var!='.') {
						aux3+=var;
					}else {
						break;
					}
				}
				response = Integer.parseInt(aux3);
			}
		}
		return response;
	}
}
