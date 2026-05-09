package com.flavio.agendadortarefasbff.business.dto.in;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTORequest {

    private String rua;
    private Long numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
}
