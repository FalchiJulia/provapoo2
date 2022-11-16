package provapoo2;

public class Moto extends Veiculo {
	public Moto(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiario,
			int cilindradas) {
		super(placa, combustivelNoTanque, quilometragem, alugado, precoDiario);
		this.cilindradas = cilindradas;
	}

	private int cilindradas;

	@Override
	public boolean viajar(int distancia) {
		final double consumo = 30;
		if (this.combustivelNoTanque * consumo > distancia) {
			this.quilometragem += distancia;
			this.combustivelNoTanque -= distancia / consumo;
			return true;
		} else {
			return false;
		}
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + ", placa=" + placa + ", combustivelNoTanque=" + combustivelNoTanque
				+ ", quilometragem=" + quilometragem + ", alugado=" + alugado + ", precoDiario=" + precoDiario + "]";
	}

}


