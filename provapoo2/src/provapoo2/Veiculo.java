package provapoo2;

import java.util.Objects;

public abstract class Veiculo {

	public Veiculo(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiario) {
		this.placa = placa;
		this.combustivelNoTanque = combustivelNoTanque;
		this.quilometragem = quilometragem;
		this.alugado = alugado;
		this.precoDiario = precoDiario;
	}

	protected String placa;
	protected int combustivelNoTanque;
	protected int quilometragem;
	protected boolean alugado;
	protected double precoDiario;

	public abstract boolean viajar(int distancia);

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCombustivelNoTanque() {
		return combustivelNoTanque;
	}

	public void setCombustivelNoTanque(int combustivelNoTanque) {
		this.combustivelNoTanque = combustivelNoTanque;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public double getPrecoDiario() {
		return precoDiario;
	}

	public void setPrecoDiario(double precoDiario) {
		this.precoDiario = precoDiario;
	}

	public void abastecer(int combustivel) {
		this.combustivelNoTanque += combustivel;
	}

	@Override
	public boolean equals(Object obj) {
		Veiculo other = (Veiculo) obj;
		return Objects.equals(placa, other.placa);
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", combustivelNoTanque=" + combustivelNoTanque + ", quilometragem="
				+ quilometragem + ", alugado=" + alugado + ", precoDiario=" + precoDiario + "]";
	}
}

