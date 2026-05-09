package com.flavio.agendadortarefasbff.business;


import com.flavio.agendadortarefasbff.business.dto.out.TarefasDTOResponse;
import com.flavio.agendadortarefasbff.infraestructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto){

        emailClient.enviarEmail(dto);
    }

}