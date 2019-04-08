package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExemplo {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("08/04/2019");
		Date y2 = sdf2.parse("08/04/2019 14:49:05");
		
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println("-----------");
		
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		
		System.out.println("-----------");
		//data atual
		Date atual = new Date();
		System.out.println(atual);
		System.out.println("data formatada "+sdf2.format(atual));

	}

}
