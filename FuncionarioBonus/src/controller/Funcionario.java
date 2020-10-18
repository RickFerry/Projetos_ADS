package controller;

public class Funcionario {
	
	private Long id;
	private String nome;
	private String matricula;
	private double salario;
	private int faltasNoAno;
	private float ultimaNotaAvaliacao;
	private int qtdPremiosRecebidosNoAno;
	private boolean graduado;
	private String nomeFaculdade;
	private String nomeCurso;
	
	public Funcionario() {}
	
	public Funcionario(Long id, String nome, String matricula, double salario, int faltasNoAno,
			float ultimaNotaAvaliacao, int qtdPremiosRecebidosNoAno, boolean graduado, String nomeFaculdade,
			String nomeCurso) {
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.faltasNoAno = faltasNoAno;
		this.ultimaNotaAvaliacao = ultimaNotaAvaliacao;
		this.qtdPremiosRecebidosNoAno = qtdPremiosRecebidosNoAno;
		this.graduado = graduado;
		this.nomeFaculdade = nomeFaculdade;
		this.nomeCurso = nomeCurso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getFaltasNoAno() {
		return faltasNoAno;
	}

	public void setFaltasNoAno(int faltasNoAno) {
		this.faltasNoAno = faltasNoAno;
	}

	public float getUltimaNotaAvaliacao() {
		return ultimaNotaAvaliacao;
	}

	public void setUltimaNotaAvaliacao(float ultimaNotaAvaliacao) {
		this.ultimaNotaAvaliacao = ultimaNotaAvaliacao;
	}

	public int getQtdPremiosRecebidosNoAno() {
		return qtdPremiosRecebidosNoAno;
	}

	public void setQtdPremiosRecebidosNoAno(int qtdPremiosRecebidosNoAno) {
		this.qtdPremiosRecebidosNoAno = qtdPremiosRecebidosNoAno;
	}

	public boolean isGraduado() {
		return graduado;
	}

	public void setGraduado(boolean graduado) {
		this.graduado = graduado;
	}

	public String getNomeFaculdade() {
		return nomeFaculdade;
	}

	public void setNomeFaculdade(String nomeFaculdade) {
		this.nomeFaculdade = nomeFaculdade;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
}
