/**
 * Created by Paulina on 28.03.2014.
 */


import java.util.*;

public class RichClass {
    public static <E,T> Map<T, E> map (Collection<T> c, Function<T, E> f) {
        Map <T, E>mapped = new HashMap<T, E>();
        for (T element : c) {
            mapped.put(element,f.apply(element));
        }
        return mapped;
    }

    public static Map<Figure, Double> doubleArea(Collection <Figure> myCollection) {
        return map(myCollection, new Function <Figure, Double>() {
            @Override
            public Double apply(Figure element) {
                return (Double) element.getArea()*2;
            }
        });
    }
}
