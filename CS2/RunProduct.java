import java.util.ArrayList;

class RunProduct {
	public static void main(String[] args) {
		ReadingProducts r = new ReadingProducts("products.txt");
		r.openProcessFile();

		ArrayList<Product> list = r.getProducts();
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).name); 
		System.out.print("Done");
	}
}