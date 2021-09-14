package azul;

import br.edu.nruchs.Cliente;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pedido extends Cliente {
	public static void main (String [] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar c = Calendar.getInstance();
		System.out.println( sdf.format(c.getTime() ) );
		c.add(Calendar.DAY_OF_YEAR,1 );
		c.add(Calendar.MONTH,1 );
		c.add(Calendar.YEAR,1 );
		c.add(Calendar.HOUR , 1);
		c.add(Calendar.MINUTE , 1);
		c.add(Calendar.SECOND , 1);
		System.out.println( sdf.format(c.getTime() ));
		
	}

}
