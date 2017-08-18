package com.ufcg.si1.state;

import exceptions.QueixaStatusException;

public class QueixaEmAndamento implements IQueixaState {
	public String state = "An";
	
	@Override
	public IQueixaState estadoAberto() throws QueixaStatusException {
		throw new QueixaStatusException("Queixa já está em andamento!");
	}

	@Override
	public IQueixaState estadoFechado() {
		return new QueixaFechada();
	}

	@Override
	public IQueixaState estadoEmAndamento() throws QueixaStatusException {
		throw new QueixaStatusException("Queixa já está em andamento!");
	}
	
	public String toString() {
		return "Andamento";
	}
	
	public String getState() {
		return state;
	}
	
	public boolean equals(IQueixaState obj) {
		return obj.getState().equals(this.state);
	}
}
