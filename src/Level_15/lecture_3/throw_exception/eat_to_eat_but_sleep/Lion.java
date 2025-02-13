package Level_15.lecture_3.throw_exception.eat_to_eat_but_sleep;

public class Lion {

    public void eat(Food food){
        try{
            System.out.println();
            System.out.println("Ищет еду");
            System.out.println("нашел " + food.getName());
            System.out.println("все съел");
        }catch (NullPointerException e){
            System.out.println("Ничего не нашел");
            return;
        }finally {
            System.out.println("Лег спать " + (food == null ? "голодным" : "" ));
        }
    }
}
