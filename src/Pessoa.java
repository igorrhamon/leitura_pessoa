

import java.time.LocalDate;

public class Pessoa {
    String nome;
    LocalDate dataNascimento;
    String cidade;
    String uf;
    


    
    public Pessoa(String nome, String dataNascimento, String cidade, String uf) {
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento);
        this.cidade = cidade;
        this.uf = uf;
    }




    @Override
    public String toString() {
        return "Pessoa [cidade=" + cidade + ", dataNascimento=" + dataNascimento + ", nome=" + nome + ", uf=" + uf
                + "]";
    }
}