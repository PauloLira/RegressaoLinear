
public class Apartamento {
	private float m2;
	private float valor;
	
	
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Apartamento [m2=" + m2 + ", valor=" + valor + "]";
	}

	
	
}
