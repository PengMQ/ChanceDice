import java.math.BigDecimal;
import java.math.MathContext;

public class Occurrence {
    private int frequency;
    private int numTotal;

    public Occurrence(int frequency, int totalOutcomes) {
        this.frequency = frequency;
        this.numTotal = totalOutcomes;
    }

    public double getChance() {
        return (double)frequency / numTotal;

    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Occurrence occurrence = (Occurrence) object;
        return getChance()  == occurrence.getChance();

    }
}
