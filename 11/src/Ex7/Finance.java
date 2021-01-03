package Ex7;

import java.text.DecimalFormat;

public class Finance {
	DecimalFormat df=new DecimalFormat("0.00");
	double loanAm,intrate,loanPer;
	double[] Loan=new double[3];
	Finance(double a,double b,double c){
		this.loanAm=a;
		this.intrate=b;
		this.loanPer=c;
	}

	public double[] LoanInter(){
		Loan[0]=(intrate/100)*loanAm*loanPer;
		Loan[1]=Loan[0]/(loanPer*12);
		Loan[2]=(loanAm+Loan[0])/(loanPer*12);
		return Loan;
	}
	
	public String[] tostring(double[] a) {
		String[] s=new String[a.length];
		for(int i=0;i<s.length;i++) {
			s[i]=String.valueOf(df.format(a[i]));
		}
		return s;
	}
	
	public double afterpay(double sal,double a) {
		double ap=sal-a;
		return ap;
	}
	
}
