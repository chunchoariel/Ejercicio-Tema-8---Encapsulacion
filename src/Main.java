package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {
        Persona masculino = new Persona();
        masculino.setEdad(75);
        masculino.setNombre("Clorobedo Paz");
        masculino.setTelefono(123456789);

        Persona femenino = new Persona();
        femenino.setEdad(70);
        femenino.setNombre("Tremenbunda Gracia");
        femenino.setTelefono(123456789);

        Persona otro = new Persona();
        otro.setEdad(28);
        otro.setNombre("N N");
        otro.setTelefono(987654321);

        System.out.println(masculino.getEdad() + " " + masculino.getNombre()+ " " + masculino.getTelefono());
        System.out.println(femenino.getEdad() + " " + femenino.getNombre()+ " " + femenino.getTelefono());
        System.out.println(otro.getEdad() + " " + otro.getNombre()+ " " + otro.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) { this.edad = edad; }
    public int getEdad() {return this.edad;}

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return this.nombre; }

    public void setTelefono(int telefono){ this.telefono = telefono; }
    public int getTelefono(){ return this.telefono;}
}
