/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import Concrete.Computers;

/**
 *
 * @author George
 */
public interface AbstractComputerFactory {
    Computers createComputer();
}
