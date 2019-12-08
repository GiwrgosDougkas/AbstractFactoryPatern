/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import Concrete.Computers;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Computers> computers= new ArrayList<>();
        computers.add(FactoryComputer.createComputer(new PcFactory("Inter","8","256")));
        computers.add(FactoryComputer.createComputer(new ServerFactory("Amd","32","1024")));
        
        for(Computers c: computers){
            c.getStats(); 
        
        }
        
        
    }
    
}
