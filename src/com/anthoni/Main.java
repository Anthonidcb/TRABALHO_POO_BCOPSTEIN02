package com.anthoni;

public class DiasDaSemana {

    public static String int2Day(int dia) {
        return switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> throw new IllegalArgumentException("Dia inválido: " + dia);
        };
    }

    public static String int2Day(int dia, boolean traduzir) {
        if (!traduzir) {
            return int2Day(dia);
        }
        return switch (dia) {
            case 1 -> "Dia do Senhor";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Dia de descanso";
            default -> throw new IllegalArgumentException("Dia inválido: " + dia);
        };
    }

    public static void main(String[] args) {
        System.out.println("Exemplo int2Day:");
        System.out.println("1 -> " + int2Day(1));
        System.out.println("5 -> " + int2Day(5));
        System.out.println("7 -> " + int2Day(7));

        System.out.println("\nExemplo int2Day com tradução:");
        System.out.println("1, true -> " + int2Day(1, true));
        System.out.println("7, true -> " + int2Day(7, true));
        System.out.println("3, true -> " + int2Day(3, true));
        System.out.println("2, false -> " + int2Day(2, false));
    }
}

