package aula.springsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Bem-vindo ao meu Web API usando Spring  Boot";
    }
    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS','users')") //Perfis de acesso
    public String users(){
        return "Autorização de usuário";
    }
    @GetMapping("/managers")
    @PreAuthorize("hasAnyRole('MANAGERS')") //Perfis de acesso
    public String managers(){
        return "Autorização de Administrador";
    }
}
