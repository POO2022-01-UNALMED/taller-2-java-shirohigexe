package test;
public class Auto {
	   String modelo;
	   int precio;
	   Asiento[] asientos;
	   String marca;
	   Motor motor;
	   int registro; 
	   static int contidadCreados;

	   int cantidadAsientos(){
		   int total = 0;
	       for (Asiento i; this.asientos){
	           if(i != null) {
	        	   total++;
	           }
	       }
	       return total;
	    	}
	   String verificarIntegridad() {
		   for (Asiento u;this.asientos) {
			 if (u != null) {
				 if (this.registro != u.registro && this.registro != this.motor.registro) {
					 return "Las piezas no son originales";
				 }
				 else {
					 return "Auto original";
				 }
				 
			 }
		   }
	}
}