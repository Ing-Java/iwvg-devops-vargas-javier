package es.upm.miw.iwvg.devops.code;

import java.util.stream.Stream;

public class DecimalFunctionalStream {

    public long size(Stream<Double> stream) {
        return stream
                .count();
    }

    public double sumEvenValues(Stream<Double> stream) {
        return this.sum(
                stream.filter(value -> 0 == value % 2)
        );
    }

    public double sum(Stream<Double> stream) {
        return stream
                .reduce(Double::sum)
                .orElse(Double.NaN);  // Optional;
    }

    public double max(Stream<Double> stream) {
        return stream
                .max(Double::compareTo)
                .orElse(Double.NaN);  // Optional;
    }

}
