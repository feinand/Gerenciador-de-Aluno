package com.fernando.enums;

public enum Status {

    ATIVO("Ativo"),
    INATIVO("Inativo");

    private String status;

    private Status(String status) {
        this.setStatus(status);
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
