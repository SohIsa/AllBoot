package miniAtividades;

public class Mes {
    
    public static void valor (int a) {
        if (a == 1) {
            System.out.println("Janeiro");
        } else if ( a == 2) {
            System.out.println("Fevereiro");
        } else if ( a == 3) {
            System.out.println("Março");
        } else if ( a == 4) {
            System.out.println("Abril");
        } else if ( a == 5) {
            System.out.println("Vamos dizer que segue até Dezembro");
        } else {
            System.out.println("não está nos nossos meses do ano");
        }
        }
    
    public static void ferias (int b) {
        switch (b) {
            case 1:
            System.out.println("Férias"); break;
            default:
            System.out.println("Inválido"); break;
        } 
    }
}
