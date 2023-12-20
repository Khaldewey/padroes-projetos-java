import com.example.Facade;

/**
 * Facade: Padrão Estrutural
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();

        facade.migrarCliente("Israel", "123456789");

    }
}
