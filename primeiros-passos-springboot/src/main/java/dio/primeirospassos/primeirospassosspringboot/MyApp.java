package dio.primeirospassos.primeirospassosspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora; //Injeção de Dependência
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é: " + calculadora.somar(2, 3));
    }
}
