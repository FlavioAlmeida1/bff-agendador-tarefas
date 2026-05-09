package com.flavio.agendadortarefasbff.business.dto.out;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTOResponse {
    private Long id;
    private String rua;
    private Long numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
}
