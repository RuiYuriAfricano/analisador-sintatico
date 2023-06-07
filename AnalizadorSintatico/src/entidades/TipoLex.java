package entidades;

import java.util.ArrayList;

/**
 *
 * @author Rui Malemba
 */
public class TipoLex {

    private String token;
    private String lexema;
    private int linha;
    private String tipo;
    private String varAtrib;
    private String tipoVarAtrib;
    private int escopo;
    private ArrayList<String> listaDeErros = new ArrayList<>();

    public String getToken() {
        return token;
    }

    public ArrayList<String> getListaDeErros() {
        return listaDeErros;
    }

    public void setListaDeErros(ArrayList<String> listaDeErros) {
        this.listaDeErros = listaDeErros;
    }
  
    public void setToken(String token) {
        this.token = token;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getLinha() {
        return linha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVarAtrib() {
        return varAtrib;
    }

    public void setVarAtrib(String varAtrib) {
        this.varAtrib = varAtrib;
    }

    public String getTipoVarAtrib() {
        return tipoVarAtrib;
    }

    public void setTipoVarAtrib(String tipoVarAtrib) {
        this.tipoVarAtrib = tipoVarAtrib;
    }

    public int getEscopo() {
        return escopo;
    }

    public void setEscopo(int escopo) {
        this.escopo = escopo;
    }
    
}
