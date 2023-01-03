
package testeEnumerate.newpackage;


public enum ClasseHeroi {
    MAGO("Feiticeiro","M"), FADA("Fada","F"), LUTAFOR("Lutador","L"), ARQUEIRO("Arq","A");
    
    private String nome;
    private String icone;

    private ClasseHeroi(String nome, String icone) {
        this.nome = nome;
        this.icone = icone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }
    
    
    
}
