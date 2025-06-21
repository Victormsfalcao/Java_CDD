package aula03;

import java.util.StringTokenizer;

public class Exercicio02_String {

    public static void main(String[] args) {
        StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo, mas não iremos desistir nunca");
        System.out.println(exemplo.countTokens());
    }
}
