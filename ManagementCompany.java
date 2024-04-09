import java.util.ArrayList;
public class ManagementCompany {
/* 
 * set up vars   tax id managemnet fees  management company name
 */
	private final int MAX_PROPERTY = 5;
	  private final int MAX_WIDTH = 10;
	  private final int MAX_DEPTH = 10;
	  private Property[] properties;
	  private double mgmFee;
	  private String name;
	  private String taxID;
	  private Plot plot;
	  // set up construters 
	  public ManagementCompany() {
	    this.name = "";
	    this.taxID = "";
	    this.mgmFee = 0;
	    this.plot = new Plot();
	    this.properties = new Property[MAX_PROPERTY];
	  }
	  public ManagementCompany(String name, String taxID, double mgmFee) {
	    this.name = name;
	    this.taxID = taxID;
	    this.mgmFee = mgmFee;
	    this.plot = new Plot(0,0,MAX_WIDTH, MAX_DEPTH);
	    this.properties = new Property[MAX_PROPERTY];
	  }
	  public ManagementCompany(String name, String taxID, double mgmFee, 
	      int x, int y, int width, int depth) {
	    this.name = name;
	    this.taxID = taxID;
	    this.mgmFee = mgmFee;
	    this.plot = new Plot(x,y,width,depth);
	    this.properties = new Property[MAX_PROPERTY];
	  }
	  //set up methods
	  public int addProperty(Property property) {
	    if (property == null) {
	      return -2;
	    }
	    
	    if (!plot.encompasses(property.getPlot())) {
	      return -3;
	    }
	    
	    for (int i = 0;i < properties.length;i++) {
	      if (properties[i] != null) {
	        if (properties[i].getPlot().overlaps(property.getPlot())) {
	          return -4;
	        }
	      } else {
	        properties[i]=property;
	        return i;
	      } 
	    }
	      return -1;
	  }
	  
	  public int addProperty(String propertyName, String city, double rent, String ownerName) {
	    return addProperty(new Property(propertyName, city, rent, ownerName));
	  }
	  
	  public int addProperty(String propertyName, String city, double rent, String ownerName,
	      int x, int y, int width, int depth) {
	    return addProperty(new Property(propertyName, city, rent, ownerName, x, y, width, depth));
	  }
	  
	  public double totalRent() {
	    double total = 0;
	    for (int i=0;i<properties.length;i++) {
	      if (properties[i]==null) {
	        break;
	      }
	      total += properties[i].getRentAmount();
	    }
	    return total;
	  }
	  
		public double maxRentProp() {
			double max = properties[maxRentPropertyIndex()].getRentAmount();
			return max;
		}
		
		public int maxRentPropertyIndex() {
			int index = 0;
			int temp=0;
			double highest = properties[0].getRentAmount();
			
			for(int i = 1; i < temp; i++) {
				if(properties[i].getRentAmount() > highest) {
					highest = properties[i].getRentAmount();
					index = i;
				}
			}
			
			return index;
		}
	  public double getPropertiesCount() {
		  int length=5;
		  for(Property pop:properties) {
			  if(pop==null)
				  length--;
		  }
		  return length ;
	  }
	  
	  private String displayPropertyAtIndex(int index) {
	    return properties[index].toString();
	  }
	  
	  public int getMAX_PROPERTY() {
		    return MAX_PROPERTY;
		  }

		  public Plot getPlot() {
		    return plot;
		  }

		  public String getName() {
		    return name;
		  }
		  public double getMgmFeeper() {
			  return mgmFee;
		  }
		  public String getTaxID() {
			  return taxID	;	 
			  }
		  public double getTotalRent() {
			  double total=0;
			  for(int i=0;i>properties.length;i++) {
				  total=properties[i].getRentAmount();
			  }
			  return total;
		  }
		  public boolean isMangementFeeValid() {
			  if(0<mgmFee&&mgmFee>100)
				  return true;
			  return false;
		  }
		  public boolean isPropertiesfull() {
			  for(Property pop:properties) {
				  if(pop==null)
					  return false;
			  }
			  return true;
		  }
		  public void removeLastProperty() {
			  int index=0;
			  for(Property pop:properties) {
				  if(pop!=null) {
					  index++;
				  }
					  
			  }
			  properties[index]= null;
			  
		  }
		  
//		  Property[]
//		  getProperties()
//		  Gets the properties.
		  public Property[] getProperties() {
			  return properties;
		  }


	  public String toString() {

	    String listOfProperties = "";
	    for (int i = 0; i < MAX_PROPERTY; i++) {
	      if (properties[i]==null) {
	        break;
	      } 
	      listOfProperties += properties[i] + "\n"; 
	    }
	       return "List of the properties for " + name + ", taxID: " + taxID+"\n"
	            + "______________________________________________________\n"
	            + listOfProperties +  "______________________________________________________\n"+"\n"
	            + " total management Fee: " + (totalRent() * mgmFee / 100);
	  }

	 //
	 

	  
	
}
