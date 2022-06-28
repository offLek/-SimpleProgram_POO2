/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.rn;

import java.util.List;
import org.hibernate.HibernateException;

import com.utfpr.poo2.projectfinal.dao.FuncionarioDAO;
import com.utfpr.poo2.projectfinal.dao.FuncionarioDAOi;
import com.utfpr.poo2.projectfinal.vo.Funcionario;

public class FuncionarioRN {
    
    private FuncionarioDAO funcionarioDao;
    
    public FuncionarioRN() {
        funcionarioDao = new FuncionarioDAOi();
    }
        
    
    public void salvar(Funcionario funcionario) {
        // Validações antes de salvar funcionario
        try {
            funcionarioDao.salvar(funcionario);
        } catch (HibernateException he) {
            System.out.println(he);
            
        }
        
    }
    
    public List<Funcionario> listaTodos() {
        return funcionarioDao.listarTodos();
    }
    
    public Funcionario listarUm(Long id) {
        return funcionarioDao.ListarUm(id);
    }
    
    public List<Funcionario> listarFitroLike(String like) {
        return funcionarioDao.ListarFiltroLike(like);
    }
    
    public void excluir(Funcionario funcionario) {
        funcionarioDao.excluir(funcionario);
    }
    
    public void atualizar(Funcionario funcionario) {
        funcionarioDao.atualizar(funcionario);
    }
        
}
