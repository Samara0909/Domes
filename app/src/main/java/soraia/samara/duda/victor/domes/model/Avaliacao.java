package soraia.samara.duda.victor.domes.model;
public class Avaliacao {
    private String nome;
    private float rating;
    private String comentario;

    public Avaliacao(String nome, float rating, String comentario) {
        this.nome = nome;
        this.rating = rating;
        this.comentario = comentario;
    }

    public String getNome() {
        return nome;
    }

    public float getRating() {
        return rating;
    }

    public String getComentario() {
        return comentario;
    }
}

