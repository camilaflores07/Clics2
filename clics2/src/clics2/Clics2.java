/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clics2;

/**
 *
 * @author 50494
 */
public class Clics2 {

   
    public static void main(String[] args) {
      
        double clics60=60, clics100=100, clics20=20;
        double CostoClic60 = 0.30;
        double CostoClic100 = 0.25;
        double CostoClic20 = 0.80;
        double costototal1, costototal2, costototal3;
        double CostoTotal;
        double impuesto=0.16;
        double CPromedio;
        double Totalimpuesto;
        double TOTAL;
       
        
        
        costototal1 = clics60 * CostoClic60;
        costototal2 = clics100 * CostoClic100;
        costototal3 = clics20 * CostoClic20;
        
        CostoTotal = costototal1 + costototal2 + costototal3;
        
        CPromedio = CostoTotal/180;
        Totalimpuesto = CostoTotal + impuesto;
        TOTAL = CostoTotal * impuesto;
        
        System.out.println("su promedio por clics es: " +CPromedio);
        System.out.println("su costo total de : " +CostoTotal + "con ISV es de: "+ TOTAL);
        
        
        
        
        
 
       
        
    }
    
}
