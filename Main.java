import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.*;
import java.util.Scanner;




public class Main {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String BLACK_BOLD = "\033[1;30m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final String WHITE_BOLD = "\033[1;37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";




    public static void cls(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


    //cmd cls
//    public static void cls(){
//        try {
//            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//        } catch (InterruptedException | IOException e) {
//            throw new RuntimeException(e);
//        }
//    }




    public static int n;
    public static String name;
    public static int time;
    public static int score = 0;
    public static int lives = 3;
    public static int step = 0;
    public static int abilityJump = 2;
    public static int abilityWallBreak = 2;
    public static int characterX = 0;
    public static int characterY = 0;
    public static int goldLocX;
    public static int goldLocY;
    public static int trapLocX;
    public static int trapLocY;
    public static int LocX;
    public static int LocY;
    public static String resLoc;
    static double begin = System.nanoTime();
    static double end = System.nanoTime();
    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\leaderboard.txt");








    //game menu
    public static void menu() throws FileNotFoundException {
        cls();
        System.out.println("\n\n\n\n\n");
        System.out.println("                                       ⣀⣤⣴⣶⣶⣶⣦⣤⣀⠀⠀                ⠀");
        System.out.println("                                    ⣠⣾⣿⣿⣿⣿⣿⣿⢿⣿⣿⣷⣄⠀             ");
        System.out.println("                                  ⢀⣾⣿⣿⣿⣿⣿⣿⣿⣅⢀⣽⣿⣿⡿⠃              ");
        System.out.println("                                  ⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁⠀                   ");
        System.out.println("                                  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠁⠀⠀⣴⣶⡄⠀⣶⣶⡄⠀⣴⣶⡄            ");
        System.out.println("                                  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣀⠀⠙⠋⠁⠀⠉⠋⠁⠀⠙⠋⠀             ");
        System.out.println("                                  ⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀                ");
        System.out.println("                                   ⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀               ");
        System.out.println("⠀                                    ⠈⠙⠿⣿⣿⣿⣿⣿⣿⣿⠿⠋                     \n");
        System.out.println("                                 \uD835\uDCE6\uD835\uDCEE\uD835\uDCF5\uD835\uDCEC\uD835\uDCF8\uD835\uDCF6\uD835\uDCEE \uD835\uDCFD\uD835\uDCF8 \uD835\uDCE3\uD835\uDCF8\uD835\uDCF6\uD835\uDCEB \uD835\uDCF8\uD835\uDCEF \uD835\uDCDC\uD835\uDCEA\uD835\uDCFC\uD835\uDCF4\n");
        System.out.println(ANSI_GREEN  + "                                       1 . S T A R T" + ANSI_RESET + "\n");
        System.out.println(ANSI_PURPLE + "                                       2 . E X I T" + ANSI_RESET + "\n");
        System.out.println(ANSI_RED + "                                       3 . L E A D E R B O A R D" + ANSI_RESET);

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num == 1){start();}
        else if (num == 2) {System.exit(404);}
        else if (num == 3) {leaderboardReader();}
    }







    //starter pack
    public static void start() throws FileNotFoundException {

        cls();

        String[][] board = new String[35][73];

        for (int i = 0; i < Map.matrix.length; i++) {
            for (int j = 0; j < Map.matrix[i].length; j++) {
                System.out.print(Map.matrix[i][j]);
            }
            System.out.println();
        }


        System.out.println("\n             E N T E R . Y O U R . U S E R N A M E  ");
        Scanner scaner = new Scanner(System.in);
        name = scaner.nextLine();


        System.out.println("\n             W H I C H . D I R E C T I O N . Y O U . W A N N A . S T A R T  ???  ( 1 / 2 / 3 / 4 )  ");
        Scanner scanner = new Scanner(System.in);
        resLoc = scanner.nextLine();
        if(resLoc.equals("1")){characterX += 1; characterY += 4;}
        else if(resLoc.equals("2")){characterX += 32; characterY += 6;}
        else if(resLoc.equals("3")){characterX += 1; characterY += 68;}
        else if(resLoc.equals("4")){characterX += 32; characterY += 64;}

        begin = System.nanoTime();

        System.out.println("\n               A R E . Y O U . R E A D Y  ???  ( yes / no)  ");
        Scanner scan = new Scanner(System.in);
        String anw = scan.nextLine();

        if(anw.equals("yes")) {
            setBoard(board);
            printBoard(board);
            movement(board);
        }
        else{
            System.exit(404);
        }
    }







     //set board
    public static void setBoard(String[][] board)
    {

        cls();



        for (int i = 0; i < 35; i++)
        {
            for (int j = 0; j < 73; j++)
            {
                if(i == characterX && j == characterY )
                {
                    board[i][j] = ("@");
                }
                else
                {
                    board[i][j] = Map.matrix[i][j];
                }
            }
        }

        randomLoc(board);
        goldLocX = LocX; goldLocY = LocY;
        board[goldLocX][goldLocY] = ("*");

        randomLoc(board);
        trapLocX = LocX; trapLocY = LocY;
        board[trapLocX][trapLocY] = ("O");

    }



    //random maker
    public static void randomLoc(String[][] board) {
        do {
            LocX = (int) (Math.random() * 34);
            LocY = (int) (Math.random() * 35)*2;
        }
        while (!board[LocX][LocY].equals(" "));
    }




    //print board
    public static void printBoard(String[][] board) {
        for ( int i = 0; i < 35; i++ ) {
            for ( int j = 0; j < 73; j++ ) {

                if (!(characterX - 3 <= i && i <= characterX + 3 && characterY - 3 <= j && j <= characterY + 3)) {
                    System.out.print(ANSI_RED + "?" + ANSI_RESET);

                } else if (board[i][j].equals(("@"))) {
                    System.out.print(ANSI_GREEN + board[i][j] + ANSI_RESET);

                } else if (board[i][j].equals(("#"))) {
                    System.out.print(ANSI_BLUE + board[i][j] + ANSI_RESET);

                }else if (board[i][j].equals(("*"))) {
                    System.out.print(ANSI_YELLOW + board[i][j] + ANSI_RESET);

                }else if (board[i][j].equals(("O"))) {
                    System.out.print(ANSI_CYAN + board[i][j] + ANSI_RESET);

                }else if (board[i][j].equals(("."))) {
                    System.out.print(ANSI_WHITE_BACKGROUND + board[i][j] + ANSI_RESET);

                } else if (board[i][j].equals((" "))) {
                    System.out.print(board[i][j] + ANSI_RESET);
                }

                //System.out.print(" ");
            }

            System.out.println();
        }
    }





    //trap respawner
    public static void respawner(){
        if(resLoc.equals("1")){characterX = 1; characterY = 4;}
        else if(resLoc.equals("2")){characterX = 32; characterY = 6;}
        else if(resLoc.equals("3")){characterX = 1; characterY = 68;}
        else if(resLoc.equals("4")){characterX = 32; characterY = 64;}
    }






    //moving method
    public static void movement(String board[][]) throws FileNotFoundException {
        Scanner scanner  = new Scanner(System.in);


        while(true)
        {

            String xx = scanner.nextLine();

            if(xx.length() > 0) {
             char x = xx.charAt(0);
                switch (x) {


                    case 'w': {

                        if(characterX-1 < 0){
                            System.out.println("                         Out Of Range");
                            break;
                        }

                        cls();

                        if (board[characterX - 1][characterY].equals("#")) {
                            System.out.println("                         S h i a a a t...");
                            lives = lives - 1;
                            break;

                        } else if (board[characterX - 1][characterY].equals("*")) {
                            score = score + 100;
                            break;

                        } else if (board[characterX - 1][characterY].equals("O")) {
                            System.out.println("                         S h i a a a t...");
                            lives = lives - 1;
                            respawner();
                            break;

                        } else {
                            System.out.println("Moving => Up");

                            board[characterX][characterY] = (".");
                            characterX = characterX - 1;
                            board[characterX][characterY] = ("@");
                            step++;

                        }

                        break;
                    }


                    case 's': {

                        if(characterX+1 > 34){
                            System.out.println("                         Out Of Range");
                            break;
                        }

                        cls();

                        if (board[characterX + 1][characterY].equals("#")) {
                            System.out.println("                         S h i a a a t...");
                            lives = lives - 1;
                            break;

                        } else if (board[characterX + 1][characterY].equals("*")) {
                            score = score + 100;
                            break;

                        } else if (board[characterX + 1][characterY].equals("O")) {
                            System.out.println("                         S h i a a a t...");
                            lives = lives - 1;
                            respawner();
                            break;

                        } else {
                            System.out.println("Moving => Down");

                            board[characterX][characterY] = (".");
                            characterX = characterX + 1;
                            board[characterX][characterY] = ("@");
                            step++;

                        }

                        break;
                    }


                    case 'a': {

                        if(characterY-2 < 0){
                            System.out.println("                         Out Of Range");
                            break;
                        }

                        cls();

                        if (board[characterX][characterY - 2].equals("#")) {
                            System.out.println("                         S h i a a a t...");
                            lives = lives - 1;
                            break;

                        } else if (board[characterX][characterY - 2].equals("*")) {
                            score = score + 100;
                            break;

                        } else if (board[characterX][characterY - 2].equals("O")) {
                            System.out.println("                         S h i a a a t...");
                            lives = lives - 1;
                            respawner();
                            break;

                        } else {
                            System.out.println("Moving Left");

                            board[characterX][characterY] = (".");
                            characterY = characterY - 2;
                            board[characterX][characterY] = ("@");
                            step++;
                        }

                        break;
                    }


                    case 'd': {

                        if(characterY+2 > 73){
                            System.out.println("                         Out Of Range");
                            break;
                        }

                        cls();

                        if (board[characterX][characterY + 2].equals("#")) {
                            System.out.println("                         S h i a a a t...");
                            lives = lives - 1;
                            break;

                        } else if (board[characterX][characterY + 2].equals("*")) {
                            score = score + 100;
                            break;

                        } else if (board[characterX][characterY + 2].equals("O")) {
                            System.out.println("                         S h i a a a t...");
                            lives = lives - 1;
                            respawner();
                            break;

                        } else {
                            System.out.println("Moving Right");

                            board[characterX][characterY] = (".");
                            characterY = characterY + 2;
                            board[characterX][characterY] = ("@");
                            step++;
                        }

                        break;
                    }


                    case 'j': {
                        if (abilityJump > 0) {

                            System.out.println("\n               WHICH DIRECTION YOU WANNA JUMP ? ( w / s / d / a ) ");
                            Scanner scan = new Scanner(System.in);
                            String anw = scan.nextLine();

                            switch (anw) {
                                case "w": {
                                    if (characterX - 2 < 0) {
                                        System.out.println("                         Out Of Range");
                                        printBoard(board);
                                        endChecker(board);
                                        movement(board);
                                        break;
                                    }else {
                                        superMoveUp(board);
                                        break;
                                    }
                                }

                                case "s": {
                                    if (characterX + 2 > 34) {
                                        System.out.println("                         Out Of Range");
                                        printBoard(board);
                                        endChecker(board);
                                        movement(board);
                                        break;
                                    } else {
                                        superMoveDown(board);
                                        break;
                                    }
                                }

                                case "d": {
                                    if (characterY + 4 > 73) {
                                        System.out.println("                         Out Of Range");
                                        printBoard(board);
                                        endChecker(board);
                                        movement(board);
                                        break;
                                    } else {
                                        superMoveRight(board);
                                        break;
                                    }
                                }

                                case "a": {
                                    if (characterY - 4 < 0) {
                                        System.out.println("                         Out Of Range");
                                        printBoard(board);
                                        endChecker(board);
                                        movement(board);
                                        break;
                                    } else {
                                        superMoveLeft(board);
                                        break;
                                    }
                                }

                                default: {
                                    cls();
                                }
                                break;
                            }
                        } else {
                            cls();
                            System.out.println("\n               Y O U  D O N T  H A V E  E N O U G H  J.A B I L I T Y  P O I N T    ");
                            break;
                        }
                    }


                    case 'g': {
                        if (abilityWallBreak > 0) {

                            System.out.println("\n               WHICH DIRECTION YOU WANNA BREAK THE WALL ? ( w / s / d / a ) ");
                            Scanner scan = new Scanner(System.in);
                            String anw2 = scan.nextLine();

                            switch (anw2) {
                                case "w": {
                                    if (characterX - 1 < 0) {
                                        System.out.println("                         Out Of Range");
                                        break;
                                    } else {
                                        wallBreakUp(board);
                                        break;
                                    }
                                }
                                case "s": {
                                    if (characterX + 1 > 34) {
                                        System.out.println("                         Out Of Range");
                                        break;
                                    } else {
                                        wallBreakDown(board);
                                        break;
                                    }
                                }
                                case "d": {
                                    if (characterY - 2 < 0) {
                                        System.out.println("                         Out Of Range");
                                        break;
                                    } else {
                                        wallBreakRight(board);
                                        break;
                                    }
                                }
                                case "a": {
                                    if (characterY + 2 > 73) {
                                        System.out.println("                         Out Of Range");
                                        break;
                                    } else {
                                        wallBreakLeft(board);
                                        break;
                                    }
                                }
                                default: {
                                   cls();
                                }
                            }
                        } else {
                            cls();
                            System.out.println("\n               Y O U  D O N T  H A V E  E N O U G H  W.A B I L I T Y  P O I N T    ");
                            break;
                        }
                    }


                    default:
                        cls();

                }

                printBoard(board);
                endChecker(board);
            }

            else {
                cls();
                System.out.println(" ");
                System.out.print(ANSI_GREEN_BACKGROUND + "                                                              " + ANSI_RESET);
                System.out.print(" W r o n g  C o m m a n d ");
                System.out.println(ANSI_GREEN_BACKGROUND + "                                                              " + ANSI_RESET);
                printBoard(board);
                endChecker(board);
            }
        }
    }





    //jump and wall breaking ability methods
    public static void superMoveUp(String[][] board) throws FileNotFoundException {



        if (board[characterX - 2][characterY].equals("#")) {
            System.out.println("                         S h i a a a t...");
            lives = lives - 1;
            printBoard(board);
            endChecker(board);
            movement(board);

        } else if (board[characterX - 2][characterY].equals("*")) {
            score = score + 100;

        } else if (board[characterX - 2][characterY].equals("O")) {
            System.out.println("                         S h i a a a t...");
            lives = lives - 1;
            respawner();

        } else {
            System.out.println("S-u-p-e-r M-o-v-i-n-g U-p");
            abilityJump--;
            board[characterX][characterY] = (".");
            board[characterX-1][characterY] = (".");
                step++;


            characterX = characterX - 2;
            board[characterX][characterY] = ("@");
            printBoard(board);
            endChecker(board);
            movement(board);


        }
    }
    public static void superMoveDown(String[][] board) throws FileNotFoundException {

        cls();

        if (board[characterX + 2][characterY].equals("#")) {
            System.out.println("                         S h i a a a t...");
            lives = lives - 1;
            printBoard(board);
            endChecker(board);
            movement(board);

        }  else if (board[characterX + 2][characterY].equals("*")) {
            score = score + 100;

        }else if (board[characterX + 2][characterY].equals("O")) {
            System.out.println("                         S h i a a a t...");
            lives = lives - 1;
            respawner();

        } else {
            System.out.println("S-u-p-e-r M-o-v-i-n-g D-o-w-n");
            abilityJump--;
            board[characterX][characterY] = (".");
            board[characterX+1][characterY] = (".");
                step++;


            characterX = characterX + 2;
            board[characterX][characterY] = ("@");
            printBoard(board);
            endChecker(board);
            movement(board);
        }

    }
    public static void superMoveLeft(String[][] board) throws FileNotFoundException {

        cls();

        if (board[characterX][characterY - 4].equals("#")) {
            System.out.println("                         S h i a a a t...");
            lives = lives - 1;
            printBoard(board);
            endChecker(board);
            movement(board);

        } else if (board[characterX][characterY - 4].equals("*")) {
            score = score + 100;

        }else if (board[characterX][characterY - 4].equals("O")) {
            System.out.println("                         S h i a a a t...");
            lives = lives - 1;
            respawner();

        } else {
            System.out.println("S-u-p-e-r M-o-v-i-n-g L-e-f-t");
            abilityJump--;
            board[characterX][characterY] = (".");
            board[characterX][characterY-2] = (".");
                step++;


            characterY = characterY - 4;
            board[characterX][characterY] = ("@");
            printBoard(board);
            endChecker(board);
            movement(board);

        }
    }
    public static void superMoveRight(String[][] board) throws FileNotFoundException {

       cls();

        if (board[characterX][characterY + 4].equals("#")) {
            System.out.println("                         S h i a a a t...");
            lives = lives - 1;
            printBoard(board);
            endChecker(board);
            movement(board);

        } else if (board[characterX][characterY + 4].equals("*")) {
            score = score + 100;

        }else if (board[characterX][characterY + 4].equals("O")) {
            System.out.println("                         S h i a a a t...");
            lives = lives - 1;
            respawner();

        } else {
            System.out.println("S-u-p-e-r M-o-v-i-n-g R-i-g-h-t");
            abilityJump--;
            board[characterX][characterY] = (".");
            board[characterX][characterY+2] = (".");
                step++;


            characterY = characterY + 4;
            board[characterX][characterY] = ("@");
            printBoard(board);
            endChecker(board);
            movement(board);
        }
    }
    public static void wallBreakUp(String[][] board){

        cls();

        if (board[characterX - 1][characterY].equals("#")) {

            System.out.println("W-a-l-l B-r-e-a-k U-p");
            board[characterX - 1][characterY].replaceAll("#"," ");
            board[characterX][characterY] = (".");
            characterX = characterX - 1;
            board[characterX][characterY] = ("@");
            step++;
            abilityWallBreak--;


        } else if (!board[characterX - 1][characterY].equals("#")) {
            System.out.println("                         S h i a a a t... T h e r e  I s  N o  W a l l  U p  T h e r e...");
        }

    }
    public static void wallBreakDown(String[][] board){

        cls();

        if (board[characterX + 1][characterY].equals("#")) {

            System.out.println("W-a-l-l B-r-e-a-k D-o-w-n");
            board[characterX + 1][characterY].replaceAll("#"," ");
            board[characterX][characterY] = (".");
            characterX = characterX + 1;
            board[characterX][characterY] = ("@");
            step++;
            abilityWallBreak--;


        } else if (!board[characterX][characterY - 2].equals("#")) {
            System.out.println("                         S h i a a a t... T h e r e  I s  N o  W a l l  D o w n  T h e r e...");
        }
    }
    public static void wallBreakRight(String[][] board){

        cls();

        if (board[characterX][characterY + 2].equals("#")) {

            System.out.println("W-a-l-l B-r-e-a-k R-i-g-h-t");
            board[characterX][characterY + 2].replaceAll("#"," ");
            board[characterX][characterY] = (".");
            characterY = characterY + 2;
            board[characterX][characterY] = ("@");
            step++;
            abilityWallBreak--;

        } else if (!board[characterX][characterY - 2].equals("#")) {
            System.out.println("                         S h i a a a t... T h e r e  I s  N o  W a l l  R i g h t  T h e r e...");
        }
    }
    public static void wallBreakLeft(String[][] board){

        cls();

        if (board[characterX][characterY - 2].equals("#")) {

            System.out.println("W-a-l-l B-r-e-a-k L-e-f-t");
            board[characterX][characterY - 2].replaceAll("#"," ");
            board[characterX][characterY] = (".");
            characterY = characterY - 2;
            board[characterX][characterY] = ("@");
            step++;
            abilityWallBreak--;

        } else if (!board[characterX][characterY - 2].equals("#")) {
            System.out.println("                         S h i a a a t... T h e r e  I s  N o  W a l l  L e f t  T h e r e...");
        }
    }







    //end checker
    public static void endChecker(String[][] board) throws FileNotFoundException {
        if(lives == 0)
        {

           cls();

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }



            end = System.nanoTime();
            time = (int)((end - begin)/1000000000);


            System.out.println("\n\n");

            System.out.print(ANSI_GREEN_BACKGROUND + "                                                              " + ANSI_RESET);
            System.out.print("  G A M E  O V E R" + ANSI_RESET + "  ");
            System.out.print(ANSI_BLUE_BACKGROUND + "                                                               " + ANSI_RESET);

            System.out.println("\n\n");

            System.out.print(ANSI_RED_BACKGROUND + "                                                             " + ANSI_RESET);
            System.out.print("  S C O R E ====>>> " + score + "  ");
            System.out.print(ANSI_PURPLE_BACKGROUND + "                                                             " + ANSI_RESET);

            System.out.println("\n\n");

            System.out.print(ANSI_BLUE_BACKGROUND + "                                                             " + ANSI_RESET);
            System.out.print("  S T E P S  ====>>> " + step + "  ");
            System.out.print(ANSI_RED_BACKGROUND + "                                                             " + ANSI_RESET);

            System.out.println("\n\n");

            System.out.print(ANSI_GREEN_BACKGROUND + "                                                             " + ANSI_RESET);
            System.out.print("  T I M E  ====>>> " + time + "s  ");
            System.out.print(ANSI_PURPLE_BACKGROUND + "                                                             " + ANSI_RESET);

            System.out.println("\n\n");

            leaderboard();

            System.out.println("                                                         |OOO|                     |OOO|             ");
            System.out.println("                                                         OOOOO         [|]         OOOOO             ");
            System.out.println("                                                         |OOO|         [|]         |OOO|             ");
            System.out.println("                                                     O ____________________________________ O       ");
            System.out.println("                                                       O \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/ O         ");
            System.out.println("                                                         O ---------------------------- O           ");
            System.out.println("                                                           O |||||||||||||||||||||||| O             ");
            System.out.println("                                                             O \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/ O               ");
            System.out.println("                                                               O _______________ O                 ");
            System.out.println("                                                                                               ");
            System.out.println("                                                                                               ");
            System.out.print(ANSI_YELLOW_BACKGROUND + "                                                    " + ANSI_RESET);
            System.out.print("S E E  Y O U  N E X T  T I M E  L O S E R");
            System.out.print(ANSI_YELLOW_BACKGROUND + "                                                     " + ANSI_RESET);
            System.out.println("\n\n");

            Scanner scan = new Scanner(System.in);
            System.out.println("\n  0 . Back To Menu");
            String men = scan.nextLine();
            if(men.equals("0")){cls(); menu();}
            else{System.exit(404);}
        }




        else if(score == 100)
        {

            cls();

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }


            end = System.nanoTime();
            time = (int)((end - begin)/1000000000);


            System.out.println("\n\n");

            System.out.print(ANSI_GREEN_BACKGROUND + "                                                               " + ANSI_RESET);
            System.out.print("  C O N G R A T S" + ANSI_RESET + "  ");
            System.out.print(ANSI_BLUE_BACKGROUND + "                                                                " + ANSI_RESET);

            System.out.println("\n\n");

            System.out.print(ANSI_RED_BACKGROUND + "                                                             " + ANSI_RESET);
            System.out.print("  S C O R E ====>>> " + score + "  ");
            System.out.print(ANSI_PURPLE_BACKGROUND + "                                                             " + ANSI_RESET);

            System.out.println("\n\n");

            System.out.print(ANSI_BLUE_BACKGROUND + "                                                             " + ANSI_RESET);
            System.out.print("  S T E P S  ====>>> " + step + "  ");
            System.out.print(ANSI_RED_BACKGROUND + "                                                             " + ANSI_RESET);

            System.out.println("\n\n");

            System.out.print(ANSI_GREEN_BACKGROUND + "                                                             " + ANSI_RESET);
            System.out.print("  T I M E  ====>>> " + time + "s  ");
            System.out.print(ANSI_PURPLE_BACKGROUND + "                                                             " + ANSI_RESET);

            System.out.println("\n\n");

            leaderboard();

            System.out.println("                                                       --------                  --------            ");
            System.out.println("                                                         |OOO|                     |OOO|             ");
            System.out.println("                                                         OOOOO         [|]         OOOOO             ");
            System.out.println("                                                         |OOO|         [|]         |OOO|             ");
            System.out.println("                                                     O ____________________________________ O       ");
            System.out.println("                                                       O \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/ O         ");
            System.out.println("                                                         O ---------------------------- O           ");
            System.out.println("                                                           O |||||||||||||||||||||||| O             ");
            System.out.println("                                                             O \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/ O               ");
            System.out.println("                                                               O _______________ O                 ");
            System.out.println("                                                                                               ");
            System.out.println("                                                                                               ");
            System.out.print(ANSI_YELLOW_BACKGROUND + "                                                  " + ANSI_RESET);
            System.out.print("G O O D  J O B  C H A M P  S E E  Y O U  S O O N");
            System.out.print(ANSI_YELLOW_BACKGROUND + "                                                   " + ANSI_RESET);
            System.out.println("\n\n");

            Scanner scan = new Scanner(System.in);
            System.out.println("\n  0 . Back To Menu");
            String men = scan.nextLine();
            if(men.equals("0")){cls(); menu();}
            else{System.exit(404);}
        }




