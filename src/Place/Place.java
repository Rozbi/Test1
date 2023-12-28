package Place;

public abstract class Place {
    private int coordinate1;
    private int coordinate2;
    String name;
    public Place(int coordinateХ, int coordinateY, String name){
        this.coordinate1 = coordinateХ;
        this.coordinate2 = coordinateY;
        this.name = name;

    }
    public String GetPlace(){return this.name;}
    public int GetCoordinate(){
        return this.coordinate1;
    }
    public int getCoordinate2() {
        return this.coordinate2;
    }
    @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Place place = (Place) o;
            return Objects.equals(this.GetCoordinate(), this.GetCoordinate());
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.GetCoordinate());
        }
}
