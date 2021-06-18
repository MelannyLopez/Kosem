package POO;

public class Vehiculo {
	private String marca;
	private String color;
	private boolean tienellantas;
	private int peso;
	private boolean manubrio;
	private int numerodeasientos;
	private int velocidadmaxima;
	private double capacidaddecombustible;
	private boolean tieneretrovisores;
	private boolean palanca;
	
	public boolean isPalanca() {
		return palanca;
	}
	public void setPalanca(boolean palanca) {
		this.palanca = palanca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isTienellantas() {
		return tienellantas;
	}
	public void setTienellantas(boolean tienellantas) {
		this.tienellantas = tienellantas;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean isManubrio() {
		return manubrio;
	}
	public void setManubrio(boolean manubrio) {
		this.manubrio = manubrio;
	}
	public int getNumerodeasientos() {
		return numerodeasientos;
	}
	public void setNumerodeasientos(int numerodeasientos) {
		this.numerodeasientos = numerodeasientos;
	}
	public int getVelocidadmaxima() {
		return velocidadmaxima;
	}
	public void setVelocidadmaxima(int velocidadmaxima) {
		this.velocidadmaxima = velocidadmaxima;
	}
	public double getCapacidaddecombustible() {
		return capacidaddecombustible;
	}
	public void setCapacidaddecombustible(double capacidaddecombustible) {
		this.capacidaddecombustible = capacidaddecombustible;
	}
	public boolean isTieneretrovisores() {
		return tieneretrovisores;
	}
	public void setTieneretrovisores(boolean tieneretrovisores) {
		this.tieneretrovisores = tieneretrovisores;
	}

}
