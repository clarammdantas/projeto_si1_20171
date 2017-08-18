package com.ufcg.si1.state;

import exceptions.QueixaStatusException;

public class QueixaFechada implements IQueixaState {
	public String state = "F";
	
	@Override
	public IQueixaState estadoAberto() {
		return new QueixaAberta();
	}

	@Override
	public IQueixaState estadoFechado() throws QueixaStatusException {
		throw new QueixaStatusException("Queixa já está fechada!");
	}

	@Override
	public IQueixaState estadoEmAndamento() {
		return new QueixaEmAndamento();
	}
	
	public String toString() {
		return "Fechado";
	}
	
	public String getState() {
		return state;
	}

	public boolean equals(IQueixaState obj) {
		return obj.getState().equals(this.state);
	}
}
