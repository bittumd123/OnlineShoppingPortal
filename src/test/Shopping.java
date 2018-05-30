package test;
import java.util.*;

interface OrderIntf{
	public void bill();
	public void display();
}
abstract class Order implements OrderIntf{
	int orderNo,quantity;
	double tamount;
	public Order(int orderNo, int quantity, double tamount) {
		super();
		this.orderNo = orderNo;
		this.quantity = quantity;
		this.tamount = tamount;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTamount() {
		return tamount;
	}
	public void setTamount(double tamount) {
		this.tamount = tamount;
	}
	public abstract void display();
	public abstract void bill();
}

class ProductPhone extends Order{

	public ProductPhone(int orderNo, int quantity, double tamount) {
		super(orderNo, quantity, tamount);
		// TODO Auto-generated constructor stub
	}
	 String phType,phId;
	 String phName;
	 double phPrice;
		
	public ProductPhone(int orderNo, int quantity, double tamount, String phType, String phId, String phName,
			double phPrice) {
		super(orderNo, quantity, tamount);
		this.phType = phType;
		this.phId = phId;
		this.phName = phName;
		this.phPrice = phPrice;
	}
	public String getPhType() {
		return phType;
	}
	public void setPhType(String phType) {
		this.phType = phType;
	}
	public String getPhId() {
		return phId;
	}
	public void setPhId(String phId) {
		this.phId = phId;
	}
	public String getPhName() {
		return phName;
	}
	public void setPhName(String phName) {
		this.phName = phName;
	}
	public double getPhPrice() {
		return phPrice;
	}
	public void setPhPrice(double phPrice) {
		this.phPrice = phPrice;
	}
	
	public void display(){
		System.out.println("\n Your Order :");
		System.out.println("\n Product type :"+getPhType());
		System.out.println("\n Product ID :"+getPhId());
		System.out.println("\n Product name :"+getPhName());
		System.out.println("\n Product price :"+getPhPrice());
	}
	public void bill() {
		// TODO Auto-generated method stub
		System.out.println("***** BILL (CELL PHONE) *****");
		tamount=phPrice*quantity;
		System.out.println("Total Quantity :"+quantity);
		System.out.println("Total Amount :"+getTamount());
	}
	 
}

class ProductClothes extends Order{

	public ProductClothes(int orderNo, int quantity, double tamount) {
		super(orderNo, quantity, tamount);
		// TODO Auto-generated constructor stub
	}
	
	String clType,clId;
	 String clName;
	 double clPrice;
	 
	 
		
	public ProductClothes(int orderNo, int quantity, double tamount, String clType, String clId, String clName,
			double clPrice) {
		super(orderNo, quantity, tamount);
		this.clType = clType;
		this.clId = clId;
		this.clName = clName;
		this.clPrice = clPrice;
	}
	public String getClType() {
		return clType;
	}
	public void setClType(String clType) {
		this.clType = clType;
	}
	public String getClId() {
		return clId;
	}
	public void setClId(String clId) {
		this.clId = clId;
	}
	public String getClName() {
		return clName;
	}
	public void setClName(String clName) {
		this.clName = clName;
	}
	public double getClPrice() {
		return clPrice;
	}
	public void setClPrice(double clPrice) {
		this.clPrice = clPrice;
	}
	
	public void display(){
		System.out.println("\n Your Order :");
		System.out.println("\n Product type :"+getClType());
		System.out.println("\n Product ID :"+getClId());
		System.out.println("\n Product name :"+getClName());
		System.out.println("\n Product price :"+getClPrice());
	}
	public void bill() {
		// TODO Auto-generated method stub
		System.out.println("***** BILL (CLOTHES) *****");
		tamount=clPrice*quantity;
		System.out.println("Total Quantity :"+quantity);
		System.out.println("Total Amount :"+getTamount());
	}
}

class Customer{
	int custId;
	String contact,name,address;
	Scanner scan = new Scanner(System.in);

	public Customer(int custId, String contact, String name, String address) {
		super();
		this.custId = custId;
		this.contact = contact;
		this.name = name;
		this.address = address;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", contact=" + contact
				+ ", name=" + name + ", address=" + address +  "]";
	}
	
