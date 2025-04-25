package com.screenmatch.clasificacion;

public enum ClasificacionEdad {
    ATP(0),
    R13(13),
    R16(16),
    R18(18);
    private final int code;

    public int getCode() {
        return this.code;
    }

    ClasificacionEdad(int code){
        this.code = code;
    }
}
