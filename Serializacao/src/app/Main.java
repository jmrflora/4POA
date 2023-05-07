package app;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

	//Alunos
	// Pedro Henrique Lima 1920478300044
	// Thiago Santos Policarpo 2120478300011
	// Roberto de Araujo Pacheco Filho 2120478300031

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Roberto Pacheco", "2120478300031", "roberto.2120478300031@faeterj-rio.edu.br");
		
		try {
			FileOutputStream arquivoSer = new FileOutputStream("c:/arquivo/roberto.txt");
			ObjectOutputStream bufferSer = new ObjectOutputStream(arquivoSer);
			bufferSer.writeObject(aluno1);
			bufferSer.close();
			arquivoSer.close();

			aluno1.setNome("Janaina Possati");
			
			System.out.println("Printando os dados de aluno apos alterar uma de suas propriedades");
			System.out.println(aluno1.getNome());

			FileInputStream arquivoDestino = new FileInputStream("c:/arquivo/roberto.txt");
			ObjectInputStream bufferDestino = new ObjectInputStream(arquivoDestino);
			aluno1 = (Aluno) bufferDestino.readObject();
			bufferDestino.close();
			arquivoDestino.close();
	
			System.out.println("Printando os dados de alunos no estado em que estavam apos a serializacao");
			System.out.println(aluno1.getNome());

		} catch (FileNotFoundException error){
			error.printStackTrace();

		} catch (IOException error) {
			error.printStackTrace();

		} catch (ClassNotFoundException error) {
			error.printStackTrace();
		}
	
	}
}