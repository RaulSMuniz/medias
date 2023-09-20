package com.mycompany.media;

public class Media2 {
    public double nota1, nota2, nota3, media, ponderada;
    public double arit(){
        media = (nota1 + nota2) / 2;
        return media;
    }
    public double pond(){
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 4;
        int ptotal = peso1 + peso2 + peso3;
        media = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        ponderada = media / ptotal;
        return ponderada;
    }
}
