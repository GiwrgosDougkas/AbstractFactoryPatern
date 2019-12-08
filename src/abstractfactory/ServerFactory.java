/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import Concrete.Computers;
import Concrete.Server;

/**
 *
 * @author George
 */
public class ServerFactory implements AbstractComputerFactory{
    private final String name="Server";
    private String cpu;
    private String ram;
    private String hdd;
    
    public ServerFactory(String aCpu, String aRam, String aHdd){
        this.cpu=aCpu;
        this.ram=aRam;
        this.hdd=aHdd;
    }
    
    @Override
    public Computers createComputer() {
        return new Server(cpu,ram,hdd,name);
    }
    
}
