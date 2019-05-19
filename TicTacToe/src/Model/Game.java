/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Pc
 */
public class Game {
    
    private String startGame="X";
    private String xString="Active";
    private String oString="Passive";
    private int xCount=0;
    private int oCount=0;

    
    /// GETTERS & SETTERS
    public int getxCount() {
        return xCount;
    }

    public void setxCount(int xCount) {
        this.xCount = xCount;
    }

    public int getoCount() {
        return oCount;
    }

    public void setoCount(int oCount) {
        this.oCount = oCount;
    }

    public String getStartGame() {
        return startGame;
    }

    public void setStartGame(String startGame) {
        this.startGame = startGame;
    }

    public String getxString() {
        return xString;
    }

    public void setxString(String xString) {
        this.xString = xString;
    }

    public String getoString() {
        return oString;
    }

    public void setoString(String oString) {
        this.oString = oString;
    }
    
   
    
}

