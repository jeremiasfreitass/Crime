import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nProcesso de investigação policial - IA\nResponda com 'S' para Sim e 'N' para não!\n");

        String pergunta1 = "Telefonou para a vítima?";
        String pergunta2 = "Esteve no local do crime?";
        String pergunta3 ="Mora perto da vítima?";
        String pergunta4 ="Devia para a vítima?";
        String pergunta5 ="Já trabalhou com a vítima?";

        List<String> perguntas = new ArrayList<>();
        perguntas.add(pergunta1);
        perguntas.add(pergunta2);
        perguntas.add(pergunta3);
        perguntas.add(pergunta4);
        perguntas.add(pergunta5);

        int cont = 0;
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.next();
            if(resposta.equalsIgnoreCase("S")){
                cont++;
            }
        }

        System.out.println("\nA investigação da IA decretou você como: ");

        switch (cont){
            case 2:
                System.out.println("Suspeita"); break;
            case 3:
            case 4:
                System.out.println("Cúmplice"); break;
            case 5:
                System.out.println("ASSASSINA"); break;
            default:
                System.out.println("Inocente"); break;
        }

    }
}