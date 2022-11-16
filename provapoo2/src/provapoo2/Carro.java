package provapoo2;

public class Carro extends Veiculo {
	private double potenciaDoMotor;

	public Carro(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiario, double potenciaDoMotor) {
		super(placa, combustivelNoTanque, quilometragem, alugado, precoDiario);
		this.potenciaDoMotor = potenciaDoMotor;
	}

	@Override
	public boolean viajar(int distancia) {
		final double consumo = 10;
		if (this.combustivelNoTanque * consumo > distancia) {
			this.quilometragem += distancia;
			this.combustivelNoTanque -= distancia / consumo;
			return true;
		} else {
			return false;
		}
	}

	public double getPotenciaDoMotor() {
		return potenciaDoMotor;
	}

	public void setPotenciaDoMotor(double potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}

	@Override
	public String toString() {
		return "Carro [potenciaDoMotor=" + potenciaDoMotor + ", placa=" + placa + ", combustivelNoTanque="
				+ combustivelNoTanque + ", quilometragem=" + quilometragem + ", alugado=" + alugado + ", precoDiario="
				+ precoDiario + "]";
	}

}
