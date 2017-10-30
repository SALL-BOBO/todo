/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

/**
 *
 * @author BOBO SALL
 */
public class Todo {
    private int id;
    
    private String tache;
    
    private String categorie;
    
    private boolean fait;
    
     public Todo (){
         
     }
    
    public Todo ( int arg_id,String arg_tache, String arg_categorie, boolean arg_fait){
        this.id=arg_id;
        this.tache = arg_tache;
        this.categorie = arg_categorie;
        this.fait = arg_fait;
        
    }
    public int getId(){
        return id;
    }
    public void setId(int arg_id){
        this.id = arg_id;
    }
    public String getTache(){
        return tache;
    }
    public void setTache(String arg_tache){
        this.tache = arg_tache;
    }
    public String getCategorie(){
        return categorie;
    }
    public void setCategorie(String arg_categorie){
        this.categorie = arg_categorie;
    }
    public boolean getFait(){
        return fait;
    }
    public void setFait(boolean arg_fait){
        this.fait = arg_fait;
        
    }
    
    
    
    
    
    
    
    
}

