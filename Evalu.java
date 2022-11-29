package evaluation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
//import java.io.BufferedReader;



public class Evalu {
	protected void finalize() throws Throwable{
		try {
			System.out.println("Check");
		}catch(Exception e) {
			throw e;
		}finally {
			System.out.println(" Cleared");
			super.finalize();
		}
	}

	
	public static void main(String[] args) throws Throwable {
		Set<String> hashValue = new HashSet<String>();
		HttpClient client = HttpClient.newHttpClient();
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		ObjectInputStream ins = null;
		Evalu evv = new Evalu();
		//READ GSON FROM THE FILE
		try {
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.nationalize.io/?name=nathaniel")).build();
		HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
		
		
		
		fos = new FileOutputStream("C:\\Users\\User003\\eclipse-workspace\\khulood\\eval.txt");
		oos = new ObjectOutputStream(fos);
		ins = new ObjectInputStream(new FileInputStream("C:\\Users\\User003\\eclipse-workspace\\khulood\\eval.txt"));
		evv.finalize();
		//WRITE GSON IN THE FILE	
		
		System.out.println("Done Added In The File Succsesfuly");
        String writeJson = response.body();
        oos.writeObject(writeJson);
		} catch(Exception v)    {
			System.out.println(v);
		}
		//SEARCH
		try {
		System.out.println("\r\n"+"Please Enter The Word That You Want To Search");
	
		String value = sc.next();
		Scanner sc1;
		sc1 = new Scanner(new FileInputStream("C:\\Users\\User003\\eclipse-workspace\\khulood\\eval.txt"));
		boolean country = false;
		while (sc1.hasNextLine()) {
			
			String line = sc1.nextLine();
			if (line.indexOf(value) <= 1  && !line.contains(value)) {
				country = true;
			}

		}
		if (country) {
			System.out.println("File contains the specified word: " + value);
			
			
		} else {
			System.out.println("Not in the File");
		}

	} catch (Exception e) {
		
	}
		}


	
	}


