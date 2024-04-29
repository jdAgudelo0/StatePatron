package org.comportamentAdapters;

// Estado de Ánimo Enojado
class Enojado implements EstadoAnimo {
    @Override
    public void interactuar() {
        System.out.println("El personaje está gritando y es mejor mantenerse alejado.");
    }
}