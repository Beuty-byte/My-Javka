package Test;

import java.io.IOException;
import java.util.Objects;

public class Point1D {
    int x = 5;
    String str = "abc";





    public static void yet(int i) throws IOException{

            throw new IOException("It's exeption");


         //  System.out.println(i);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point1D point1D = (Point1D) o;
        return x == point1D.x &&
                Objects.equals(str, point1D.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, str);
    }
}
