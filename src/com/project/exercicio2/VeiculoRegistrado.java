package com.project.exercicio2;

public class VeiculoRegistrado extends Veiculo{
	private String placa;
	private String chassis;
	private TipoCombustivel combustivel;
	private TipoCambio cambio;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public TipoCombustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(TipoCombustivel combustivel) {
		this.combustivel = combustivel;
	}

	public TipoCambio getCambio() {
		return cambio;
	}

	public void setCambio(TipoCambio cambio) {
		this.cambio = cambio;
	}

}
