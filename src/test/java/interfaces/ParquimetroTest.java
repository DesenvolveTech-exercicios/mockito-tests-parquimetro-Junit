package interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.ArgumentMatchers.anyInt;

class ParquimetroTest {
    Parquimetro parquimetro;

    @BeforeEach
    void setup(){
        parquimetro = Mockito.mock(Parquimetro.class);
        Mockito.when(parquimetro.inserirMoeda(anyInt())).thenReturn(12);
        Mockito.when(parquimetro.getSaldo()).thenReturn(12);
        Mockito.when(parquimetro.devolve()).thenReturn(6);
        Mockito.when(parquimetro.emiteTicket()).thenReturn("valor do ticket: 6");
    }

    @Test
    void deveConseguirInserirMoedaEDevolverOValorTotal(){
        assertEquals(12, parquimetro.inserirMoeda(6));
    }

    @Test
    void deveDevolverOValorAtualDoSaldo(){
        assertEquals(12, parquimetro.getSaldo());
    }

    @Test
    void deveConseguirFazerOEstornoDoIngressoEDevolverOSaldoAtual(){
        assertEquals(6, parquimetro.devolve());
    }

}


