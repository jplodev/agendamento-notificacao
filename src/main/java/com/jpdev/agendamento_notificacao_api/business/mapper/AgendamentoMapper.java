package com.jpdev.agendamento_notificacao_api.business.mapper;

import com.jpdev.agendamento_notificacao_api.business.dtos.in.AgendamentoDTOIn;
import com.jpdev.agendamento_notificacao_api.business.dtos.out.AgendamentoDTOOut;
import com.jpdev.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import com.jpdev.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring")
public interface AgendamentoMapper {

    Agendamento paraAgendamentoEntity(AgendamentoDTOIn agendamento);

    AgendamentoDTOOut paraAgendamentoOut(Agendamento agendamento);

    @Mapping(target = "dataHoraModificacao", expression = "java(agora())")
    @Mapping(target = "statusNotificacao", expression = "java(cancelar())")
    Agendamento paraCancelarAgendamento(Agendamento agendamento);

    default LocalDateTime agora(){
        return LocalDateTime.now();
    }

    default StatusNotificacaoEnum cancelar(){
        return StatusNotificacaoEnum.CANCELADO;
    }

}
