import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = leia.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = leia.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            throw new ParametrosInvalidosException("ParametroUm deve ser menor que ParametroDois");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("");
        }

        int contagem = parametroDois - parametroUm;
        int passou = 0;

        for (int i=0; i < contagem; i++){
            passou++;
        }
        System.out.println("Contagem: "+contagem);
        System.out.println("Passou "+passou+" vezes no for");
    }
}