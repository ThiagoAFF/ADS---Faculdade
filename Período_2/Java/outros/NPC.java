package Período_2.Java.outros;

public class NPC {
    private String nome;
    private float HP;
    private int FOR;
    private int DEX;
    private int CON;

    //Setter
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setHP (float HP){
        this.HP = HP;
    }

    public void setFOR (int FOR){
        this.FOR = FOR;
    }

    public void setDEX (int DEX){
        this.DEX = DEX;
    }

    public void setCON (int CON){
        this.CON = CON;
    }

    //Getter

    public String getNome(){
        return nome;
    }

    public float getHP(){
        return HP;
    }

    public int getFOR(){
        return FOR;
    }

    public int getDEX(){
        return DEX;
    }

    public int getCON(){
        return CON;
    }

    // Construtor
    public NPC(String nome, float HP, int FOR, int DEX, int CON){
        this.nome = nome;
        this.HP = HP;
        this.FOR = FOR;
        this.DEX = DEX;
        this.CON = CON;
    }
}
