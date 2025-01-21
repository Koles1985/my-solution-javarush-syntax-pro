package lecture_3.flipping_data;

import java.util.ArrayList;
import java.util.List;

public class SolutionFlip {

    public SolutionFlip() {
        init();
        revers();
        print();
    }

    private List<Integer> numbers = new ArrayList<>();

    private void init(){
        for (int i = 0; i < 10; i ++){
            numbers.add(i);
        }
    }

    private void revers(){
        int temp;
        for (int i = 0, y = numbers.size()-1; i < numbers.size()/2; i++, y--){
            temp = numbers.get(i);
            numbers.set(i, numbers.get(y));
            numbers.set(y, temp);



        }
    }

    private void print(){
        for(int i : numbers)
            System.out.print(i);

    }
}
