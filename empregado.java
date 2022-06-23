package br.edu.iftm.javaempresax.classes;

import java.util.Date;

public class empregado {

    private int codEmp;
    private String nome;
    private Date dataNasc;
    private String endereco;
    private char sexo;
    private double salario;
    private int codSuperv;
    private int codDepto;
    private Departamento departamento;

    public empregado() {
    }

    public empregado(int codEmp, String nome, Date dataNasc, String endereco,
                     char sexo, double salario, int codSuperv, int codDepto,
                     Departamento departamento) {
        this.codEmp = codEmp;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.sexo = sexo;
        this.salario = salario;
        this.codSuperv = codSuperv;
        this.codDepto = codDepto;
        this.departamento = departamento;
    }



    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodSuperv() {
        return codSuperv;
    }

    public void setCodSuperv(int codSuperv) {
        this.codSuperv = codSuperv;
    }

    public int getCodDepto() {
        return codDepto;
    }

    public void setCodDepto(int codDepto) {
        this.codDepto = codDepto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "empregado{" +
                "codEmp=" + codEmp +
                ", nome='" + nome + '\'' +
                ", dataNasc=" + dataNasc +
                ", endereco='" + endereco + '\'' +
                ", sexo=" + sexo +
                ", salario=" + salario +
                ", codSuperv=" + codSuperv +
                ", codDepto=" + codDepto +
                ", departamento=" + departamento +
                '}';
    }


}