	/* void getDetails(){
		System.out.println("\n Enter your Name :");
		name=scan.next();
		System.out.println("\n Enter ID :");
		custId=scan.nextInt();
		System.out.println("\n Enter contact number :");
		contact=scan.next();
		System.out.println("\n Enter address :");
		address=scan.next();
	}
	
	void displayDetails(){
		
		System.out.println("Name : "+getName());
		System.out.println("ID : "+getCustId());
		System.out.println("Contact number : "+getContact());
		System.out.println("Address : "+getAddress());
	} */
	
	

}
public class Shopping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ch1,ch2,ch3,phCh,clCh,quantity = 0,orderNo = 0;
		String phType = null,phId = null;
		String phName = null;
	//	String chyn;
		double phPrice = 0,tamount=0,clPrice=0;
		String clType = null,clId = null, clName = null;
		int custId = 0;
		String contact = null,name = null,address = null;
		ArrayList<Customer> a = new ArrayList<>();
		
		

		
		ProductPhone pph = new ProductPhone(orderNo,quantity,phPrice,phType,phId,phName,phPrice);
		ProductClothes pcl = new ProductClothes(orderNo,quantity,tamount,clType,clId,clName,clPrice);

		do{
			ch1=0;
			System.out.println("\n ********** NCODERS SHOPPING APPLICATION ********** \n");
			System.out.println("\n 1.CELL PHONE \n 2.CLOTHES \n 3.GENERATE BILL \n 4.EXIT");
			System.out.println("\n Enter your choice :");
			ch1=scan.nextInt();
			switch(ch1){
			case 1:
				do{
					System.out.println("\n ***** CELL PHONE *****");
					System.out.println("\n 1.LIST PRODUCTS \n 2.EXIT \n Enter your choice :");
					ch2=scan.nextInt();
					switch(ch2){
					case 1:
						do{
							System.out.println("\n 1.NCODERS SMARTPHONE MAX ->  PRICE Rs.15000");
							System.out.println("\n 2.NCODERS SMARTPHONE PLUS ->  PRICE Rs.12000");
							System.out.println("\n 3.NCODERS SMARTPHONE INFINITY ->  PRICE Rs.13000");
							System.out.println("\n 4.EXIT ");
							System.out.println("Which product you want to purchase :"); 
							phCh=scan.nextInt();
							switch(phCh){
							case 1:
								phType="SmartPhone";
								phId="MAX10001";
								phName="NCODER SMARTPHONE MAX";
								phPrice=15000;
								System.out.println("\n Enter quantity :");
								quantity=scan.nextInt();
								pph = new ProductPhone(1,quantity,phPrice,phType,phId,phName,phPrice);
								pph.display();
								System.out.println("\n \n \n");
								pph.bill();
								break;
								
							case 2:
								phType="SmartPhone";
								phId="PLUS10002";
								phName="NCODER SMARTPHONE PLUS";
								phPrice=12000;
								System.out.println("\n Enter quantity :");
								quantity=scan.nextInt();
								pph = new ProductPhone(1,quantity,phPrice,phType,phId,phName,phPrice);
								pph.display();
								System.out.println("\n \n \n");
								pph.bill();
								break;
								
							case 3:
								phType="SmartPhone";
								phId="INFINITY10003";
								phName="NCODER SMARTPHONE INFINITY";
								phPrice=13000;
								System.out.println("\n Enter quantity :");
								quantity=scan.nextInt();
								pph = new ProductPhone(1,quantity,phPrice,phType,phId,phName,phPrice);
								pph.display();
								System.out.println("\n \n \n");
								pph.bill();
								break;
								
							case 4:
								break;
								
							default:
								System.out.println("\n Please enter correct choice");
								break;
							}
							//System.out.println("Do you want to purchase anything more? (y/n)");
						//	chyn=scan.next();
						}while(phCh!=4);
						//}while(chyn=="n");
					case 2:
					/*	System.out.println("\n Enter your Name :");
						name=scan.next();
						System.out.println("\n Enter ID :");
						custId=scan.nextInt();
						System.out.println("\n Enter contact number :");
						contact=scan.next();
						System.out.println("\n Enter address :");
						address=scan.next();
						a.add(new Customer(custId, contact, name, address)); */
						break;
						
					default:
						System.out.println("\n Please enter correct choice");
						break;
					}
				}while(ch2!=2);
				break;
			case 2:
				do{
					System.out.println("\n ***** CLOTHES *****");
					System.out.println("\n 1.LIST PRODUCTS \n 2.EXIT \n Enter your choice :");
					ch3=scan.nextInt();
					switch(ch3){
					case 1:
						do{
							System.out.println("\n 1.NCODERS SLIM FIT T-SHIRT -> PRICE Rs.1500");
							System.out.println("\n 2.NCODERS FORMAL TROUSERS -> PRICE Rs.2500");
							System.out.println("\n 3.NCODERS FORMAL SHIRT -> PRICE Rs.2000");
							System.out.println("\n 4.EXIT ");
							System.out.println("\n Enter your choice :");
							clCh=scan.nextInt();
							switch(clCh){
							case 1:
								//public ProductClothes(int orderNo, int quantity, double tamount, String clType, String clId, String clName,
								//		double clPrice)
								//orderNo="";
								//tamount=1500;
								clType="Slim Fit";
								clId="SLIM20001";
								clName="Ncoders Slim Fit";
								clPrice=1500;
								System.out.println("\n Enter quantity :");
								quantity=scan.nextInt();
								pcl = new ProductClothes(orderNo, quantity, tamount, clType, clId, clName, clPrice);
								pcl.display();
								System.out.println("\n \n \n");
								pcl.bill();
								break;
								
							case 2:
								clType="Formal Trousers";
								clId="TROUSERS20002";
								clName="Ncoders Formal Trousers";
								clPrice=2500;
								System.out.println("\n Enter quantity :");
								quantity=scan.nextInt();
								pcl = new ProductClothes(orderNo, quantity, tamount, clType, clId, clName, clPrice);
								pcl.display();
								System.out.println("\n \n \n");
								pcl.bill();
								break;
								
							case 3:
								clType="Formal Shirt";
								clId="SHIRT20003";
								clName="Ncoders Formal Shirt";
								clPrice=2000;
								System.out.println("\n Enter quantity :");
								quantity=scan.nextInt();
								pcl = new ProductClothes(orderNo, quantity, tamount, clType, clId, clName, clPrice);
								pcl.display();
								System.out.println("\n \n \n");
								pcl.bill();
								break;
								
						case 4:
								 break;
								
							default:
								System.out.println("\n Please enter correct choice");
								break;
							}
						//	System.out.println("Do you want to purchase anything more? (y/n)");
						//	chyn=scan.next();
						}while(clCh!=4);	
					//	}while(chyn!="n");
					case 2:
					/*	System.out.println("\n Enter your Name :");
						name=scan.next();
						System.out.println("\n Enter ID :");
						custId=scan.nextInt();
						System.out.println("\n Enter contact number :");
						contact=scan.next();
						System.out.println("\n Enter address :");
						address=scan.next();
						a.add(new Customer(custId, contact, name, address)); */
						break;
						
					default:
						System.out.println("\n Please enter correct choice");
						break;
				}
				
			}while(ch3!=2);
				break;
				
			case 3:
				
				System.out.println("\n Enter your Name :");
				name=scan.next();
				System.out.println("\n Enter ID :");
				custId=scan.nextInt();
				System.out.println("\n Enter contact number :");
				contact=scan.next();
				System.out.println("\n Enter address :");
				address=scan.next();
				if(name.length()<5 || contact.length()!=10){
					try{
						throw new InvalidInputException();
				} catch (InvalidInputException e) {
						// TODO Auto-generated catch block
						System.out.println("EXCEPTION CAUGHT!  "+e.getMessage());
					}
					//System.out.println("\n Please enter correct Customer ID and CUSTOMER NAME");
				}else{
					a.add(new Customer(custId, contact, name, address));
				}
				Iterator< Customer> i = a.iterator();
				while (i.hasNext()) {
					Customer details = (Customer) i.next();
					System.out.println("Customer Details : "+details);
				}
				System.out.println("\n \n \n");
				pph.bill();
				System.out.println("\n \n \n");
				pcl.bill();
				break;
				
			case 4:
				break;
		}
	}while(ch1!=3);
	}
}