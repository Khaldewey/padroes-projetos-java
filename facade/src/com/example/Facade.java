package com.example;

import sistema.externo.CepApi;
import sistema.externo.CrmService;

public class Facade {
  public void migrarCliente(String nome, String cep) {
    String cidade = CepApi.getInstancia().recuperarCidade(cep);
    String estado = CepApi.getInstancia().recuperarEstado(cep);
    CrmService.gravarCliente(nome, cep, cidade, estado);
  }
}
