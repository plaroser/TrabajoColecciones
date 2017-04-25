package Models;

public class Movil {
	
	//atributos
	private String marca;
	private String modelo;
	private String color;
	private int precio;
	private String procesador;
	
	
	//Constructor
	public Movil(String marca, String modelo, String color, int precio, String procesador) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.procesador = procesador;
	}

	//Metodos
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + " �]";
	}
	
	
	
}
