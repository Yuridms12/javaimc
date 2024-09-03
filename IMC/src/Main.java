import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        IMCCALCULOS i = new IMCCALCULOS();
        System.out.println("Digite o seu nome");
        i.setNome(sc2.nextLine());
        System.out.println(i.getNome());
        System.out.println("Digite sua idade");
        i.setIdade(sc.nextInt());
        System.out.println(i.getIdade());
        System.out.println("Digite sua altura (m)");
        i.setAltura(sc.nextDouble());
        System.out.println(i.getAltura());
        System.out.println("Digite seu peso (kg)");
        i.setPeso(sc.nextDouble());
        System.out.println(i.getPeso());
        i.calculoimc();
        System.out.println("Seu IMC em número é: " + i.getImc());
        if (i.getImc() < 18.5){
            System.out.println("Abaixo do peso!");
        } else if (i.getImc() >= 18.5 && i.getImc() < 25) {
            System.out.println("Peso normal!");
        } else if (i.getImc() >= 25 && i.getImc() < 30) {
            System.out.println("Sobrepeso!");
        } else if (i.getImc() >= 30 && i.getImc() < 35) {
            System.out.println("Obesidade Grau I");
        } else if (i.getImc() >= 35 && i.getImc() < 40) {
            System.out.println("Obesidade Grau II");
        } else{
            System.out.println("Obesidade Mórbida");
        }


    }
}