/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BOBO SALL
 */
public interface DAOInterface <T,DAO>{
    
   int inserer(T entity)throws SQLException; 
   
     void deleteOneById(int id) throws SQLException;
     
       void updateOneById(T entity) throws SQLException;
    
         List<Todo> getAll() throws SQLException;
}
