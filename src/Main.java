import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  /** //Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
        Scanner sc = new Scanner(System.in);
        System.out.print("Boyutu giriniz: ");
        int target = sc.nextInt();

        int[] list = new int[target];
        for (int i=0; i<list.length;i++){
            System.out.print("Elemanı giriniz: ");
            int eded = sc.nextInt();
            list[i]=eded;
        }
        for(int j=0;j<list.length;j++){
            System.out.println(j+". Elemanı: "+list[j]);
        }
        Arrays.sort(list); // Diziyi küçükten büyüğe sırala
        System.out.print("Sıralama: ");
        for (int a : list) {
            System.out.print(a + " ");
        } */







  /* //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
  int [] list = {3,4, 7 ,46, 5,6,3,7,4,47,46,3};
    int [] duplicate = new int [list.length];
    int startIndex =0;

for (int i=0; i<list.length; i++) {
        for (int j = 0; j < list.length;j++){
            if (i!=j && list[i]==list[j] ){
                if (!isFound(duplicate,list[i])){
                    duplicate[startIndex++]=list[i];
                }   break;
               }
        }
    }  for (int i = 0; i < startIndex; i++) {
            int count = countOccurrences(list, duplicate[i]);
            System.out.println(duplicate[i] + " sayisi " + count + " kere tekrar edildi");
        }
}
    static boolean isFound(int arr[], int value){
        for (int i: arr){
            if(i==value){
                return true;
            }
        }return false;
    }
    static int countOccurrences(int arr[], int value) {
        int count = 0;
        for (int i : arr) {
            if (i == value) {
                count++;
            }
        }
        return count;
    }*/
/** Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

 Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

 Örneğin aşağıdaki 3x2’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.

 */
        int[][] matrix =  {
                {1, 2, 3},
                {4, 5, 6}
                        };

        // Transpozunu alınmış matris
        int[][] transposeMatrix = transpose(matrix);

        // Matrisi yazdırma
        System.out.println("Başlangıç Matrisi:");
        printMatrix(matrix);

        System.out.println("\nTranspozu (Devriği):");
        printMatrix(transposeMatrix);
    }

    // Matrisi transpozunu almak için bir metot
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposeMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    // Matrisi yazdırmak için bir metot
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
