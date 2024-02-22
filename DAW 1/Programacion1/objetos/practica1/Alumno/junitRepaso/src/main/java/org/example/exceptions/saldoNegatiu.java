package org.example.exceptions;

public class saldoNegatiu extends RuntimeException{
    public saldoNegatiu(String message){
        super(message);
    }
}
