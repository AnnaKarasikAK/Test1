package lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class Game {
    public static void main(String[] args) {
        writeNumOfPlayersPerTeam(GameType.SOCCER);
    }

    public static final String numberOfPlayersSOCCER = "11";
    public static final String numberOfPlayersHOCKEY = "6";
    public static final String numberOfPlayersRUGBY = "15";
    public static final String fileNameSOCCER = "Soccer";
    public static final String fileNameHOCKEY = "Hockey";
    public static final String fileNameRUGBY = "Rugby";


    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        try {
            switch (game) {
                case SOCCER:
                    newFile(fileNameSOCCER);
                    writeToFile(fileNameSOCCER, numberOfPlayersSOCCER);
                    break;
                case HOCKEY:
                    newFile(fileNameHOCKEY);
                    writeToFile(fileNameHOCKEY, numberOfPlayersHOCKEY);
                    break;
                case RUGBY:
                    newFile(fileNameRUGBY);
                    writeToFile(fileNameRUGBY, numberOfPlayersRUGBY);
                    break;
                default:
                    System.out.println("Unknown game type was typed in");
            }
        } catch (Exception er) {
            System.out.println("Something bad happened");
            throw er;
        }
    }

    public static void newFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error, cannot write...");
            throw new RuntimeException(e);
        }
    }

}
