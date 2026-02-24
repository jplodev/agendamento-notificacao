package com.jpdev.agendamento_notificacao_api.controller;

import com.jpdev.agendamento_notificacao_api.business.AgendamentoService;
import com.jpdev.agendamento_notificacao_api.business.dtos.in.AgendamentoDTOIn;
import com.jpdev.agendamento_notificacao_api.business.dtos.out.AgendamentoDTOOut;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {

    private final AgendamentoService service;

    @PostMapping
    public ResponseEntity<AgendamentoDTOOut> gravaAgendamento(@RequestBody AgendamentoDTOIn agendamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.gravaAgendamento(agendamento));
    }
}
