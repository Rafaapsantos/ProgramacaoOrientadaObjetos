package br.edu.fatecfranca.exe;

public class Exemplo {
    private String nome;
    private long ra;
    private float media;

    public Exemplo(String nome, long ra, float media) {
        this.setNome(nome);
        this.setRa(ra);
        this.setMedia(media);
    }

    public Exemplo() {
        this.setNome(null);
        this.setRa(0);
        this.setMedia(0);
    }
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(long ra) {
        //converter long para string
        String auxliar = String.valueOf(ra);
        if (ra>0 && auxliar.length()==8){
            this.ra = ra;
        }else{
            throw new IllegalArgumentException("O RA deve ter 8 digitos e ser positivo");
        }
    }
    public void setMedia(float media) {
        if (media>=0 && media<=10){
            this.media = media;
        }else{
            throw new IllegalArgumentException("A média deve ser positva e menor que 10");
        }
    }
    //getters
    public String getNome() {
        return this.nome;
    }
    public long getRa() {
        return this.ra;
    }
    public float getMedia() {
        return this.media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", media=" + media +
                '}';
    }
}
