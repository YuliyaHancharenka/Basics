package javabasic.module2.itSpecialists.main;

import javabasic.module2.itSpecialists.NetDeveloper;
import javabasic.module2.itSpecialists.QAspecialist;

public class Main {
	public static void main(String[] args) {

		NetDeveloper netdev1 = new NetDeveloper();
		QAspecialist qa1 = new QAspecialist();

		netdev1.name = "Yuliya";
		netdev1.qualification = "Developer";
		netdev1.specialization = "Web";

		qa1.name = "Halina";
		qa1.specialization = "QA";

		netdev1.projectProgram();
		qa1.writeTests();

	}
}
