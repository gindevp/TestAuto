public class GetDay {
    public static String nextDay(int day, int month, int year) {
        int equal31 =  31;
        int equal30 =  30;
        int equal28 =  28;
        String space = "/";
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == equal31) return 1 + space + (month+1) + space +year;
            case 12:
                if (day == equal31) return 1 + space + 1 + space +(year+1);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == equal30) return 1 + space + (month+1) + space +year;
                break;
            case 2:
                if (day == equal28) return 1 + space + (month+1) + space +year;
                break;
            default: return (day+1) + space + month + space +year;
        }
        return (day+1) + space + month + space +year;
    }
}
