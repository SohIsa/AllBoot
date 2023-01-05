package miniAtividades;

public class dia {
    
    public static void valor (int a) {

        switch (a) {
            case 1: case 2: case 3:
                System.out.println("Certo"); break;
            case 4:
                System.out.println("Errado"); break;
            case 5:
                System.out.println("Talvez"); break;
            default:
                System.out.println("Valor indefinido"); break;

        }

    }

}
