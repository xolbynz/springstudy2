package string;

import string.ui.ExamConsole;

public class GridLineExamConsole  implements ExamConsole {

	
	Exam exam;


	public GridLineExamConsole(Exam exam) {
	
		this.exam = exam;
	}
	
	public  GridLineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Print() { 
		// TODO Auto-generated method stub

		System.out.printf("total is %d, avg  is %f ",exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam=exam;
		
	}
}
