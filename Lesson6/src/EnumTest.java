
public class EnumTest  {
    public static void main(String[] args) {
Days.printElements(Days.getWeekends());
Days.printElements(Days.getWorkingDays());
        System.out.println(Days.SAT.isWeekend());
        System.out.println(Days.MON.isWorkingDay());
        System.out.println(Days.SUN.isWorkingDay());
    }



}
