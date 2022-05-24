package minimal;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ValidadeIdadeTeste {
    @Test
    public void VerificaSeEMaiorQueDezoito() {
     boolean maiorQueDezoito = ValidaIdade.maiorQueDezoito(28);
     assertTrue(maiorQueDezoito);
    }
    
    
}
