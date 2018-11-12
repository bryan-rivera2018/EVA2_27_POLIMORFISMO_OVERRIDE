/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Doctor dSimi = new Doctor();
       dSimi.tratarPaciente();
       Cirujano cStrange = new Cirujano();
       cStrange.tratarPaciente();
       cStrange.Cobrar();
       Doctor dChapatin = new Cirujano();
       dChapatin.tratarPaciente();
       Cirujano cHouse = (Cirujano)dChapatin;//Si es decendiente a la clase que quieramos convertir
       //es un casting
       cHouse.Cobrar();
    }
    
}
class Cirujano extends Doctor{
    public void Cobrar(){
        System.out.println("Harta lana!!");
    }
    @Override
    public void tratarPaciente() {
        System.out.println("Cirugia a corazon abierto");
    }
}
class Doctor{
    public void tratarPaciente(){
        System.out.println("Paracetamol");
    }
}