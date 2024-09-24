package Dhiego.DesafioPatternsJava.controller;

import Dhiego.DesafioPatternsJava.model.Endereco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
public class Controller {
    @GetMapping("/consulta/{cep}")
    public String getCep(@PathVariable String cep) throws IOException {
        try{
            if(cep.length() != 8){
                return "CEP invalido!";
            }

            String url = "https://viacep.com.br/ws/" + cep + "/json/";

            RestTemplate restTemplate = new RestTemplate();
            Endereco endereco = restTemplate.getForObject(url, Endereco.class);

            System.out.println("Acabou de acontecer um Get na api, pesquisando o cep: " + cep);

            return endereco.toString();}

        catch(Exception e){
            System.out.println("Houve um erro em alguma consulta de cep");
            return "CEP invalido!";
        }

    }
}
