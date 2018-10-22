package utils;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {

    private List<String> header = new ArrayList<String>();
    private ArrayList<List<String>> cells = new ArrayList<List<String>>();

    private int rowIndex;
    private int lineMaxValue;
    private int rowMaxValue;
    private int lineIndex;

    private File csv;

    public CSVReader(String path) {
        this.csv = new File(path);
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        int i = 0;

        try {
            fileReader = new FileReader(csv);
            bufferedReader = new BufferedReader(fileReader);
            String currentLine;


            while ((currentLine = bufferedReader.readLine()) != null) {
                List<String> lineIntoArray = lineIntoArray(currentLine);
                if(i == 0)
                    header = lineIntoArray;
                else
                    cells.add(lineIntoArray);
                i++;
            }

        } catch(IOException exception) {

            System.out.println("Erro ao ler o CSV do datapool. Verifique o arquivo.");

        } finally {
            try {

                if (bufferedReader != null)
                    bufferedReader.close();

                if (fileReader != null)
                    fileReader.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
        rowIndex = 0;
        lineIndex = 0;
        lineMaxValue = i-1;
    }

    public int getRowIndex(){
        return rowIndex;
    }

    public int getLineIndex(){
        return lineIndex;
    }

    public void nextLine(){
        if(hasNext()){
            lineIndex++;
        }
    }

    public boolean hasNext() {
        if(lineMaxValue ==0)
            return false;
        return lineIndex < lineMaxValue;
    }

    public String valueOfCell(String headerValue) {
        String cellValue = "";
        try {
            setRowIndex(positionOfHeaderValue(headerValue));
            cellValue = readFromCell(getLineIndex(),getRowIndex());

        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Valor não existe no cabeçalho do datapool");
        }
        return cellValue;
    }

    public void setRowIndex(int index){
        try {
            if (index <= rowMaxValue)
                this.rowIndex = index;
        } catch(IndexOutOfBoundsException exception){
            System.out.println("Valor maior do que o máximo de colunas do cabeçalho!");
        }
    }


    private List<String> lineIntoArray(String line) {
        List<String> lineIntoArray = Arrays.asList(line.split(";"));
        rowMaxValue = lineIntoArray.size()-1;
        return lineIntoArray;
    }



    private int positionOfHeaderValue(String headerValue) {
            int index = -1;
            try {
                for (int i = 0; i < header.size(); i++) {
                    if (header.get(i).equals(headerValue)) {
                        index = i;
                    }
                }

            }catch(IndexOutOfBoundsException exception) {
                System.out.println("Valor não existe no cabeçalho do datapool");
            }
        return index;
    }

    private String readFromCell(int line, int row){
        return cells.get(line).get(row);
    }
}
