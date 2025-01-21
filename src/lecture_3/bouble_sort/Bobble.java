package lecture_3.bouble_sort;

public class Bobble {

    private int[] numbers = {32, 74, 42, 5232, 735, 245, 234445, 21, 526, 2, 15, 1};

    public void sort(){
        for(int i = 0; i < numbers.length ; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public void print(){
        for(int i: numbers){
            System.out.print(i + " ");
        }
    }
}
