package Objects;

import Enums.Status;
import Place.Place;

public abstract class Person {
     private String name;
     private int force;
     private int height;
     private Place place;
     private Status stat;
     public Person(String name, Status type, int force, int height, Place place){
          this.name = name;
          this.force = force;
          this.height = height;
          this.place = place;
          this.stat = type;
     }
     public String changeStat(Person p){
          return null;
     }
      public int getForce() {
          return this.force;
     }


     public int getHeight() {
          return height;
     }

     public String getName() {
          return name;
     }
     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Person person = (Person) o;
          return force == person.force && height == person.height && Objects.equals(name, person.name) && Objects.equals(place, person.place) && stat == person.stat;
     }

     @Override
     public int hashCode() {
          return Objects.hash(name, force, height, place, stat);
     }
}
