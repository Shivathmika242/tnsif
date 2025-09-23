package basicprograms;

public class ConditionalStatements {

	public static void main(String[] args) {
    int a=10,b=20;
		
		//if
		if(a<b) {
			System.out.println(a);
		}
		
		//if else
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		//else-if ladder
		int marks=95;
		if(marks<100 && marks>=90) {
			System.out.println("A grade");
		}
		else if(marks<90 && marks>=80) {
			System.out.println("B grade");
		}
		else if(marks<80 && marks>=70) {
			System.out.println("C grade");
		}
		else if(marks<70 && marks>=60) {
			System.out.println("D grade");
		}
		else if(marks<60 && marks>=35) {
			System.out.println("E grade");
		}
		else if(marks<35 && marks>=0) {
			System.out.println("FAIL");
		}
		else {
			System.out.println("Enter valid marks");
		}
		
		//switch
        int day=2;
        switch(day) {
        case 1:System.out.println("Monday");break;
        case 2:System.out.println("Tuesday");break;
        case 3:System.out.println("Wednesday");break;
        case 4:System.out.println("Thursday");break;
        case 5:System.out.println("Friday");break;
        case 6:System.out.println("Saturday");break;
        case 7:System.out.println("Sunday");break;
        default:System.out.println("Enter valid day");
        }

	}

}
