package com.fernando.enums;

public enum Curso {

    ADMINISTRACAO("Administração"),
    INFORMATICA("Informática"),
    CONTABILIDADE("Contabilidade"),
    ENFERMAGEM("Enfermagem"),
    BIOMEDICINA("Biomedicina"),
    DIREITO("Direito");

    private String curso;

    private Curso(String curso) {
        this.setCurso(curso);
    }

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}

