package cm4school;

public class SchoolMain {
	public static void main(String[] args) {

		Year year2022 = new Year();
		year2022.id = "1";
		year2022.name = "Year 2022";

		Year year2023 = new Year();
		year2023.id = "2";
		year2023.name = "Year 2023";

		Year[] years = { year2022, year2023 };

		Semester sem1 = new Semester();
		sem1.id = 1;
		sem1.name = "HK 1";
		sem1.year = year2022;
		sem1.multiplication = 1;

		Semester sem2 = new Semester();
		sem2.id = 2;
		sem2.name = "HK 2";
		sem2.year = year2022;
		sem2.multiplication = 2;

		Semester[] semesters = { sem1, sem2 };

		Teacher teacherDung = new Teacher();
		teacherDung.id = 1;
		teacherDung.name = "Thay Dung";

		Teacher teacherTri = new Teacher();
		teacherTri.id = 2;
		teacherTri.name = "Thay Tri";

		Teacher[] teachers = { teacherDung, teacherTri };

		Room room1 = new Room();
		room1.id = 1;
		room1.name = "Phong 1 Khu 1";

		Room[] rooms = { room1 };

		Clazz clazz10A1 = new Clazz();
		clazz10A1.id = 1;
		clazz10A1.name = "10A1";
		clazz10A1.locatedRoom = room1;
		clazz10A1.primaryTeacher = teacherDung;

		Clazz clazz10A2 = new Clazz();
		clazz10A2.id = 2;
		clazz10A2.name = "10A2";
		clazz10A2.locatedRoom = room1;
		clazz10A2.primaryTeacher = teacherTri;

		Clazz[] clazzs = { clazz10A1, clazz10A2 };

		Student studentNghi = new Student();
		studentNghi.id = 1;
		studentNghi.name = "Anh Nghi";
		studentNghi.studyingClazz = clazz10A1;

		Student[] students = { studentNghi };

		Subject subjectMath = new Subject();
		subjectMath.id = 1;
		subjectMath.name = "Toan";
		subjectMath.multiplication = 2;

		Subject subjectHistory = new Subject();
		subjectHistory.id = 2;
		subjectHistory.name = "Lich Su";
		subjectHistory.multiplication = 1;

		Subject[] subjects = { subjectMath, subjectHistory };

//		Dung va Tri cung day mon Toan		
//		chi minh Tri day mon Lich Su

		TeacherKnowledge dungTeachMath = new TeacherKnowledge();
		dungTeachMath.teacher = teacherDung;
		dungTeachMath.teachingSubject = subjectMath;

		TeacherKnowledge dungTeachHistory = new TeacherKnowledge();
		dungTeachHistory.teacher = teacherDung;
		dungTeachHistory.teachingSubject = subjectHistory;

		TeacherKnowledge triTeachHistory = new TeacherKnowledge();
		triTeachHistory.teacher = teacherTri;
		triTeachHistory.teachingSubject = subjectHistory;

		TeacherKnowledge[] teacherKnowledges = { dungTeachMath, dungTeachHistory, triTeachHistory };

		Exam examFinalSem1Math = new Exam();
		examFinalSem1Math.id = 1;
		examFinalSem1Math.name = "Kiem tra Cuoi ki mon Toan HK1";
		examFinalSem1Math.subject = subjectMath;
		examFinalSem1Math.semester = sem1;
		examFinalSem1Math.multiplication = 2;

		Exam examOralSem1Math = new Exam();
		examOralSem1Math.id = 2;
		examOralSem1Math.name = "Kiem tra Mieng mon Toan HK1";
		examOralSem1Math.subject = subjectMath;
		examOralSem1Math.semester = sem1;
		examOralSem1Math.multiplication = 1;

		Exam examFinalSem1History = new Exam();
		examFinalSem1History.id = 3;
		examFinalSem1History.name = "Kiem tra Cuoi ki mon Lich Su HK1";
		examFinalSem1History.subject = subjectHistory;
		examFinalSem1History.semester = sem1;
		examFinalSem1History.multiplication = 1;

		Exam examFinalSem2Math = new Exam();
		examFinalSem2Math.id = 4;
		examFinalSem2Math.name = "Kiem tra Cuoi ki mon Toan HK2";
		examFinalSem2Math.subject = subjectMath;
		examFinalSem2Math.semester = sem2;
		examFinalSem2Math.multiplication = 2;

		Exam examOralSem2Math = new Exam();
		examOralSem2Math.id = 5;
		examOralSem2Math.name = "Kiem tra Cuoi ki mon Toan HK2";
		examOralSem2Math.subject = subjectMath;
		examOralSem2Math.semester = sem2;
		examOralSem2Math.multiplication = 2;

		Exam examFinalSem2History = new Exam();
		examFinalSem2History.id = 6;
		examFinalSem2History.name = "Kiem tra Cuoi ki mon Toan HK2";
		examFinalSem2History.subject = subjectHistory;
		examFinalSem2History.semester = sem2;
		examFinalSem2History.multiplication = 2;

		Exam[] exams = { examFinalSem1Math, examOralSem1Math, examFinalSem1History, examFinalSem2Math, examOralSem2Math,
				examFinalSem2History };

		Point pointFinalSem1Math = new Point();
		pointFinalSem1Math.student = studentNghi;
		pointFinalSem1Math.exam = examFinalSem1Math;
		pointFinalSem1Math.value = 8;

		Point pointOralSem1Math = new Point();
		pointOralSem1Math.student = studentNghi;
		pointOralSem1Math.exam = examOralSem1Math;
		pointOralSem1Math.value = 9;

		Point pointFinalSem1History = new Point();
		pointFinalSem1History.student = studentNghi;
		pointFinalSem1History.exam = examFinalSem1History;
		pointFinalSem1History.value = 8;

		Point pointFinalSem2Math = new Point();
		pointFinalSem2Math.student = studentNghi;
		pointFinalSem2Math.exam = examFinalSem2Math;
		pointFinalSem2Math.value = 6;

		Point pointOralSem2Math = new Point();
		pointOralSem2Math.student = studentNghi;
		pointOralSem2Math.exam = examOralSem2Math;
		pointOralSem2Math.value = 10;

		Point pointFinalSem2History = new Point();
		pointFinalSem2History.student = studentNghi;
		pointFinalSem2History.exam = examFinalSem2History;
		pointFinalSem2History.value = 9;

		Point[] points = { pointFinalSem1Math, pointOralSem1Math, pointFinalSem1History, pointFinalSem2Math,
				pointOralSem2Math, pointFinalSem2History };
		for (Student student : students) {
			System.out.println("Name: " + student.name);
			System.out.println("Class: " + student.studyingClazz.name);
			System.out.println("Primary Teacher: " + student.studyingClazz.primaryTeacher.name);
			System.out.println("******************************");
			for (Year year : years) {

				System.out.println("Year : " + year.name);
				double averagePointYear = 0;
				double totalPointSemester = 0;
				double toltalMultiplicationSemester = 0;

				for (Semester semester : semesters) {
					double averagePointSemester = 0;
					double totalPointSubject = 0;
					double toltalMultiplicationSubject = 0;
					if (semester.year.id == year.id) {
						System.out.println("Semester : " + semester.name);
						System.out.println("");

						for (Subject subject : subjects) {

							double averagePointSubject = 0;
							double totalPointExam = 0;
							double totalMultiplicationExam = 0;
							System.out.println("Subject : " + subject.name);

							for (Exam exam : exams) {
								if (exam.subject == subject && exam.semester == semester) {
									totalMultiplicationExam += exam.multiplication;

									for (Point point : points) {
										if (point.exam.id == exam.id && point.student == student) {
											System.out.println(exam.name + " --- Point : " + point.value);
											totalPointExam += point.value * point.exam.multiplication;

										}

									}

								}

							}
							averagePointSubject = totalPointExam / totalMultiplicationExam;
							System.out.println("Average Point : " + Math.round(averagePointSubject * 100.0) / 100.0);
							System.out.println("");
							toltalMultiplicationSubject += subject.multiplication;
							totalPointSubject += averagePointSubject * subject.multiplication;

						}
						averagePointSemester = totalPointSubject / toltalMultiplicationSubject;
						System.out.println(
								"Average of all subjects :" + Math.round(averagePointSemester * 100.0) / 100.0);
						System.out.println("******************************");
						toltalMultiplicationSemester += semester.multiplication;
						totalPointSemester += averagePointSemester * semester.multiplication;

					}
				}

				averagePointYear = totalPointSemester / toltalMultiplicationSemester;
				System.out.println("Average of " + year.name + " : " + "" + Math.round(averagePointYear * 100.0) / 100.0);
				System.out.println("******************************");

			}
		}
	}
}
