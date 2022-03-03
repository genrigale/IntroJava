package by.epam.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
//	02. Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий 
//		тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи 
//		нельзя 

	public static void main(String[] args) {
		String xmlDoc = "<notes>\n"
				+ "   <note id = \"1\">\n"
				+ "       <to>Вася</to>\n"
				+ "       <from>Света</from>\n"
				+ "       <heading>Напоминание</heading>\n"
				+ "       <body>Позвони мне завтра!</body>\n"
				+ "   </note>\n"
				+ "   <note id = \"2\">\n"
				+ "       <to>Петя</to>\n"
				+ "       <from>Маша</from>\n"
				+ "       <heading>Важное напоминание</heading>\n"
				+ "       <body/>\n"
				+ "   </note>\n"
				+ "</notes>";
		
		analyseXml(xmlDoc);
		

	}
	
	public static void analyseXml(String input) {
		Pattern openTag = Pattern.compile("<\\w.+?>");
		Pattern closeTag = Pattern.compile("</\\w.+?>");
		Pattern innerText = Pattern.compile(">.+<");
		Pattern tagWithoutBody = Pattern.compile("<\\w.+?>");
		
		StringBuilder result = new StringBuilder();
		
		String[] strings = input.split("\n");
		
		for(String str : strings) {
				Matcher matcherOpenTag = openTag.matcher(str);
				Matcher matcherCloseTag = closeTag.matcher(str);
				Matcher matcherInnerText = innerText.matcher(str);
				Matcher matcherTagWithoutBody = tagWithoutBody.matcher(str);
				
				if(matcherOpenTag.find()) {
					result.append(matcherOpenTag.group());
					result.append(" - это открывающий тег.\n");
					
				}
				
				if(matcherCloseTag.find()) {
					result.append(matcherCloseTag.group());
					result.append(" - это закрывающий тег.\n");
				}
				
				if(matcherInnerText.find()) {
					result.append(matcherInnerText.group(), 1, matcherInnerText.group().length() - 1);
					result.append(" - это содержимое.\n");
				}
				
				if(matcherTagWithoutBody.find()) {
					result.append(matcherTagWithoutBody.group());
					result.append(" - это тег без тела.\n");
				}			
		}
		System.out.println(result);		
	}

}
