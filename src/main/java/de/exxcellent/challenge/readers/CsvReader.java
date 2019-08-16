package de.exxcellent.challenge.readers;

import de.exxcellent.challenge.mappers.Mapper;

import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CsvReader<T> implements Reader<T> {

    @Override
    public List<T> readFromFile(String filePath, Mapper<T> mapper) {

        List<T> resultList;
        try{
            File file = new File(Objects.requireNonNull(getClass().getClassLoader().getResource(filePath)).getFile());
            InputStream inputStream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            resultList = br.lines().skip(1)
                    .map(mapper::mapToModel)
                    .collect(Collectors.toList());

            br.close();
        } catch (Exception e) {
            //log error here
            throw new RuntimeException(e.getMessage());
        }
        return resultList;
    }
}
