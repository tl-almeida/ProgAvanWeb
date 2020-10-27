package br.com.javancado.usdtobrl.model;

public class CurrencyConverter {
	private double usd;
	private double brl;
	
	public CurrencyConverter() {
		
	}
	
	public CurrencyConverter(double usd, double brl) {
		super();
		this.usd = usd;
		this.brl = brl;
	}

	public double getUsd() {
		return usd;
	}

	public void setUsd(double usd) {
		this.usd = usd;
	}

	public double getBrl() {
		return brl;
	}

	public void setBrl(double brl) {
		this.brl = brl;
	}

	@Override
	public String toString() {
		return "CurrencyConverter [dolar=" + usd + ", real=" + brl + "]";
	}
}
