package XDPJFLOTA.Flota;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObslugaCSVFlota {
	
	static List<FlotaClass> wczytaj(File plik) {
		List<FlotaClass> flota = new ArrayList<>();
		
		try(BufferedReader in = new BufferedReader(new FileReader(plik))) {
			in.readLine(); 
			
			String linia;
			while((linia = in.readLine()) != null) {
				String[] t = linia.split(";", 19);
			FlotaClass emp = new FlotaClass(t[0],t[1],t[2],
					t[3],t[4],t[5],t[6],t[7],t[8],
					t[9],t[10],t[11],t[12],t[13],t[14],
					t[15],t[16],t[17],t[18]);
				flota.add(emp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return flota;
	}

	static List<FlotaClass> wczytaj(String sciezka) {
		return wczytaj(new File(sciezka));
	}
	

}
