public class Date {

    public static void getOnlyInformation(String day, int date, String month, int year) {
        System.out.println("\nDay: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }

    public static void getFormatEuropean(String day, int date, String month, int year) {
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }

    public static void getFormatAmerican(String day, int date, String month, int year) {
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
    }

    public static void date() {

        String day = "Tuesday";
        int date = 22;
        String month = "June";
        int year = 2023;

        getOnlyInformation(day , date , month , year);
        getFormatAmerican(day , date , month , year);
        getFormatEuropean(day , date , month , year);
    }
}