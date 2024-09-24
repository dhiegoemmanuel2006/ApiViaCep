package Dhiego.DesafioPatternsJava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.LinkedHashMap;
import java.util.Map;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
       @Id
        private String cep;
        private String logradouro;
        private String complemento;
        private String unidade;
        private String bairro;
        private String localidade;
        private String uf;
        private String estado;
        private String regiao;
        private String ibge;
        private String gia;
        private String ddd;
        private String siafi;

 @Override
 public String toString() {
  return "\tEndereço\t\n" +
          "Logradouro: " + logradouro + "\n" +
          "Bairro: " + bairro + "\n" +
          "Cidade: " + localidade + "\n" +
          "Estado: " + estado;
 }
}
