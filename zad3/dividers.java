public class dividers {
	public static void main(String args[]) {
		for(int i = 0;i<args.length;i++) {
			int n=0;
			try { n=Integer.parseInt(args[i]);

			System.out.println("Podana "+(i+1)+". "+ "liczba: "+n);

			System.out.println("Jej najwyzszy dzielnik to: "+div(n)+"\n"); }
			catch (NumberFormatException ex) {
				System.out.println(args[i] + " nie jest calkowita" );
			}
		}
	}

	public static int div(int n) {
		int greatestDiv = 1;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				greatestDiv = i;
			}
		}
		//System.out.println("Najwiekszy dzielnik: "+greatestDiv);
		return greatestDiv;
	}

}

