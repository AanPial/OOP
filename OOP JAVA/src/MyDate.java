public class MyDate {
    private int date;
    private int month;
    private int year;

    public MyDate()
    {
        date=10;
        month=6;
        year=2024;
    }
    public void getPrint()
    {
        System.out.println("Date : "+date);
        System.out.println("Month : "+month);
        System.out.println("Year : "+year);
    }

    public static void main(String[]args)
    {
        MyDate p=new MyDate();
        p.getPrint();
    }
}
