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
import javax.persistence.Table;

/**
 *
 * @author alexs
 */
@Entity
@Table(name = "Cliente")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_cliente")
    private int codigo;

    private int idade;
    private String nome;
    private String cpf;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int registro) {
        this.codigo = codigo;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
    
    @Override
    public String toString() {
        return "----- Cliente -----\n"+
                "||Codigo: "+codigo+
                "||CPF: "+cpf+
                "||Nome: "+nome+
                "||Idade: "+idade;
    }  
}
