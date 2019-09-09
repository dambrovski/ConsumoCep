package br.com.airton.ConsumoCep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.omg.CORBA.portable.InputStream;

/**
 * Hello world!
 *
 */
public class App {
	 public static void main(String[] args) throws IOException {
		 
		 	Scanner sc = new Scanner(System.in);

	        Boolean menu = true;
	        String opcao = null;
	        
	        while(menu) {
	        	
				String codCep = null;
				System.out.println("Digite o Número do CEP: ");
				codCep = sc.next();
				
		        System.out.println(br.com.airton.ConsumoCep.ClienteWS.getEnderecoPorCep(codCep));
		        System.out.println("--------------------------------------------------------");
		        System.out.println("Deseja continuar?");
		        System.out.println("Digite '1' para 'SIM'");
		        System.out.println("Digite '2' para 'NÃO'");
		        opcao = sc.next();
		        
		        if (opcao == "1") {
		        	menu = true;
				}
		        else {
		        	menu = false;
				}
		        
	        	
	        }
		


	
	
	}

}
