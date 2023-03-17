package br.com.faeterj.agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Agenda {
	
		public static void escrita(String nome, String telefone) {
			try {
			FileWriter fw = new FileWriter("agenda.vas");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(nome+";"+telefone);
			bw.newLine();
			bw.close();
			fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		public static void lerTodos() {
			try {
				FileReader fr = new FileReader("agenda.vas");
				BufferedReader br = new BufferedReader(fr);
				while(br.ready()) {
					String aux = br.readLine(); 
					String [] dados = aux.split(";");
					System.out.println("Aluno:" + dados[0] + " Telefone:" + dados[1]);
				}
				br.close();
				fr.close();
			} catch (FileNotFoundException e) {
				// BLABLABLA
				e.printStackTrace();
			} catch(IOException e) {
				// VASCO
				e.printStackTrace();
			}
		}
		public static void ler(String nome) {
			try {
				FileReader fr = new FileReader("agenda.vas");
				BufferedReader br = new BufferedReader(fr);
				boolean encontrado = false;
				while(br.ready()) {
					String aux = br.readLine(); 
					if(aux.contains(nome)) {
					String [] dados = aux.split(";");
					System.out.println("Aluno:" + dados[0] + " Telefone:" + dados[1]);
					encontrado = true;
					}
				}
				if(!encontrado) {
					System.out.println("Dados não encontrados");
				}
				br.close();
				fr.close();
			} catch (FileNotFoundException e) {
				// BLABLABLA
				e.printStackTrace();
			} catch(IOException e) {
				// VASCO
				e.printStackTrace();
			}
		}
}
