package org.comportamentAdapters;


// Estado de Ánimo Feliz
class Feliz implements EstadoAnimo {
    @Override
    public void interactuar() {
        System.out.println("El personaje está sonriendo y siendo amigable.");
    }
}