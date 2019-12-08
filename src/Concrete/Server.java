/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

/**
 *
 * @author George
 */
public class Server implements Computers{
    private String cpu;
    private String ram;
    private String hdd;
    private String name;
    public Server(String aCpu, String aRam, String aHdd, String name){
        this.cpu=aCpu;
        this.ram=aRam;
        this.hdd=aHdd;
        this.name=name;
    }

    @Override
    public void getStats() {
        System.out.println("CPU:"+this.cpu+" RAM:"+this.ram+" HDD:"+this.hdd+" "+this.name+System.lineSeparator());
       
    }
}
