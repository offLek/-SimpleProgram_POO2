/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.poo2.projectfinal.vo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 *
 * @author alexs
 */
@Entity
@Table(name = "Funcionario")
public class Funcionario {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_funcionario")
    private int codigo;
    
    private String nome;
    private String cpf;
    private double salario;
    private int idade;
    
    @ManyToOne
    @JoinColumn(name = "cod_cargo")
    private Cargo cargo;
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Funcionario{ ||Codigo: "+ codigo +
                "||Salario: " + salario + 
                "||CPF: "+cpf+
                "||Nome: "+nome+
                "||Idade: "+idade;
    }
}
