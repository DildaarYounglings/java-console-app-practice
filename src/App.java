import java.util.Random;
import java.util.Scanner;

import javax.management.timer.Timer;

public class App {
    static Random random = new Random();
    static String[][] gameboard = {
        
        {" ","|"," ","|"," "},
        {"-","|","-","|","-"},
        {" ","|"," ","|"," "},
        {"-","|","-","|","-"},
        {" ","|"," ","|"," "}
    };
    static String player = "player";
    public static void main(String[] args) throws Exception {
        game();
    }
    private static void game(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        if(player.equals("player")){
            displayArray(gameboard);
            System.out.println("choose the position");
            int position = Integer.parseInt(scanner.nextLine());
            setPostion(position, "x");
            displayArray(gameboard);
            setPlayer("cpu");
        }else{
            int position = random.nextInt(9)+ 1;
            setPostion(position,"o");
            displayArray(gameboard);
        }
        scanner.close();
    }
    private static void displayArray(String[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t"); // \t for tab spacing
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    private static void setPlayer(String newString){
        player = newString;
    }
    private static void setPostion(int i,String s){
        switch (i) {
            case 1:
                gameboard[0][0] = s;
                break;
            case 2:
                gameboard[0][2] = s;
                break;
            case 3:
                gameboard[0][4] = s;
                break;
            case 4:
                gameboard[2][0] = s;
                break;
            case 5:
                gameboard[2][2] = s;
                break;
            case 6:
                gameboard[2][4] = s;
                break;
            case 7:
                gameboard[4][0] = s;
                break;
            case 8:
                gameboard[4][2] = s;
                break;
            case 9:
                gameboard[4][4] = s;
                break;
            default:
                break;
        }
    }
}
