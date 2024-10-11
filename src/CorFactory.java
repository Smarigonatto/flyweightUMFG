import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private Map<String, Cor> cores = new HashMap<>();

    public Cor getCor(String nome) {
        Cor cor = cores.get(nome);

        if (cor == null) {
            cor = new Cor(nome);
            cores.put(nome, cor);
            System.out.println("Criando nova instância de cor: " + nome);
        } else {
            System.out.println("Reutilizando instância existente de cor: " + nome + "\n");
        }

        return cor;
    }
}
