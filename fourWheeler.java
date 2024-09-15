package hirerchical2;

class fourWheeler extends Vehical {
		String colour, model;

		public fourWheeler() {
			this.colour="blue";
			this.model="a2z";
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		@Override
		public String toString() {
			return "fourWheeler [colour=" + colour + ", model=" + model + "]";
		}
		
}

		