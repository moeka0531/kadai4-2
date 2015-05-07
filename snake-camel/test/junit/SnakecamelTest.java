package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;


import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakecamelTest {

	@Test
	public void snakeToCamelcase��������ƍ쓮����(){
		StringBuilder sb = new StringBuilder();
		String expected = "IkimonoGakari";
		String actual = SnakeCamelUtil.snakeToCamelcase("ikimono_gakari");
		assertThat(actual,is(expected));
	}
	public void camelToSnakecase��������ƍ쓮����(){
		StringBuilder sb = new StringBuilder();
		String expected = "ikimono_gakari";
		String actual = SnakeCamelUtil.snakeToCamelcase("IkimonoGakari");
		assertThat(actual,is(expected));
		
	}
	public void capitalize��������ƍ쓮����(){
		StringBuilder sb = new StringBuilder();
		String expected = "Ikimono";
		String actual = SnakeCamelUtil.snakeToCamelcase("ikimono");
		assertThat(actual,is(expected));
	}
	public void uncapitalize��������ƍ쓮����(){
		StringBuilder sb = new StringBuilder();
		String expected = "ikimono";
		String actual = SnakeCamelUtil.snakeToCamelcase("Ikimono");
		assertThat(actual,is(expected));
	}


}
