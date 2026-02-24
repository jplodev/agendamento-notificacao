package com.jpdev.agendamento_notificacao_api.business;

import com.jpdev.agendamento_notificacao_api.business.dtos.in.AgendamentoDTOIn;
import com.jpdev.agendamento_notificacao_api.business.dtos.out.AgendamentoDTOOut;
import com.jpdev.agendamento_notificacao_api.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;
    private final AgendamentoMapper mapper;

    public AgendamentoDTOOut gravaAgendamento(AgendamentoDTOIn agendamento){
        return mapper.paraAgendamentoOut(repository.save(mapper.paraAgendamentoEntity(agendamento)));
    }
}
