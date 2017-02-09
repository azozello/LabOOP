package Third;

import java.util.ArrayList;

public class Matrix {

    private int[][] innerMatrix;

    private int size;

    public Matrix(int size) {
        this.size = size;
        this.innerMatrix = new int[size][size];
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                innerMatrix[i][j] = 1;
            }
        }
    }

    public Matrix(){}

    public void print(){
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.print(innerMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void changeNumbers(){
        if (size>=5){
            int changeIndex;
            if (size%2==0){
                changeIndex = size/2;
            } else {
                changeIndex = (size+1)/2;
            }
            for (int i=1;i<size-1;i++){
                for (int j=1;j<size-1;j++){
                        innerMatrix[i][j] = 0;
                }
            }
            for (int i=2;i<size-2;i++){
                for (int j=2;j<size-2;j++){
                    innerMatrix[i][j] = 1;
                }
            }
        } else {
            System.out.println("Too small");
        }
    }
}
