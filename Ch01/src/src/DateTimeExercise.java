package src;
import java.time.LocalDate;
import java.time.LocalTime;

//Java datetime exercise 6
public class DateTimeExercise {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println("The current date is: " + date);
		System.out.println("And the current time is: " + time);
	}

}
