import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

enum Days {
    MON("Monday", "Poniedzialek", true),
    TUE("Tuesday", "Wtorek", true),
    WED("Wednesday", "Sroda", true),
    THU("Thursday", "Czwartek", true),
    FRI("Friday", "Piatek", true),
    SAT("Saturday", "Sobota", false),
    SUN("Sunday", "Niedziela", false);
    private String englishName;
    private String polishName;
    private boolean isWorkingDay;

    Days(String englishName, String polishName, boolean isWorkingDay) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.isWorkingDay = isWorkingDay;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }


    public static Days fromEnglishName(String englishName) {
        for (Days days : values()) {
            if (days.englishName.equals(englishName)) {
                return days;
            }
        }
        throw new IllegalArgumentException("There is  no days with \"" + englishName + "\"English name");
    }

    public static Days fromPolishName(String polishName) {

        for (Days days : values()) {

            if (days.polishName.equals(polishName)) {

                return days;

            }

        }

        throw new IllegalArgumentException("There is no days with \"" + polishName + "\" Polish name");

    }


    @Override
    public String toString() {
        return "Days{" +
                "englishName='" + englishName + '\'' +
                ", polishName='" + polishName + '\'' +
                ", workingDay=" + isWorkingDay +
                '}';
    }

    public boolean isWorkingDay() {
        boolean isWorkingDay2;
        isWorkingDay2 = isWorkingDay;
        return isWorkingDay2;
    }

    public boolean isWeekend() {
        boolean isWeekend;
        isWeekend = !isWorkingDay;
        return isWeekend;
    }

    public static Collection<Days> getWorkingDays() {
        List<Days> workingDays = new ArrayList<>();
        for (Days day : Days.values()) {
            if (day.isWorkingDay()) {
                workingDays.add(day);
            }
        }
        return workingDays;
    }

    public static Collection<Days> getWeekends() {

        List<Days> weekend = new ArrayList<>();

        for (Days day : Days.values()) {

            if (!day.isWorkingDay) {

                weekend.add(day);

            }

        }

        return weekend;

    }

    public static void printElements(Collection collection) {

        for (Object d : collection) {

            System.out.println(d);

        }

    }

}



