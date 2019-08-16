package de.exxcellent.challenge.operations;

import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;

public class Operations {

    public static <T> int findMinParameterValue(List<T> modelObjects, ToIntFunction<? super T> getParameterValue) {
        return modelObjects.stream().mapToInt(getParameterValue).min().orElse(0);
    }
    
    public static <T> Optional<T> findObjectWithMinParameterValue(List<T> modelObjects, ToIntFunction<? super T> getParameterValue) {
        int value = findMinParameterValue(modelObjects, getParameterValue);
        return modelObjects.stream()
                .filter(t -> getParameterValue.applyAsInt(t)==value)
                .findFirst();
    }
}
