/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package king.of.ta3meer;

/**
 *
 * @author kamal
 */
public class User {
    
    public int    id ;
    public String Username = new String();
    public String Password = new String();
    
    public User(int id, String username , String password){
        this.id=id;
        this.Username=username;
        this.Password=password;
    }
    
    
    public int getID(){
        return this.id;
    }
    
    
    
    
    
    
    
    
    
    
    
}
