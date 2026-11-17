package br.com.artesaosorla;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PecaService {
    private final List<String> vitrine = new ArrayList<>();

    public String cadastrarPeca(String titulo, String categoria, BigDecimal preco, boolean prontaEntrega) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Informe o titulo da peca artesanal.");
        }
        if (preco == null || preco.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Informe um preco maior que R$ 0,00 para publicar a peca.");
        }
        String status = prontaEntrega ? "Pronta-entrega" : "Sob encomenda";
        String registro = titulo + " | " + categoria + " | R$ " + preco + " (" + status + ")";
        vitrine.add(registro);
        return registro;
    }

    public List<String> listarVitrinePublica() {
        return List.copyOf(vitrine);
    }
}
