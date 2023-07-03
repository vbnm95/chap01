class Triangle {
	
	public static void main(String[] args) {
		int num = 20;

		for(int i=1; i<num; i++) {
			System.out.print(" ".repeat(i));
			System.out.println("#".repeat(num-i));
		}
	}

}
