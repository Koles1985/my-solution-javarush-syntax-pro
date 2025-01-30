package Level_14.enums.transform_enum_to_class;




public class MyMonth {

    public static final MyMonth JANUARY = new MyMonth(0);
    public static final MyMonth FEBRARRY = new MyMonth(1);
    public static final MyMonth MARCH = new MyMonth(2);
    public static final MyMonth APRIL = new MyMonth(3);
    public static final MyMonth MAY = new MyMonth(4);
    public static final MyMonth JUN = new MyMonth(5);
    public static final MyMonth JUL = new MyMonth(6);
    public static final MyMonth AUGUST = new MyMonth(7);
    public static final MyMonth SEPTEMBER = new MyMonth(8);
    public static final MyMonth OCTOBER = new MyMonth(9);
    public static final MyMonth  NOVEMBER = new MyMonth(10);
    public static final MyMonth DECEMBER = new MyMonth(11);


    private static final MyMonth[] array = {JANUARY, FEBRARRY, MARCH, APRIL, MAY, JUN, JUL, AUGUST, SEPTEMBER,
            OCTOBER, NOVEMBER, DECEMBER};

    private  final int value;

    private MyMonth(int value){
        this.value = value;
    }

    public int ordinal(){
        return this.value;
    }

    public static MyMonth[] values(){
        return array;
    }


}
