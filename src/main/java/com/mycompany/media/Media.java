package com.mycompany.media;
import javax.swing.JOptionPane;

public class Media {

    public static void main(String[] args) {
        Media2 m = new Media2();
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(""
                + "=-=-=- Menu -=-=-=\n"
                + "1. Média Aritmética\n"
                + "2. Média Ponderada\n"
                + "3. Sair"));
        if (opcao > 3 || opcao < 0){
            JOptionPane.showMessageDialog(null,"Escolha uma opção válida.");
        }
        while (opcao < 3 || opcao >= 1){
            if (opcao == 1){
                m.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da primeira nota?\n"));
                m.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da segunda nota?"));
                if (m.nota1 < 0 || m.nota1 > 10 || m.nota2 < 0 || m.nota2 > 10){
                    JOptionPane.showMessageDialog(null, "Uma das notas inseridas é maior que 10 ou menor que zero. Insira uma nota válida.");
                } else {
                    JOptionPane.showMessageDialog(null, "Sua média é: " + m.arit());
                    opcao = 3;
                }
            } else if (opcao == 2){
                m.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da primeira nota?\n"
                        + "Peso da primeira nota: 2"));
                m.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da segunda nota?\n"
                        + "Peso da segunda nota: 3"));
                m.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da terceira nota?\n"
                        + "Peso da terceira nota: 4"));
                if (m.nota1 < 0 || m.nota1 > 10 || m.nota2 < 0 || m.nota2 > 10 || m.nota3 < 0 || m.nota3 > 10){
                    JOptionPane.showMessageDialog(null, "Uma das notas inseridas é maior que 10 ou menor que zero. Insira uma nota válida.");
                } else {              
                    JOptionPane.showMessageDialog(null, "Sua média ponderada é: "+ m.pond());
                    opcao = 3;
                }
            }
        }
    }
}
