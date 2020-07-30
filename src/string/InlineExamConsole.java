package string;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import string.ui.ExamConsole;
@Component("console")
public class InlineExamConsole implements ExamConsole {

	@Autowired(required = true)
	//@Qualifier("exam")
	Exam exam;


//	public InlineExamConsole(Exam exam) {
//	
//		this.exam = exam;
//	}
	
	public  InlineExamConsole() {
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
