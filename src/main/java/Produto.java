import java.util.ArrayList;
import java.util.List;

/*
 ** created by: jorge.lessa
 */
public class Produto {

    private String modelo;
    private List<Peca> pecas = new ArrayList<Peca>();

    public Produto(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void adicionar(Peca peca)
    {
        this.pecas.add(peca);
    }

    public void remover(Peca peca)
    {
        this.pecas.remove(peca);
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public String getProduto()
    {
        String produto = "";
        for (Peca peca : pecas)
        {
            produto += produto.isEmpty() ? peca.getNome() : (", " + peca.getNome());
        }
        return produto;
    }
}
