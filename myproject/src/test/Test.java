package test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
public class Test {
	public static void main (String []args){
		/*Locale locales[]=Locale.getAvailableLocales();
		for(Locale l : locales){
			System.out.println(l.getDisplayCountry() + "="
					+ l.getCountry() + " "
					+ l.getDisplayLanguage() + "="
					+ l.getLanguage()
					);
		}*/
		System.out.println("��Ҫ��ͬ���ҵ����ʺã����ã�");
		Locale lc = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("messageResource",lc);
		System.out.println(rb.getString("hello"));
		String message = rb.getString("welcome");
		String msgFor=MessageFormat.format(message,"��","3");
		System.out.println(msgFor);
		
	}}
