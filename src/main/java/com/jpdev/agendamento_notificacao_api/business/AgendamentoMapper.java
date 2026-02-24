package com.jpdev.agendamento_notificacao_api.business;

import com.jpdev.agendamento_notificacao_api.business.dtos.in.AgendamentoDTOIn;
import com.jpdev.agendamento_notificacao_api.business.dtos.out.AgendamentoDTOOut;
import com.jpdev.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgendamentoMapper {

    Agendamento paraAgendamentoEntity(AgendamentoDTOIn agendamento);

    AgendamentoDTOOut paraAgendamentoOut(Agendamento agendamento);


}
