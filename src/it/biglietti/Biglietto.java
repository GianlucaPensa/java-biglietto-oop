package it.biglietti;

import java.math.BigDecimal;
import java.math.MathContext;

public class Biglietto {
		private int km, età;
		private final BigDecimal COSTO_PER_KM = new BigDecimal (0.21);
		private final BigDecimal SCONTO_OVER_60 = new BigDecimal (0.4);
		private final BigDecimal SCONTO_UNDER_18 = new BigDecimal (0.2);
		
		
		public Biglietto(int km, int età){
			this.km = km;
			this.età = età;
		}
		
		public boolean isValidKm() throws Exception{
			if (km<= 0) {
				throw new Exception("Input a number above 0");
			}
			return true;
		}
		
		public boolean isValidEtà() throws Exception{
			if (età<= 0) {
				throw new Exception("Input a number above 0");
			}
			return true;
		}
		
		public BigDecimal calcolaPrezzo(){
			MathContext context = new MathContext(3);
			BigDecimal kmBD = new BigDecimal(km);
			BigDecimal costo = COSTO_PER_KM.multiply(kmBD);
			BigDecimal sconto = costo.multiply(calcolaSconto());
			return costo.subtract(sconto,context);
		}
		
		private BigDecimal calcolaSconto() {
			if (età<18) {
				return SCONTO_UNDER_18;
			}
			else if (età>60) {
				return SCONTO_OVER_60;
			}
			return new BigDecimal (0);
		}
		
}
