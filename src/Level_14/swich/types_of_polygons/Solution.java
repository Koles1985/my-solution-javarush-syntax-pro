package Level_14.swich.types_of_polygons;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(9));
    }

    private static String getShapeNameByCountOfCorners(int i){
        switch (i){
            case 3: return "Треугольник";
            case 4: return "Четырехугольник";
            case 5: return "Пятиугольник";
            case 6: return "Шестиугольник";
            case 7: return "Семиугольник";
            case 8: return "Восьмиугольник";
            default: return "Дохуяугольник";
        }
    }
}
