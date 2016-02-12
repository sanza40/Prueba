/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejed;

/**
 *
 * @author sanza
 */
public class EjED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j, cont=0, num;//cont no se utiliza

	num=ES.leeNº("Escribe un numero"); //Leído por la clase ES
	for(i=0;i<num;i++){
		for(j=0; j<num; j++){
			System.out.print(((i+j)%num+1)+"\t");
		}
		System.out.println();
	}
    }
    
}
