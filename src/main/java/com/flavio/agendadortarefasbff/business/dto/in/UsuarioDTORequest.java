package com.flavio.agendadortarefasbff.business.dto.in;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTORequest {

    private String email;
    private String senha;
    private List<TelefoneDTORequest>telefones;
    private List<EnderecoDTORequest>enderecos;
}
