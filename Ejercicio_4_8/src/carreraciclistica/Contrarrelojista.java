package carreraciclistica;


public class Contrarrelojista extends Ciclista {
	private double velocidadMaxima;
	public Contrarrelojista(int identificador, String nombre, double velocidadMáxima) {
		super(identificador, nombre);
		this.velocidadMaxima = velocidadMaxima;
}
	protected double getVelocidadMaxima() {
		return velocidadMaxima;
}
	protected void setVelocidadMaxima(double velocidadMaxima)
{
		this.velocidadMaxima = velocidadMaxima;
}
	@Override
	protected void imprimir() {
		super.imprimir();
		System.out.println("Aceleracion promedio = " +
velocidadMaxima);
}
	@Override
	protected String imprimirTipo() {
		return "Es un constrarrelojista";
}
}