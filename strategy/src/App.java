import com.example.ComportamentoAgressivo;
import com.example.ComportamentoDefensivo;
import com.example.ComportamentoNormal;
import com.example.Robo;

/**
 * Strategy: Padrão Comportamental
 */
public class App {
    public static void main(String[] args) throws Exception {
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoNormal normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
    }
}
