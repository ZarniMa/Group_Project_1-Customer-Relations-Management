/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

public class Quit implements MenuItem{
    @Override
    public void execute() {
        System.exit(0);
    }
    
    @Override
    public String toString() {
        return "Quit";
    }
}
