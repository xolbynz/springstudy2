package string;

import java.applet.AppletContext;
import java.awt.List;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import string.ui.ExamConsole;

public class Program {

	
	public static void main(String[] args) {
		
//		
//	Exam exam = new NewlecExam();
//	
//	ExamConsole console = new InlineExamConsole();
//	console.setExam(exam);
		
		
		ApplicationContext context = 
new AnnotationConfigApplicationContext(NewlecDIConfig.class);
	//ExamConsole console = (ExamConsole) context.getBean("console"); // 오브젝트니까 케스팅 해야함 
		
		
	//	Exam exam = context.getBean(Exam.class);
	//	System.out.println(exam.toString());
		ExamConsole console = context.getBean(ExamConsole.class); //자로형
	console.Print();
	
//	ArrayList<Exam> exams = (ArrayList<Exam>) context.getBean("exams");
			//new ArrayList<>();
//	exams.add(new NewlecExam(1, 1, 1, 1));
	
//	for (Exam e : exams) {
//		System.out.println(e);
//	}
	
	}
}
