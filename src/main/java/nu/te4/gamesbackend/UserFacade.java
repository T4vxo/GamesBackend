/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.gamesbackend;

import java.util.List;

/**
 *
 * @author TE4-Lärardator
 */
public class UserFacade {
       public User find(int id){
    
        //skall kunna användas för att hämta specifikt game
        return null; 
    }
    public List<User> findAll(int id){
    
        //skall kunna användas för att hämta alla games
        return null; 
    }
    public boolean persist(User user){
    
        //Spara 
        //1 om ej finns i databas skall det skapas ny post
        //2 annars uppdatera
        return false; 
    }
}
