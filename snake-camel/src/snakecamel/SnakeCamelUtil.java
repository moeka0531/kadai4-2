package snakecamel;


import java.util.ArrayList;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		ArrayList<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
	
		for(int i = 0; i < list.size(); i++){
			if(words[i].length()!=0) list.add(words[i]);
		}
		String[] words2 = new String[list.size()];
		for(int i = 0; i < list.size(); i++){
			words2[i]=list.get(i);
		}
		for (int i = 0; i < list.size(); i++) {
			sb.append(capitalize(words2[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i++;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
	public static void main(String[] args){
		System.out.println(capitalize(" "));
		System.out.println(capitalize("a"));
		System.out.println(capitalize("xyz"));
		
		System.out.println(uncapitalize(" "));
		System.out.println(uncapitalize("A"));
		System.out.println(uncapitalize("Xyz"));
		
		System.out.println(snakeToCamelcase("abc"));
		System.out.println(snakeToCamelcase("abc_def"));
		System.out.println(snakeToCamelcase("abc_def_gh"));
		System.out.println(snakeToCamelcase("abc__def___gh"));
		System.out.println(snakeToCamelcase("_abc_def__"));
		
	
		System.out.println(camelToSnakecase("Abc"));
		System.out.println(camelToSnakecase("AbcDef"));
		System.out.println(camelToSnakecase("AbcDefGh"));
	}
	
}
