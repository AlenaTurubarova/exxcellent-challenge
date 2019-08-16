package de.exxcellent.challenge.readers;

import de.exxcellent.challenge.mappers.Mapper;

import java.util.List;

public interface Reader<T> {

    List<T> readFromFile(String filePath, Mapper<T> mapper);

}
