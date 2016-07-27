import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;


public class SocialNetwork {

	public static void main(String[] args) {

		SocialNetwork mySocialNetwork = new SocialNetwork();
		Graph socialNetworkGraph = new Graph();
		FileOperation fileRW = new FileOperation();
		
		ArrayList<Entity> data1 = new ArrayList<Entity>();
		data1 = fileRW.readDataFromFile("InputData.txt");
		
		for (Entity entity : data1) {
			Node node = new Node(entity);
			socialNetworkGraph.addNode(node, false);
		}
		
		ArrayList<String> data2 = fileRW.readRelationsFromFile("InputRelations.txt");
		
		for (String string : data2) {
			System.out.println(string);
			String[] splitData = string.split(",");
			Node tmp =socialNetworkGraph.getNode(splitData[0]);
			for (int i = 1; i < splitData.length; i++) {
				socialNetworkGraph.addConnection(tmp, socialNetworkGraph.getNode(splitData[i]));
			}
		}
		
		Set<String> f = socialNetworkGraph.nodeKeys();
		
		for (String string : f) {
			System.out.println(string);
			Node node = socialNetworkGraph.getNode(string);
			ArrayList<Connection> connectionList = node.getAllConnections();
			for (Connection connection : connectionList) {
				System.out.println(connection.toString());
			}
		}
		
		
		
	}
	
	
	/**
	 * Method to read string data from standard input
	 * @param Name of variable to print 
	 * @return String value input by user
	 */
	public String getStringfromUser(String Name) {
		Scanner s= new Scanner(System.in);
		String string = "";		
		while(true) {
			try {
				System.out.println("Enter "+Name);
				string=s.next();
				if(string.length()>0) {
					break;
				}
				else {
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}
		}
		return string;
	}

}
