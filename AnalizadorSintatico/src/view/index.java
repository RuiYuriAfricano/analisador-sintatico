package view;

import entidades.AnalisadorLexico;
import entidades.AnalisadorSintatico;
import entidades.TipoLex;
import entidades.Token;
import java.util.ArrayList;

/**
 *
 * @author Rui Malemba
 */
public class index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*AnalisadorSintatico analiserSintatico = new AnalisadorSintatico("programaC.txt");
        ArrayList<TipoLex> res = analiserSintatico.program();
        if(analiserSintatico.qtdErros > 0){
            System.out.println("Erros encontrados: "+analiserSintatico.qtdErros+"\n");
            
            for(String erro: res.get(0).getListaDeErros())
                System.out.println(erro);
            return;
        }
        
        
        if (res == null) {
            return;
        }
        System.out.println(String.format("%-50s | %-50s | %-50s | %-50s | %-50s | %-50s | %-50s |", "", "", "", "", "", "", ""));
        System.out.println(String.format("%-50s | %-50s | %-50s | %-50s | %-50s | %-50s | %-50s |", "TOKEN", "LEXEMA", "LINHA", "TIPO", "VAL_ATRIBUIÇÃO", "TIPO_VAL_ATRIBUIÇÃO", "ESCOPO"));
        System.out.println(String.format("%-50s | %-50s | %-50s | %-50s | %-50s | %-50s | %-50s |", "", "", "", "", "", "", ""));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (TipoLex lex : res) {
            System.out.println(String.format("%-50s | %-50s | %-50s | %-50s | %-50s | %-50s | %-50s |", lex.getToken(), lex.getLexema(), lex.getLinha(), lex.getTipo(), lex.getVarAtrib(), lex.getTipoVarAtrib(), lex.getEscopo()));

            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }*/
        FrmIndex frm = new FrmIndex("");
        frm.setVisible(true);

    }

}
