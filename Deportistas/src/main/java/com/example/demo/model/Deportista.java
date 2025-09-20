package com.example.demo.model;

public class Deportista {
    private int id;
    private String nombre;
    private int edad;
    private String disciplina;

    public Deportista(int id, String nombre, int edad, String disciplina) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.disciplina = disciplina;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }
}
