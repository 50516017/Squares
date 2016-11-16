package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6 };
		double y[] = { 1.0, 0.9, 1.2, 4.3, 4.8, 3.1, 7.2 };
		double theta[] = new double[2];
		Squares_lib slib = new Squares_lib(x, y);
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			 System.out.println(i+" : theta[0] = "+theta[0]);
			 System.out.println(i+" : theta[1] = "+theta[1]);
			 System.out.println(i+" : Objective function = "+slib.getRx());
		}
	}

}
/*データdouble x[] = { 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6 };
double y[] = { 1.0, 0.9, 1.2, 4.3, 4.8, 3.1, 7.2 };
理論値　傾き9.5,切片0.364285
y=9.5x+0.364285*/