package arraysss;

public class Maxx {
    public static void main(String[] args) {
        int[] arr = {3, 55, 65, 23, 89, 23};
        int max = arr[0];
        for(int i=1; i<6; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
        }
        System.out.println(max);
    }
}
