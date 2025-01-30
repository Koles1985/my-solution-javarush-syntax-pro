package Level_14.enums.month_in_season;

public enum Month {
    JANUARY,
    FEBRARRY,
    MARCH,
    APRIL,
    MAY,
    JUN,
    JUL,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonth(){
        return new Month[]{DECEMBER, JANUARY, FEBRARRY};
    }

    public static Month[] getSpringMonth(){
        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonth(){
        return new Month[]{JUN, JUL, AUGUST};
    }

    public static Month[] getAutumnMonth(){
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};

    }
}
