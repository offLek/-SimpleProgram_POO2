/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.utfpr.poo2.projectfinal.vo.Funcionario;

public class FuncionarioDAOi implements FuncionarioDAO {

    EntityManager manager;
    
    public FuncionarioDAOi() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Funcionario funcionario) {
        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        manager.getTransaction().begin();
        manager.merge(funcionario);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Funcionario funcionario) {
        manager.getTransaction().begin();
        manager.remove(funcionario);
        manager.getTransaction().commit();
    }

    @Override
    public List<Funcionario> listarTodos() {
        List<Funcionario> funcionarios;
        
        Query query = manager.createQuery("SELECT f FROM Funcionario f");
        funcionarios = query.getResultList();
        
        return funcionarios;
    }

    @Override
    public Funcionario ListarUm(Long id) {
        Funcionario funcionario;
        
        Query query = manager.createQuery("SELECT f FROM Funcionario f WHERE f.codigo = " + id);
        funcionario = (Funcionario)query.getSingleResult();
        
        return funcionario;
    }
    
    @Override
    public List<Funcionario> ListarFiltroLike(String like) {
        List<Funcionario> funcionarios;
        
        Query query = manager.createQuery("SELECT c FROM Funcionario c WHERE c.nome LIKE '%" + like + "%'");
        funcionarios = query.getResultList();
        return funcionarios;
    } 
}
