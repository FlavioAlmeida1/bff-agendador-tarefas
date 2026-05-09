package com.flavio.agendadortarefasbff.business.dto.out;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTOResponse {
    private String nome;
    private String email;
    private String senha;
    private List<TelefoneDTOResponse>telefones;
    private List<EnderecoDTOResponse>enderecos;
}
