import java.util.*;
public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(int myMonth,int myDay, int myYear) {
		month=myMonth;
		day=myDay;
		year=myYear;
	}
	public void setMonthDate(int myMonth) {
		month = myMonth;
	}
	public void setDaydate(int myDay) {
		day=myDay;
	}
	public void setYeardate(int myYear) {
		year=myYear;
	}
	public int getYearDate() {
		return year;
	}
    public void displayDate() {
    	System.out.printf("%d%d%D", month,day,year);
    }
}

class DateTest extends Date{

	public DateTest(int myMonth, int myDay, int myYear) {
		super(myMonth, myDay, myYear);
		}
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		Date myDate=new Date(3,30,1999);
		
		System.out.println("Enter the month");
		int myMonth= input.nextInt();
		myDate.setMonthDate(myMonth);
		
		System.out.println("Enter the fate");
		int myDay= input.nextInt();
		myDate.setDaydate(myDay);
		
		System.out.println("Enter the year");
		int myYear= input.nextInt();
		myDate.setYeardate(myYear);
		
		myDate.displayDate();
	}
	
}

