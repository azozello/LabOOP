package FIrst;

public class CheckImpl implements Checkable{

    @Override
    public boolean checkArray(int[] array, int length) {
        if (length<3) return false;
        if (length==3) return true;
        for (int i=1;i<length-3;i++){
            if (array[i]<=array[i+1]) return false;
        }return true;
    }

    @Override
    public boolean checkArray(char[] array) {
        if (array.length<3) return false;
        if (array.length==3) return true;
        for (int i=1;i<array.length-3;i++){
            if (array[i]<=array[i+1]) return false;
        }return true;
    }
}
