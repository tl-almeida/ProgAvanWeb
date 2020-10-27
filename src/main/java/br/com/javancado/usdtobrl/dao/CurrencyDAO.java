package br.com.javancado.usdtobrl.dao;

import org.springframework.stereotype.Repository;

import br.com.javancado.usdtobrl.model.CurrencyConverter;

@Repository
public class CurrencyDAO {

	public double converter(CurrencyConverter currency) {
	   double value =  currency.getUsd() * currency.getBrl();
	   
	   return value;
	}
}
