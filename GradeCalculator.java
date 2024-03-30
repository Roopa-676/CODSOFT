import java.util.Scanner;
public class GradeCalculator {
	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in))

	{
	    System.out.println("                                                   ____________________________________________   ");
            System.out.println("                                                                                                  ");
            System.out.println("                                                                                                  ");
            System.out.println("                                                             STUDENT'S  GRADE  SHEET              ");
            System.out.println("                                                                                                  ");
            System.out.println("                                                    ____________________________________________  ");
            System.out.println();
            System.out.println();
		System.out.print(" Student Name :");
		sc.nextLine();
		System.out.print(" Roll Number  :");
		sc.nextInt();
		System.out.println();
		System.out.println(" Subjects     :");
		System.out.println(" Marks of the Subjects ...(100/100)  ");
		System.out.println();
		System.out.print(" 1) Hertiage of Tamil     :");
		double tamilmark=sc.nextDouble();
		System.out.print(" 2) Communicative English :");
		double englishmark=sc.nextDouble();
		System.out.print(" 3) Mathematics           :");
		double mathmark=sc.nextDouble();
		System.out.print(" 4) Coding Paper          :");
		double codingmark=sc.nextDouble();
		System.out.print(" 5) Aptitude              :");
		double aptitudemark=sc.nextDouble();
		System.out.println();
		System.out.print(" Total Marks              :");
		double totalmarks=tamilmark+englishmark+mathmark+codingmark+aptitudemark;
		System.out.print(" "+totalmarks);
		System.out.println();
		System.out.println();
		System.out.print(" Percentage               :");
		float percent=(float)totalmarks/5;
		System.out.println(" "+percent+" % ");
		System.out.println();
		System.out.print(" Grade                    :");
		if(percent==100.00) {
			System.out.print(" O - Outstanding");
		}
		else if(percent<=99.00 && percent>=90.00) {
			System.out.print(" A+ - Very Excellent");
		}
		else if(percent<=89.00 && percent>=80.00) {
			System.out.print(" A - Excellent");
		}
		else if(percent<=79.00 && percent>=70.00) {
			System.out.print(" B+ - Very Good");
		}
		else if(percent<=69.00 && percent>=60.00) {
			System.out.print(" B - Good");
		}
		else if(percent<=59.00 && percent>=50.00) {
			System.out.print(" C - Better");
		}
		else {
			System.out.print(" F - Fail");
		}
	}

}

}
