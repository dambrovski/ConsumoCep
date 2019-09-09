package br.com.airton.ConsumoCep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.omg.CORBA.portable.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String json;
    	Scanner sc = new Scanner(System.in);
    	String URL_Base = "viacep.com.br/ws";
    	String codCep = null;
        System.out.println( "Digite o Número do CEP: " );
        codCep = sc.next();

    }

    }
