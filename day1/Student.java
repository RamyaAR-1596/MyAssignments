package week1.day1;

public class Student {
	public void details (String n, int r, String c, int M, float g) {
		System.out.println("Name :"+n+"\n"+"RollNo :"+r+"\n"+"College Name :"+c+"\n"+"Mark :"+M+"\n"+"CGPA :"+g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student();
        s.details ("Ramya RaviKumar", 204, "ST.Joesph", 95, 9.5f);
	}

}
