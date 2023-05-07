package br.com.faeterj.teste;

import br.com.faeterj.Aluno;
import java.io.*;

/* alunos:
 * José Matheus Flora
 * Pedro lopez
 * Lucas Brienzo
 * Brenda
 */
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno al = new Aluno("jose");
		
		try {
			FileOutputStream fos = new FileOutputStream("arquivoComObjeto.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(al);
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("arquivoComObjeto.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Aluno al2 = (Aluno)ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println("nome do aluno:" +al2.getNome());
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
