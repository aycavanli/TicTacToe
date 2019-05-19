/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Game;
import View.View;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class Controller{
    
    private Game game;
    private View view;

    public Controller(Game game,View view) {
        this.game = game;
        this.view = view;               
    }
    
    ////    FUNCTIONS
    public void choosePlayer(){
        
        if(game.getStartGame().equalsIgnoreCase("X")){
            game.setStartGame("O");
            game.setoString("Active");
            game.setxString("Passive");
        }
        else {
            game.setStartGame("X");
            game.setxString("Active");
            game.setoString("Passive");
        }
        
        view.active();
    }
    
    public void whoWins(){
        
        String b1=view.getjButton1().getText();
        String b2=view.getjButton2().getText();
        String b3=view.getjButton3().getText();
        
        String b4=view.getjButton4().getText();
        String b5=view.getjButton5().getText();
        String b6=view.getjButton6().getText();
        
        String b7=view.getjButton7().getText();
        String b8=view.getjButton8().getText();
        String b9=view.getjButton9().getText();
        
        //////     PLAYER X WIN
        //  Yanlamasına kazanma
        if(b1==("X")&& b2==("X") && b3==("X")){
            JOptionPane.showMessageDialog(view, "Player X WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setxCount(game.getxCount()+1);
            view.gameScore();
            view.getjButton1().setBackground(Color.YELLOW);
            view.getjButton2().setBackground(Color.YELLOW);
            view.getjButton3().setBackground(Color.YELLOW);
        }
        if(b4==("X")&& b5==("X") && b6==("X")){
            JOptionPane.showMessageDialog(view, "Player X WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setxCount(game.getxCount()+1);
            view.gameScore();
            view.getjButton4().setBackground(Color.YELLOW);
            view.getjButton5().setBackground(Color.YELLOW);
            view.getjButton6().setBackground(Color.YELLOW);
        }
        if(b7==("X")&& b8==("X") && b9==("X")){
            JOptionPane.showMessageDialog(view, "Player X WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setxCount(game.getxCount()+1);
            view.gameScore();
            view.getjButton7().setBackground(Color.YELLOW);
            view.getjButton8().setBackground(Color.YELLOW);
            view.getjButton9().setBackground(Color.YELLOW);
        }
        //  Çaprazlamasına
        if(b1==("X")&& b5==("X") && b9==("X")){
            JOptionPane.showMessageDialog(view, "Player X WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setxCount(game.getxCount()+1);
            view.gameScore();
            view.getjButton1().setBackground(Color.YELLOW);
            view.getjButton5().setBackground(Color.YELLOW);
            view.getjButton9().setBackground(Color.YELLOW);
        }
        if(b7==("X")&& b5==("X") && b3==("X")){
            JOptionPane.showMessageDialog(view, "Player X WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setxCount(game.getxCount()+1);
            view.gameScore();
            view.getjButton7().setBackground(Color.YELLOW);
            view.getjButton5().setBackground(Color.YELLOW);
            view.getjButton3().setBackground(Color.YELLOW);
        }
        // Dikeylemesine
        if(b7==("X")&& b1==("X") && b4==("X")){
            JOptionPane.showMessageDialog(view, "Player X WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setxCount(game.getxCount()+1);
            view.gameScore();
            view.getjButton7().setBackground(Color.YELLOW);
            view.getjButton4().setBackground(Color.YELLOW);
            view.getjButton1().setBackground(Color.YELLOW);
        }
        if(b2==("X")&& b5==("X") && b8==("X")){
            JOptionPane.showMessageDialog(view, "Player X WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setxCount(game.getxCount()+1);
            view.gameScore();
            view.getjButton2().setBackground(Color.YELLOW);
            view.getjButton5().setBackground(Color.YELLOW);
            view.getjButton8().setBackground(Color.YELLOW);
        }
        if(b6==("X")&& b9==("X") && b3==("X")){
            JOptionPane.showMessageDialog(view, "Player X WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setxCount(game.getxCount()+1);
            view.gameScore();
            view.getjButton9().setBackground(Color.YELLOW);
            view.getjButton6().setBackground(Color.YELLOW);
            view.getjButton3().setBackground(Color.YELLOW);
        }
        //////     PLAYER Y WIN
        //  Yanlamasına kazanma
        if(b1==("O")&& b2==("O") && b3==("O")){
            JOptionPane.showMessageDialog(view, "Player O WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setoCount(game.getoCount()+1);
            view.gameScore();
            view.getjButton1().setBackground(Color.YELLOW);
            view.getjButton2().setBackground(Color.YELLOW);
            view.getjButton3().setBackground(Color.YELLOW);
        }
        if(b4==("O")&& b5==("O") && b6==("O")){
            JOptionPane.showMessageDialog(view, "Player O WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setoCount(game.getoCount()+1);
            view.gameScore();
            view.getjButton4().setBackground(Color.YELLOW);
            view.getjButton5().setBackground(Color.YELLOW);
            view.getjButton6().setBackground(Color.YELLOW);
        }
        if(b7==("O")&& b8==("O") && b9==("O")){
            JOptionPane.showMessageDialog(view, "Player O WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setoCount(game.getoCount()+1);
            view.gameScore();
            view.getjButton7().setBackground(Color.YELLOW);
            view.getjButton8().setBackground(Color.YELLOW);
            view.getjButton9().setBackground(Color.YELLOW);
        }
        //  Çaprazlamasına
        if(b1==("O")&& b5==("O") && b9==("O")){
            JOptionPane.showMessageDialog(view, "Player O WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setoCount(game.getoCount()+1);
            view.gameScore();
            view.getjButton1().setBackground(Color.YELLOW);
            view.getjButton5().setBackground(Color.YELLOW);
            view.getjButton9().setBackground(Color.YELLOW);
        }
        if(b7==("O")&& b5==("O") && b3==("O")){
            JOptionPane.showMessageDialog(view, "Player O WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setoCount(game.getoCount()+1);
            view.gameScore();
            view.getjButton7().setBackground(Color.YELLOW);
            view.getjButton5().setBackground(Color.YELLOW);
            view.getjButton3().setBackground(Color.YELLOW);
        }
        // Dikeylemesine
        if(b7==("O")&& b1==("O") && b4==("O")){
            JOptionPane.showMessageDialog(view, "Player O WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setoCount(game.getoCount()+1);
            view.gameScore();
            view.getjButton7().setBackground(Color.YELLOW);
            view.getjButton4().setBackground(Color.YELLOW);
            view.getjButton1().setBackground(Color.YELLOW);
        }
        if(b2==("O")&& b5==("O") && b8==("O")){
            JOptionPane.showMessageDialog(view, "Player O WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setoCount(game.getoCount()+1);
            view.gameScore();
            view.getjButton2().setBackground(Color.YELLOW);
            view.getjButton5().setBackground(Color.YELLOW);
            view.getjButton8().setBackground(Color.YELLOW);
        }
        if(b6==("O")&& b9==("O") && b3==("O")){
            JOptionPane.showMessageDialog(view, "Player O WINS!!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            game.setoCount(game.getoCount()+1);
            view.gameScore();
            view.getjButton9().setBackground(Color.YELLOW);
            view.getjButton6().setBackground(Color.YELLOW);
            view.getjButton3().setBackground(Color.YELLOW);
        }
        
    }
            
     ////    UPDATING THE VIEW CLASS
    public void Button1(){
        
        if(view.getjButton1().getText()=="")
        {
            view.getjButton1().setText(game.getStartGame());

            if(game.getStartGame().equalsIgnoreCase("X")){
                view.getjButton1().setForeground(Color.BLUE);
            }
            else {
                view.getjButton1().setForeground(Color.RED);
            }
            choosePlayer();
            whoWins();
        }
    }
    public void Button2(){
        
        if(view.getjButton2().getText()==""){
            
            view.getjButton2().setText(game.getStartGame());
       
            if(game.getStartGame().equalsIgnoreCase("X")){
                view.getjButton2().setForeground(Color.BLUE);
            }
            else {
                view.getjButton2().setForeground(Color.RED);
            }
            choosePlayer();
            whoWins();
        }
        
    }
    public void Button3(){
        
        if(view.getjButton3().getText()==""){
            
            view.getjButton3().setText(game.getStartGame());

            if(game.getStartGame().equalsIgnoreCase("X")){
                view.getjButton3().setForeground(Color.BLUE);
            }
            else {
                view.getjButton3().setForeground(Color.RED);
            }
            choosePlayer();
            whoWins();
        }
    }
    public void Button4(){
        
        if(view.getjButton4().getText()==""){
            
            view.getjButton4().setText(game.getStartGame());

            if(game.getStartGame().equalsIgnoreCase("X")){
                view.getjButton4().setForeground(Color.BLUE);
            }
            else {
                view.getjButton4().setForeground(Color.RED);
            }
            choosePlayer();
            whoWins();
        }
    }
    public void Button5(){
        if(view.getjButton5().getText()==""){
            view.getjButton5().setText(game.getStartGame());

            if(game.getStartGame().equalsIgnoreCase("X")){
                view.getjButton5().setForeground(Color.BLUE);
            }
            else {
                view.getjButton5().setForeground(Color.RED);
            }
            choosePlayer();
            whoWins();
        }
    }
    public void Button6(){
        if(view.getjButton6().getText()==""){
            view.getjButton6().setText(game.getStartGame());

            if(game.getStartGame().equalsIgnoreCase("X")){
                view.getjButton6().setForeground(Color.BLUE);
            }
            else {
                view.getjButton6().setForeground(Color.RED);
            }
            choosePlayer();
            whoWins();
        }
    }
    public void Button7(){
        if(view.getjButton7().getText()==""){
            view.getjButton7().setText(game.getStartGame());

            if(game.getStartGame().equalsIgnoreCase("X")){
                view.getjButton7().setForeground(Color.BLUE);
            }
            else {
                view.getjButton7().setForeground(Color.RED);
            }
            choosePlayer();
            whoWins();
        }
    }
    public void Button8(){
        if(view.getjButton8().getText()==""){
            view.getjButton8().setText(game.getStartGame());

            if(game.getStartGame().equalsIgnoreCase("X")){
                view.getjButton8().setForeground(Color.BLUE);
            }
            else {
                view.getjButton8().setForeground(Color.RED);
            }
            choosePlayer();
            whoWins();
        }
    }
    public void Button9(){
        if(view.getjButton9().getText()==""){
            
            view.getjButton9().setText(game.getStartGame());

            if(game.getStartGame().equalsIgnoreCase("X")){
                view.getjButton9().setForeground(Color.BLUE);
            }
            else {
                view.getjButton9().setForeground(Color.RED);
            }
            choosePlayer();
            whoWins();
        }
    }
    public void ButtonReset(){
        
       choosePlayer();
        
        view.getjButton1().setText("");
        view.getjButton2().setText("");
        view.getjButton3().setText("");
        view.getjButton4().setText("");
        view.getjButton5().setText("");
        view.getjButton6().setText("");
        view.getjButton7().setText("");
        view.getjButton8().setText("");
        view.getjButton9().setText("");
        
        view.getjButton1().setBackground(Color.WHITE);
        view.getjButton2().setBackground(Color.WHITE);
        view.getjButton3().setBackground(Color.WHITE);
        view.getjButton4().setBackground(Color.WHITE);
        view.getjButton5().setBackground(Color.WHITE);
        view.getjButton6().setBackground(Color.WHITE);
        view.getjButton7().setBackground(Color.WHITE);
        view.getjButton8().setBackground(Color.WHITE);
        view.getjButton9().setBackground(Color.WHITE);
        
    }
    private JFrame frame;
    public void ButtonExit(){
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Do you want to exit?","Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
   

}
