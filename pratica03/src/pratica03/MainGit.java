package pratica03;

public class MainGit {

	public static void main(String[] args) {
		Integer x[]= new Integer[4];
		multiplicacao(x);
	}
  static void multiplicacao(Integer x[]) {
	for (int i = 0; i < x.length; i++) {
		x[i]= x[i]*10;
	}
  }
}