/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

/**
 *
 * @author myand
 */
public class coleccion {

    public coleccion() {
    }
    
    
    public String coleccionLexemana_1(String lexema, String token) {
        String lexema_1 = "";
        if (token.equalsIgnoreCase("PALRE")) {
            lexema_1 = lexema;
        }
        if (token.equalsIgnoreCase("NUM")) {
            lexema_1 = token;
        }
        if (token.equalsIgnoreCase("MSJ")) {
            lexema_1 = token;
        }
        //OPASI
        if (token.equalsIgnoreCase("ID")) {
            lexema_1 = token;
        }
        if (lexema.equalsIgnoreCase("=")) {
            lexema_1 = "ASI";
        }
        if (lexema.equalsIgnoreCase("*=")) {
            lexema_1 = "MULA";
        }
        if (lexema.equalsIgnoreCase("/=")) {
            lexema_1 = "DIVA";
        }
        if (lexema.equalsIgnoreCase("%=")) {
            lexema_1 = "MODA";
        }
        if (lexema.equalsIgnoreCase("+=")) {
            lexema_1 = "SUA";
        }
        //OPARI
        if (lexema.equalsIgnoreCase("+")) {
            lexema_1 = "SUM";
        }
        if (lexema.equalsIgnoreCase("-")) {
            lexema_1 = "RES";
        }
        if (lexema.equalsIgnoreCase("*")) {
            lexema_1 = "MUL";
        }
        if (lexema.equalsIgnoreCase("/")) {
            lexema_1 = "DIV";
        }
        if (lexema.equalsIgnoreCase("%")) {
            lexema_1 = "MOD";
        }
        //OPIND
        if (lexema.equalsIgnoreCase("++")) {
            lexema_1 = "INC";
        }
        if (lexema.equalsIgnoreCase("--")) {
            lexema_1 = "DEC";
        }

        //OPREL
        if (lexema.equalsIgnoreCase("==")) {
            lexema_1 = "IGU";
        }
        if (lexema.equalsIgnoreCase("!=")) {
            lexema_1 = "DIF";
        }
        if (lexema.equalsIgnoreCase(">")) {
            lexema_1 = "MAY";
        }
        if (lexema.equalsIgnoreCase("<")) {
            lexema_1 = "MEN";
        }
        if (lexema.equalsIgnoreCase(">=")) {
            lexema_1 = "MAI";
        }
        if (lexema.equalsIgnoreCase("<=")) {
            lexema_1 = "MEI";
        }
        //OPESP
        if (lexema.equalsIgnoreCase("[")) {
            lexema_1 = "COI";
        }
        if (lexema.equalsIgnoreCase("]")) {
            lexema_1 = "COD";
        }
        if (lexema.equalsIgnoreCase(".")) {
            lexema_1 = "PUN";
        }
        if (lexema.equalsIgnoreCase(",")) {
            lexema_1 = "COM";
        }
        if (lexema.equalsIgnoreCase(":")) {
            lexema_1 = "DPU";
        }
        if (lexema.equalsIgnoreCase(";")) {
            lexema_1 = "DEL";
        }
        if (lexema.equalsIgnoreCase("(")) {
            lexema_1 = "PIZ";
        }
        if (lexema.equalsIgnoreCase(")")) {
            lexema_1 = "PDE";
        }
        if (lexema.equalsIgnoreCase("{")) {
            lexema_1 = "LLI";
        }
        if (lexema.equalsIgnoreCase("}")) {
            lexema_1 = "LLD";
        }
        return lexema_1;
    }
    
    public String coleccionLexemana_2(String lexema, String token) {
        String lexema_2 = "";
        if (token.equalsIgnoreCase("PALRE")) {
            lexema_2 = "-";
        }
        if (token.equalsIgnoreCase("OPASI")) {
            lexema_2 = "-";
        }
        if (token.equalsIgnoreCase("OPARI")) {
            lexema_2 = "-";
        }
        if (token.equalsIgnoreCase("OPESP")) {
            lexema_2 = "-";
        }
        if (token.equalsIgnoreCase("OPIND")) {
            lexema_2 = "-";
        }
        if (token.equalsIgnoreCase("OPREL")) {
            lexema_2 = "-";
        }
        if (token.equalsIgnoreCase("NUM")) {
            lexema_2 = lexema;
        }
        if (token.equalsIgnoreCase("ID")) {
            lexema_2 = lexema;
        }
        if (token.equalsIgnoreCase("MSJ")) {
            lexema_2 = lexema;
        }
        return lexema_2;

    }

}
