package de.exxcellent.challenge.mappers;

public abstract class AbstractCsvMapper<T> implements Mapper<T> {

    private static final String CSV_REGEX = ",";

    @Override
    public T mapToModel(String csvString) {
        String[] csvCells = csvString.split(CSV_REGEX);
        validateData(csvCells[0]);
        return map(csvCells);
    }

    abstract T map(String[] cells);

    abstract void validateData(String cellData);
}
