
public class EnumTest  {
    public static void main(String[] args) {

Days.printElements(Days.getWorkingDays());
Days.printElements(Days.getWeekends());
        System.out.println(Days.SAT.isWeekend());
        System.out.println(Days.MON.isWorkingDay());
        System.out.println(Days.SUN.isWorkingDay());
        System.out.println(Days.fromEnglishName("Wednesday"));
    }



}
