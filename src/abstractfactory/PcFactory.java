/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import Concrete.Computers;
import Concrete.Pc;

/**
 *
 * @author George
 */
public class PcFactory implements AbstractComputerFactory{
    private final String name="PC";
    private String cpu;
    private String ram;
    private String hdd;
    
    public PcFactory(String aCpu, String aRam, String aHdd){
        this.cpu=aCpu;
        this.ram=aRam;
        this.hdd=aHdd;
    }
    
    @Override
    public Computers createComputer() {
        return new Pc(cpu,ram,hdd,name);
    }
    
}
