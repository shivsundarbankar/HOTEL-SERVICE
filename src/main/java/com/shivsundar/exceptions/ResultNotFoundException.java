package com.shivsundar.exceptions;

public class ResultNotFoundException extends RuntimeException{
    public ResultNotFoundException(){
        super("Result not found!");
    }
}
