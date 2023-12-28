package Place;

import java.util.Objects;

public class Home extends Place {
    public Home(int coordinateХ, int coordinateY, String name) {
        super(coordinateХ, coordinateY, name);
    }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Home home = (Home) o;
            return Objects.equals(this.GetCoordinate(), this.GetCoordinate());
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.GetCoordinate());
        }

}



