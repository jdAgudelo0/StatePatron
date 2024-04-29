package org.comportamentAdapters;

// Clase Personaje
class Personaje {
    private EstadoAnimo estadoAnimo;

    public Personaje() {
        // Por defecto, el personaje comienza en estado de ánimo Feliz
        this.estadoAnimo = new Feliz();
    }

    public void setEstadoAnimo(EstadoAnimo estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public void interactuar() {
        estadoAnimo.interactuar();
    }
}