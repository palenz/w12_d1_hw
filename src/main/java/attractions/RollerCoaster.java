package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster extends Attraction implements IReviewed, ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() > 12 && visitor.getHeight() > 145.0;
    }
}
