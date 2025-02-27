package org.example.pruebas_enums;

import org.example.Main;

public enum SagasPelis {
    HARRYPOTER(8), CREPUSCULO(4), SPIDERMAN(7), A_TODO_GAS(12), SHREK(6);

    private int num_pelis;

    SagasPelis(int num_pelis) {
        this.num_pelis = num_pelis;
    }

    public int getNum_pelis() {
        return num_pelis;
    }

    public static void main(String[] args) {
        
    }
}
