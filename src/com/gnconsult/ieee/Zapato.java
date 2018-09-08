package com.gnconsult.ieee;

public class Zapato {

        int tamano;
        char lado;

        public Zapato(int tamano, char lado) {
            this.tamano = tamano;
            this.lado = lado;
        }

        @Override
        public String toString() {
            return "Zapato{" +
                    "tamano=" + tamano +
                    ", lado=" + lado +
                    '}';
        }

        public int getTamano() {
            return tamano;
        }

        public char getLado() {
            return lado;
        }

}
