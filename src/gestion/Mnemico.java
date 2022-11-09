/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

/**
 *
 * @author myand
 */
public class Mnemico {
    private String token;
    private String lexico;
    private String Lexema_1;
    private String Lexema_2;
    
    public Mnemico(){
        
    }
    
    public Mnemico(String token, String lexico, String Lexema_1, String Lexema_2) {
        this.token = token;
        this.lexico = lexico;
        this.Lexema_1 = Lexema_1;
        this.Lexema_2 = Lexema_2;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLexico() {
        return lexico;
    }

    public void setLexico(String lexico) {
        this.lexico = lexico;
    }

    public String getLexema_1() {
        return Lexema_1;
    }

    public void setLexema_1(String Lexema_1) {
        this.Lexema_1 = Lexema_1;
    }

    public String getLexema_2() {
        return Lexema_2;
    }

    public void setLexema_2(String Lexema_2) {
        this.Lexema_2 = Lexema_2;
    }

    @Override
    public String toString() {
        return token + "  " + lexico + "  " + Lexema_1 + "  " + Lexema_2 +"\n";
    }
    
           
}
