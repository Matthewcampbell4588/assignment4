
public class Property {
	
	/*
	 * set up vars name city ,rent owner
	 */private String name;
		private String city;
		private double rent;
		private String owner;
		private Plot plot;
		
		
		/*
		 * Property() Creates a new Property using empty strings.
			Property(String propertyName, String city, double rentAmount, String owner)
			Creates a new Property object using given values.
			Property(String propertyName, String city, double rentAmount, 
			String owner, int x, int y, int width, int depth)
			Creates a new Property object using given values.
			Property(Property otherProperty) Creates a new copy of the given property object.
			
		 */
		public Property() {
			this.name = "";
			this.city = "";
			rent = 0;
			owner = "";
			this.plot = new Plot();
		}
		
		public Property(Property property) {
			this.name = property.getPropertyName();
			city = property.getCity();
			rent = property.getRentAmount();
			owner = property.getOwner();
			this.plot = new Plot(property.getPlot());
		}
		
		public Property(String name, String city, double rent, String owner) {
			this.name = name;
			this.city = city;
			this.rent = rent;
			this.owner = owner;
			this.plot = new Plot();
		}
		
		public Property(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
			this.name = name;
			this.city = city;
			this.rent = rent;
			this.owner = owner;
			plot = new Plot(x, y, width, depth);
		}
	
	// set up getters and setters
		public Plot getPlot() {
			return plot;
		}
		public String getCity() {
			return city;
		}
		public String getPropertyName() {
			return name;
		}
		
		public void setPropertyName(String name) {
			this.name = name;
		}
		public double getRentAmount() {
			return rent;
		}
		public String getOwner() {
			return owner;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		public void setRentAmount(double rent) {
			this.rent = rent;
		}
		
		public void setOwner(String owner) {
			this.owner = owner;
		}
	
		public void setPlot(int x, int y, int width, int depth) {
			plot = new Plot(x, y, width, depth);
		}
		public String toString() {
			return name+","+city+","+ owner+","+rent;
		}
	
}
