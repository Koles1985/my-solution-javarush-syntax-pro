package Level_15.lecture_3.throw_exception.eat_to_eat_but_sleep;

public class Solution {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("near"));
        lion.eat(null);
    }
}
