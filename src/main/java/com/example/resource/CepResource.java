package com.example.resource;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/cep")
public class CepResource {

    //Identifica se um CEP é válido
    @GetMapping(value = "/validate/{cep}")
    //@RequestMapping(value = "/validate/{cep}", method = RequestMethod.GET)
    Boolean cepValidate (@PathVariable String cep) {
        return Boolean.TRUE;
    }

    //Busca um endereco por meio de um CEP
    @GetMapping(value = "/address/{cep}")
    //@RequestMapping(value = "/address/{cep}", method = RequestMethod.GET)
    String cepAddress (@PathVariable String cep) {
        return "Caldas do Jorro";
    }

}
