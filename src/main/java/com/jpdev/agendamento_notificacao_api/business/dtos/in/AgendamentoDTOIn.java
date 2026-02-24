package com.jpdev.agendamento_notificacao_api.business.dtos.in;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AgendamentoDTOIn {

    private String emailDestinatario;
    private String telefoneDestinatario;
    private String mensagem;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dataHoraEnvio;
}
