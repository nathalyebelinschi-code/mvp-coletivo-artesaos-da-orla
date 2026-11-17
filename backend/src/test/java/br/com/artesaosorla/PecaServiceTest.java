package br.com.artesaosorla;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class PecaServiceTest {

    @Test
    void deveCadastrarPecaValidaNaVitrinePublica() {
        PecaService service = new PecaService();
        String resultado = service.cadastrarPeca("Porta-joias Concha", "Ceramica", new BigDecimal("45.00"), true);
        assertTrue(resultado.contains("Porta-joias Concha"));
        assertEquals(1, service.listarVitrinePublica().size());
    }

    @Test
    void deveRejeitarPecaComPrecoZeroOuNegativo() {
        PecaService service = new PecaService();
        assertThrows(IllegalArgumentException.class, () ->
            service.cadastrarPeca("Colar Biojoia", "Biojoias", BigDecimal.ZERO, false)
        );
    }
}
