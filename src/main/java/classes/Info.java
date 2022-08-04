package classes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * Métodos dados retorna as informações do computador
 * e do sistema operacional
 * 
 * temos as seguintes informações com suas respectivas posições <br>
 * 
 * - 0 -> número de processadores <br>
 * - 1 -> total de memória livre <br>
 * - 2 -> total de memória do computador <br>
 * - 3 -> memória utilizada pelo computador <br>
 * - 4 -> raiz do sistema <br>
 * - 5 -> espaço total disco <br>
 * - 6 -> espaço livre no disco <br>
 * - 7 -> espaço usado no disco <br>
 * - 8 -> nome do sistema operacional <br>
 * - 9 -> arquitetura do sistema operacional <br>
 * - 10 -> versão do sistema operacional <br>
 * - 11 -> separador de arquivos <br>
 * - 12 -> separador de packs <br>
 * - 13 -> separador de linha <br>
 * - 14 ->  nome de usuario <br>
 * - 15 -> pasta do usuario <br>
 * - 16 -> pasta corrente do usuario <br>
 * @author Gustavo Fernandes  
 * 
 *
 */


public class Info {
	public List<String> infocomp() {
		List<String> dados = new ArrayList<String>();
		// Total de numero de processadores
		/* Total number of processors or cores available to the JVM */

		dados.add(String.valueOf(Runtime.getRuntime().availableProcessors()));

		/* Total amount of free memory available to the JVM */

		dados.add(String.valueOf(Runtime.getRuntime().freeMemory()));
		
		
		/* This will return Long.MAX_VALUE if there is no preset limit */
	    long maxMemory = Runtime.getRuntime().maxMemory();
	    
		/* This will return Long.MAX_VALUE if there is no preset limit */

		dados.add(String.valueOf(maxMemory));
		
		/* Total memory currently available to the JVM */
		dados.add(String.valueOf(Runtime.getRuntime().totalMemory()));	
		
		
		 /* For each filesystem root, print some info */

	    /* Get a list of all filesystem roots on this system */
		 File[] roots = File.listRoots();
	    for (File root : roots) {
	      dados.add(String.valueOf(root.getAbsolutePath()));

	      dados.add(String.valueOf(root.getTotalSpace()));
	      

	      dados.add(String.valueOf(root.getFreeSpace()));
	      

	      dados.add(String.valueOf(root.getUsableSpace()));     
	           
	    }
	    
	    dados.add(System.getProperty("os.name"));
	    dados.add(System.getProperty("os.arch"));
	    dados.add(System.getProperty("os.version"));
	    dados.add(System.getProperty(" file.separator"));
	    dados.add(System.getProperty("path.separator"));
	    dados.add(System.getProperty("line.separator"));
	    dados.add(System.getProperty("user.name"));
	    dados.add(System.getProperty("user.home"));
	    dados.add(System.getProperty("user.dir"));
	     
	    
	    for (int i = 0; i < dados.size(); i++) {
	    	System.out.println(i+ " - " + dados.get(i));
	    }
		return dados;
	}

}
