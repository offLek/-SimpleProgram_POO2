/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.poo2.projectfinal.rn;

import java.util.List;
import org.hibernate.HibernateException;

import com.utfpr.poo2.projectfinal.dao.CargoDAO;
import com.utfpr.poo2.projectfinal.dao.CargoDAOi;
import com.utfpr.poo2.projectfinal.vo.Cargo;

public class CargoRN {
    
    private CargoDAO cargoDao;
    
    public CargoRN() {
        cargoDao = new CargoDAOi();
    }
        
    
    public void salvar(Cargo cargo) {
        // Validações antes de salvar cargo
        try {
            cargoDao.salvar(cargo);
        } catch (HibernateException he) {
            System.out.println(he);
            
        }
        
    }
    
    public List<Cargo> listaTodos() {
        return cargoDao.listarTodos();
    }
    
    public Cargo listarUm(Long id) {
        return cargoDao.listarUm(id);
    }
    
    public List<Cargo> listarFitroLike(String like) {
        return cargoDao.ListarFiltroLike(like);
    }
    
    public void excluir(Cargo cargo) {
        cargoDao.excluir(cargo);
    }
    
    public void atualizar(Cargo cargo) {
        cargoDao.atualizar(cargo);
    }
        
}
