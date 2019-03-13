/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.gamesbackend;

/**
 *
 * @author TE4-Lärardator
 */
class Game {
    private int id; 
    private String name; 
    private int highscore;
   
    public Game(int id, String name, int highscore) {
        this.id = id;
        this.name = name;
        this.highscore = highscore;
    }

    public Game(String name, int highscore) {
        this.name = name;
        this.highscore = highscore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }
    
    
}
