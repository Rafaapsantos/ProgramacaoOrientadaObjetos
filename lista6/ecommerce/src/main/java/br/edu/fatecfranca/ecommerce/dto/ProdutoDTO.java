package br.edu.fatecfranca.ecommerce.dto;

import lombok.Data;

// @Data -> faz os getters e setters
@Data

public class ProdutoDTO {
    private Long id;
    private String nome;
    private String descricao;
    private double preco;
    private String url_image;

}
