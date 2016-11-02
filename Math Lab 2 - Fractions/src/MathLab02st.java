// MathLab02st.java
// The Rational Class Program I
// This is the student, starting version of the MathLab02 assignment.


import javax.swing.JOptionPane;


public class MathLab02st
{
	public static void main (String args[])
	{   
		String strNbr1 = JOptionPane.showInputDialog("Enter Numerator "); 
		String strNbr2 = JOptionPane.showInputDialog("Enter Denominator ");

		int num = Integer.parseInt(strNbr1);
		int den = Integer.parseInt(strNbr2);

		Rational r = new Rational(num,den);
		JOptionPane.showMessageDialog(null,r.getOriginal() + " equals " + 
				r.getDecimal() + "\n and reduces to " + r.getRational());

		System.exit(0);
	}
}

				

class Rational<reduce>
{
	private int firstNum, firstDen, num, den;
//	Rational
    public Rational(int numerator, int denominator)
    {
       firstNum = numerator;
       firstDen = denominator;
       reduce();
    }	
	
//	getNum
	public int getNum()
	{
		return firstNum;
	}
	
//	getDen
	public int getDen()
{
		return firstDen;
}
//	getDecimal
	public double getDecimal()
	{
		return (double) firstNum/firstDen;
	}
//	getRational 
    public String getRational()
    {
    return num+"/"+den;
    }
//	getOriginal
    public String getOriginal()
    {
      	return firstNum + "/"+ firstDen;
    }
//	reduce
    private void reduce()
    {
    	int gcf = getGCF(firstNum,firstDen);
    	num = firstNum/gcf;
    	den = firstDen/gcf;
//    	System.out.println(num + " " + den);
    }

	private int getGCF(int n1,int n2)
	{
		int rem = 0;
		int gcf = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
		return gcf;
	} 
}



	

 


