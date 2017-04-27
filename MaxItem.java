import java.io.*;
import java.util.*;




class Item {
	int index;
	double weight;
	double val;
	public Item(int idx, double wt, double ben) {
		index = idx;
		weight = wt;
		val = ben;
	}

	public int getIndex(){
		return index;
	}

	public double getWeight(){
		return weight;
	}

	public double getValue(){
		return val;
	}
}

public class MaxItem {
	public static void main(String[] args) {
		File filename = null;
		if (args.length > 0) {
			filename = new File(args[0]);
		}
		System.out.println("the file name is : "+filename);
		try{
			FileInputStream fis = new FileInputStream(filename);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line = null;
			ArrayList<Item> wt = new ArrayList<Item>();
			ArrayList<Item> vl = new ArrayList<Item>();
			while ( (line = br.readLine()) != null ) {
				if(line.length() == 0)
					continue;
				String[] lineArray = line.split(":");
				int W = Integer.parseInt(lineArray[0].trim());				
				String[] stringItems = lineArray[1].trim().split(" ");
				
				for(String stringItem : stringItems){
					String[] itemDetails = stringItem.split(",");
					int id = Integer.parseInt(itemDetails[0].substring(1));
					double weight = Double.parseDouble(itemDetails[1]);
					double price = Double.parseDouble(itemDetails[2].substring(1, itemDetails[2].length()-1));
					Item item = new Item(id, weight, price);
					wt.add(item);
					vl.add(item);
				}

				for(Item i : wt) {
					System.out.print(i.getIndex()+ " " +i.getWeight()+ " "+ i.getValue());
					System.out.println();

				}
				// for(Item i : vl) {
				// 	System.out.print(i.getIndex()+ " " +i.getWeight()+ " "+ i.getValue());
				// 	System.out.println();

				// }
				int n = wt.size();
				int[][] k = new int[n+1][W+1];

				

				for(int l=0; l<n+1; l++){
					
				}


				
			}
		} catch(IOException e) {
			System.out.println(e);
		}

		
	}
}