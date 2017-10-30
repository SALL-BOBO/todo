/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BOBO SALL
 */
public class TodoDAO implements DAOInterface<Todo,TodoDAO>{

    private PreparedStatement pStatement;
    private ResultSet resultSet;
    private Todo entity;


     public Connection getDatabaseConnection() throws SQLException{
        //Connexion à la base de données
           Connection dbConnection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bobo",
                    "root",
                    ""
            );
        return dbConnection;
    }
    
    @Override
    public int inserer(Todo entity) throws SQLException {
        String sql = "INSERT INTO tp_tache (tache, categorie,fait) VALUES (?,?, ?)";
        Connection dbConnection = getDatabaseConnection();
        pStatement = dbConnection.prepareStatement(sql);
        pStatement.setString(1, entity.getTache());
        pStatement.setString(2, entity.getCategorie());
        pStatement.setBoolean(3, entity.getFait());

        return pStatement.executeUpdate();
        
        
    }

    @Override
    public void deleteOneById(int id) throws SQLException {
          Connection dbConnection = getDatabaseConnection();
       if(id!= 0){
           String sql = "DELETE FROM tp_tache WHERE id =?";
           pStatement = dbConnection.prepareStatement(sql);
           pStatement.setInt(1,id);
           pStatement.executeUpdate();
       }
       
       
    }

    @Override
    public void updateOneById(Todo entity) throws SQLException {
        
         String sql = "UPDATE tp_tache SET tache=?,categorie=?,fait=? WHERE id = ?";
       
         Connection dbConnection = getDatabaseConnection();
        pStatement = dbConnection.prepareStatement(sql);
        pStatement.setString(1, entity.getTache());
        pStatement.setString(2, entity.getCategorie());
        pStatement.setBoolean(3, entity.getFait());
        pStatement.setInt(4, entity.getId());
        pStatement.executeUpdate();
    }

    @Override
    public List<Todo> getAll() throws SQLException {
         List<Todo> todoList = new ArrayList<>();
        
  while(! resultSet.isAfterLast()){
      Todo entity = new Todo();
        if(resultSet.next()){
            entity.setTache(resultSet.getString("tache"));
            entity.setCategorie(resultSet.getString("categorie"));
            entity.setFait(resultSet.getBoolean("fait"));
        }
       
      todoList.add(this.entity);
  }
        
        return todoList;
        
    }
    
}
