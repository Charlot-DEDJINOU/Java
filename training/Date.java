public class Date {
    String day = "Tuesday";
    int date = 22;
    String month = "June";
    int year = 2023;

    public void getOnlyInformation() {
        System.out.println("\nDay: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }

    public void getFormatEuropean() {
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }

    public void getFormatAmerican() {
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
    }
}