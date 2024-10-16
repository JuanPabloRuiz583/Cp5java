package Entities;


public class Cliente {
    private String nome;
    private String documento;

    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void atualizarNome(String novoNome) {
        // Lógica para atualizar nome (ex: validações)
        this.nome = novoNome;
    }
}
