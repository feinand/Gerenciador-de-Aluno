package com.fernando.enums;

public enum Turno {

    MATUTINO("Matutino"),
    NOTURNO("Noturno");

    private String turno;

    private Turno(String turno) {
        this.setTurno(turno);
    }

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
}
