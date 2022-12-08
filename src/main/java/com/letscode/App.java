package com.letscode;

import com.letscode.util.ConsoleUIHelper;

public class App {
    public static void main(String[] args) {
        int w = 80;
        ConsoleUIHelper.drawHeader("Agenda", w);
        ConsoleUIHelper.drawWithPadding("12345678901234567890", w);
        ConsoleUIHelper.drawWithRightPadding("12345678901234567890", w, '_');
        ConsoleUIHelper.drawWithRightPadding("12345678901234567890", w, '*');
        ConsoleUIHelper.fillVSpace(5, w);
        ConsoleUIHelper.drawWithPadding("12345678901234567890", w);
        int corFrente = ConsoleUIHelper.askChooseOption("Escolha uma cor de frente", "Padrão", "Verde", "Amarelo", "Vermelho");
        System.out.println("Cor escolhida: " + corFrente);
        int corFundo = ConsoleUIHelper.askChooseOption("Escolha uma cor de fundo", "Verde", "Amarelo", "Vermelho");
        System.out.println("Cor escolhida: " + corFundo);
    }
}