        else
        {
            System.out.println(" ");
            System.out.print(ANSI_RED_BACKGROUND + "                                                         " + ANSI_RESET);
            System.out.print("   WB . A B I L I T Y  ==>  " + abilityWallBreak + "   ");
            System.out.println(ANSI_RED_BACKGROUND + "                                                          " + ANSI_RESET);
            System.out.print(ANSI_BLUE_BACKGROUND + "                                                         " + ANSI_RESET);
            System.out.print("   J . A B I L I T Y  ==>  " + abilityJump + "   ");
            System.out.println(ANSI_BLUE_BACKGROUND + "                                                          " + ANSI_RESET);
            System.out.print(ANSI_CYAN_BACKGROUND + "                                                            " + ANSI_RESET);
            System.out.print("   ♡L I V E S  ==>  " + lives + "   ");
            System.out.println(ANSI_CYAN_BACKGROUND + "                                                             " + ANSI_RESET);

        }
    }






    //writing the file
    public static void leaderboard() {
        String sect = "NAME" + " | " + "STEPS" +  " | " + "TIME" + " | " + "SCORE";
        String inputString = "\n" + name + "  |  " + step + "  |  " + time + "  |  " + score;
        try {
            FileWriter writer = new FileWriter(file, true);
            if (!file.exists()) {
                file.createNewFile();
                writer.write(sect);
            }
            //writer.write(sect);
            writer.write(inputString);
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //reading the file
    public static void leaderboardReader() throws FileNotFoundException {
        cls();
       Scanner read = new Scanner(file);
       while (read.hasNextLine()){
           String data = read.nextLine();
           System.out.println(data);
       }
       read.close();


        Scanner scan = new Scanner(System.in);
       System.out.println("\n  0 . Back To Menu");
       String men = scan.nextLine();
       if(men.equals("0")){cls(); menu();}
       else{System.exit(404);}

    }



    public static void main(String[] args) throws FileNotFoundException {

        menu();

    }




}