package Searching;

public class StringSearch {
    public static void main(String[] args) {
        String name = "biswaranjan";
        char target = 'c';
        System.out.println(CharPos(name, target));
    }
    static boolean CharPos(String abc, char key){
        if(abc.isEmpty()){
            return false;
        }
        for(int i=0; i<abc.length(); i++){
            if(key == abc.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
