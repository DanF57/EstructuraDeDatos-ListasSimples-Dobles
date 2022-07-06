package listas;

public class Persona {
    int id;
    String nombre;
    int edad;
    float[] notas;

    public Persona(int i, String nom, int ed, float n1, float n2, float n3) {
        id = i;
        nombre = nom;
        edad = ed;
        notas = new float[3];
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
    }

}
