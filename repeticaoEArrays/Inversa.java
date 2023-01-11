package repeticaoEArrays;

public class Inversa {
    
    public static void main (String[] args) {

        int vetor[] = {1,3,6,8,2,-2};
        int count = 0;

        while (count <= vetor.length -1) {
            System.out.print(vetor[count] + " ");
            count ++;
        }
        System.out.print("\nVetor inverso ");
        for (int i = vetor.length-1; i >=0 ; i--) {
            System.out.print(vetor[i] + " ");
        }

    }

}
