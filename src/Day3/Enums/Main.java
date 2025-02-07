package Day3.Enums;

public class Main {
    public static void main(String[] args) {
        // panggil enum biasa
        EnumDay today = EnumDay.FRIDAY;

        switch (today){
            case SUNDAY:
                System.out.println("today is sunday");
                break;
            case MONDAY:
                System.out.println("today is monday");
                break;
            case TUESDAY:
                System.out.println("today is tuesday");
                break;
            case WEDNESDAY:
                System.out.println("today is wednesday");
                break;
            case THURSDAY:
                System.out.println("today is thursday");
                break;
            case FRIDAY:
                System.out.println("today is friday");
                break;
            case SATURDAY:
                System.out.println("today is saturday");
                break;
            default:
                System.out.println("day is not valid");

        }

        // enum class
        EnumLikeClass getToday = EnumLikeClass.MONDAY;
        System.out.println("today is "+ getToday +" and it's "+getToday.getType());
    }
}
