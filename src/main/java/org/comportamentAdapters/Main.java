package org.comportamentAdapters;

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Creamos un personaje
        Personaje personaje = new Personaje();

        // Ejecutamos algunas interacciones
        personaje.interactuar(); // Mostrará "El personaje está sonriendo y siendo amigable."

        // Cambiamos el estado de ánimo del personaje a Triste
        personaje.setEstadoAnimo(new Triste());

        // Ejecutamos algunas interacciones de nuevo
        personaje.interactuar(); // Mostrará "El personaje está llorando y necesita consuelo."

        // Cambiamos el estado de ánimo del personaje a Enojado
        personaje.setEstadoAnimo(new Enojado());

        // Ejecutamos algunas interacciones de nuevo
        personaje.interactuar(); // Mostrará "El personaje está gritando y es mejor mantenerse alejado."
    }
}