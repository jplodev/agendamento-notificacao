package com.jpdev.agendamento_notificacao_api.infrastructure.exceptions;

public class ResourceNotFountException extends RuntimeException {
    public ResourceNotFountException(String message) {
        super(message);
    }
}
