/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws IOException {

        Path gatesFile = Path.of("/Users/juan.olmedo/Documents/CodeFellows/401/fundamentals/linter/app/src/main/resources/gates.js");
        linter(gatesFile);

    }

    public static void linter(Path filePath) throws IOException {
        Scanner scanner = new Scanner(filePath);

        ArrayList<String> characters = new ArrayList<>();
        characters.add(";");
        characters.add("}");
        characters.add("{");
        characters.add("if");
        characters.add("else");

        int lineCount = 0;

        while (scanner.hasNextLine()){
            lineCount++;
            String readLine = scanner.nextLine();

            if(readLine.isEmpty()){
                continue;
            }

                Character lastCharacter = readLine.charAt(readLine.length() - 1);

            if(!characterCheckerHelper(readLine, characters) || lastCharacter != ';'){
                System.out.println("Error in line " + lineCount + ": " + readLine);

            }

        }

    }

    private static boolean characterCheckerHelper(String line, List<String> characters){
        for (String character : characters) {
            if (line.contains(character)) {
                return true;
            }
        }
        return false;
    }


}
