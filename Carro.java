package POO;

public class Carro extends Vehiculo {
	int palanca, manubrio ;
	
	public void Palanca(int palanca) {
		if (palanca>=0&&palanca<=6) {
		}else if(palanca==0) {
			System.out.println("El carro esta estatico");
		}else if (palanca == 1) {
			System.out.println("El carro esta iniciando su marcha");
		}else if (palanca<1 &&palanca>=6) {
			System.out.println("El carro esta en marcha");
		}
	}
	public void Manubrio(int manubrio) {
		if (manubrio >=0&& manubrio<=180) {
			System.out.println("El carro va en linea recta");
		}else if (manubrio>90 &&manubrio<270) {
			System.out.println("El carro gira hacia la derecha");
		}else if (manubrio>90 || manubrio <270) {
			System.out.println("El carro gira hacia la izquierda");
		}
	}
		
}

