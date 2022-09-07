package com.weslley.apiFoundFootage.service.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(Object o){
        super("Recurso não encontrado "+ o);
    }
}
