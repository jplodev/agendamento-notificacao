package com.jpdev.agendamento_notificacao_api.business.dtos.out;

import com.jpdev.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AgendamentoDTOOut {

    private Long id;
    private String emailDestinatario;
    private String telefoneDestinatario;
    private String mensagem;
    private LocalDateTime dataHoraEnvio;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataHoraModificacao;
    private StatusNotificacaoEnum statusNotificacao;
}
