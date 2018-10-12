package br.com.caelum.vraptor.modelos.lancamentos;

public enum ETipoLacamento {
    ENTRADA,//0
    SAIDA;//1

    private int value;

    public int getValue(){
        return value;
    }    
    public void setValue(int value){
        this.value = value;
    }
}