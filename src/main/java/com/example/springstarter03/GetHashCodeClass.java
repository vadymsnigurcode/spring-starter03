package com.example.springstarter03;

/**
 * Класс реализации целевой функции
 */
public class GetHashCodeClass {

    private String targe;
    public GetHashCodeClass(String target){
        this.targe = target;
    }

    public String getHashCode(){
        return String.valueOf(this.targe.hashCode());
    }

}
