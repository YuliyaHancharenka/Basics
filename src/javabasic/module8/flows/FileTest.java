package javabasic.module8.flows;

import java.io.*;

class FileTest {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF8"), true);
		File f = new File("FileTest.Java");
		pw.println();
		pw.println("Файл\"" + f.getName() + "\" " + (f.exists() ? "" : "не ") + "существует");
		pw.println("Вы " + (f.canRead() ? "" : "не ") + "можете читать файл");
		pw.println("Вы " + (f.canWrite() ? "" : "не ") + "можете записывать в файл");
		pw.println("Длина файла " + f.length() + " б");
		pw.println();
		File d = new File("C:\\Users");
		pw.println("Содержимое каталога:");
		if (d.exists() && d.isDirectory()) {
			String[] s = d.list();
			for (int i = 0; i < s.length; i++)
				pw.println(s[i]);
		}
	}
}
