package org.comportamentAdapters;

// Estado de Ánimo Triste
class Triste implements EstadoAnimo {
    @Override
    public void interactuar() {
        System.out.println("El personaje está llorando y necesita consuelo.");
    }
}