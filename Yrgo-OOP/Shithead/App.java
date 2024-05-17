import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings({ "java:S106", "java:S1871", "java:S135" })
public class App {
    private static boolean lower;
    private static int indexCurrentPlayer = 0;

    public boolean isLower() {
        return false;
    }

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        List<Card> board = new ArrayList<>();
        List<Player> players = new ArrayList<>();
        List<Player> finished = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {

            addPlayer(input, players);

            Card.makeDeck(deck);
            Collections.shuffle(deck);
            Player currentPlayer = players.get(0);

            for (Player player : players) {
                giveCardsBeginning(deck, player);
            }
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                currentPlayer(players, currentPlayer, indexCurrentPlayer);
                playing(currentPlayer, board, deck, input, players, finished);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void incrementIndexCurrentPlayer() {
        indexCurrentPlayer++;
    }

    public static void resetIndexCurrentPlayer() {
        indexCurrentPlayer = 0;
    }

    public static int currentPlayer(List<Player> players, Player player, int indexCurrentPlayer) {
        if (players.size() == 1) {
            System.out.println();
            checkIfGameIsFinished(player, players);
        }
        if (indexCurrentPlayer >= players.size() - 1) {
            resetIndexCurrentPlayer();
        } else {
            incrementIndexCurrentPlayer();
        }
        player.setCurrentPlayer(players.get(indexCurrentPlayer));
        return indexCurrentPlayer;
    }

    private static boolean checkIfPlayerFinished(Player player, List<Player> players, List<Player> finished) {
        if (player.getCurrentPlayer().getBoardDown().isEmpty() && player.getCurrentPlayer().getBoardUp().isEmpty()
                && player.getCurrentPlayer().getHand().isEmpty()) {
            players.remove(player.getCurrentPlayer());
            currentPlayer(players, player, indexCurrentPlayer);
            finished.add(player.getCurrentPlayer());
            return true;
        }
        return false;
    }

    private static void checkIfGameIsFinished(Player lastPlayer, List<Player> finished) {
        finished.add(lastPlayer.getCurrentPlayer());
        List<String> place = List.of("1st: ", "2nd: ", "3rd: ", "4th: ", "5th: ", "6th: ", "7th: ", "8th: ", "9th: ",
                "10th: ", "11th: ", "12th: ", "13th: ", "14th: ", "15th: ", "16th: ", "17th: ", "18th: ", "19th: ",
                "20th: ");
        int placement = 0;

        System.out.println("The game is finished!");
        for (Player player : finished) {
            System.out.println(place.get(placement) + player);
            placement++;
        }
        System.exit(1);

    }

    private static void addPlayer(Scanner input, List<Player> players) {
        System.out.println("What's your name?");
        var newPlayer = input.nextLine();
        Player player = new Player(newPlayer);
        players.add(player);
    }

    public static void giveCardsBeginning(List<Card> deck, Player player) {
        List<Card> hand = new ArrayList<>();
        List<Card> boardUp = new ArrayList<>();
        List<Card> boardDown = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            hand.add(deck.get(i));
            deck.remove(deck.get(i));
            boardUp.add(deck.get(i + 1));
            deck.remove(deck.get(i + 1));
            boardDown.add(deck.get(i + 2));
            deck.remove(deck.get(i + 2));
        }
        player.setHand(hand);
        player.setBoardUp(boardUp);
        player.setBoardDown(boardDown);
    }

    public static void printCards(Player player) {
        var indexOfCard = 0;
        System.out.println("Your board:");
        for (Card card : player.getCurrentPlayer().getBoardUp()) {
            System.out.printf("|%s|", card);
        }
        System.out.println("\n\nYour hand:");
        Comparator<Card> sortHand = Comparator.comparing(Card::getNumber);
        Collections.sort(player.getCurrentPlayer().getHand(), sortHand);
        for (Card card : player.getCurrentPlayer().getHand()) {
            System.out.printf("%d) %s%n", indexOfCard, card);
            indexOfCard++;
        }
        System.out.println("If you can't play enter \"p\"");
    }

    public static List<Card> playing(Player player, List<Card> board, List<Card> deck, Scanner input,
            List<Player> players, List<Player> finished) {
        if (checkIfPlayerFinished(player, players, finished)) {
            return board;
        }
        printPlayerAndBoard(board, player);
        if (player.getCurrentPlayer().getHand().isEmpty() && !player.getCurrentPlayer().getBoardDown().isEmpty()) {
            if (player.getCurrentPlayer().getBoardUp().isEmpty()) {
                playFromBoardDown(player);
                printCards(player);
                checkPlay(board, input, player);
            } else {
                playFromBoardUp(player);
                printCards(player);
                checkPlay(board, input, player);
            }
        } else {
            printCards(player);
            checkPlay(board, input, player);
            refillHand(player, deck);
        }
        return board;
    }

    public static void playFromBoardUp(Player player) {
        for (int i = 0; i < 3; i++) {
            player.getCurrentPlayer().getHand().add(player.getCurrentPlayer().getBoardUp().get(i));
        }
        player.getCurrentPlayer().getBoardUp().clear();
    }

    private static void playFromBoardDown(Player player) {
        for (int i = 0; i < 3; i++) {
            player.getCurrentPlayer().getHand().add(player.getCurrentPlayer().getBoardDown().get(i));
        }
        player.getCurrentPlayer().getBoardDown().clear();
    }

    private static void refillHand(Player player, List<Card> deck) {
        for (int i = 0; i < 1; i++) {
            if (player.getCurrentPlayer().getHand().size() < 3 && !deck.isEmpty()) {
                player.getCurrentPlayer().getHand().add(deck.get(i));
                deck.remove(deck.get(i));
            }
        }
    }

    private static void printPlayerAndBoard(List<Card> board, Player player) {
        System.out.println("Current player: " + player.getCurrentPlayer());
        System.out.println("Current board: " + board + "\n");
    }

    public static List<Card> checkPlay(List<Card> board, Scanner input, Player player) {
        while (true) {
            try {
                String answer = input.nextLine();
                var play = -1;
                if (isNumeric(answer)) {
                    int answerInt = Integer.parseInt(answer);
                    play = answerInt;
                }
                if (answer.equalsIgnoreCase("p")) {
                    player.getCurrentPlayer().getHand().addAll(board);
                    lower = false;
                    board.clear();
                    break;
                }
                if (play >= player.getCurrentPlayer().getHand().size()) {
                    System.out.println("You need to play a card from your hand!");
                    printPlayerAndBoard(board, player);
                    printCards(player);
                }
                if (board.isEmpty()) {
                    if (player.getCurrentPlayer().getHand().get(play).getNumber() == 7) {
                        board.add(0, player.getCurrentPlayer().getHand().get(play));
                        player.getCurrentPlayer().getHand().remove(play);
                        lower = true;
                        break;
                    } else {
                        board.add(0, player.getCurrentPlayer().getHand().get(play));
                        player.getCurrentPlayer().getHand().remove(play);
                        break;
                    }
                } else if (player.getCurrentPlayer().getHand().get(play).getNumber() == 2) {
                    board.add(0, player.getCurrentPlayer().getHand().get(play));
                    player.getCurrentPlayer().getHand().remove(play);
                    lower = false;
                    break;

                } else if (player.getCurrentPlayer().getHand().get(play).getNumber() == 3) {
                    if (board.isEmpty()) {
                        board.add(0, player.getCurrentPlayer().getHand().get(play));
                        player.getCurrentPlayer().getHand().remove(play);
                        break;
                    }
                    board.add(0, player.getCurrentPlayer().getHand().get(play));
                    player.getCurrentPlayer().getHand().remove(play);
                    Collections.swap(board, 0, 1);
                    break;

                } else if (player.getCurrentPlayer().getHand().get(play).getNumber() == 7) {
                    board.add(0, player.getCurrentPlayer().getHand().get(play));
                    player.getCurrentPlayer().getHand().remove(play);
                    lower = true;
                    break;

                } else if (player.getCurrentPlayer().getHand().get(play).getNumber() == 10) {
                    player.getCurrentPlayer().getHand().remove(play);
                    board.clear();
                    lower = false;
                    break;
                }

                else if (App.lower
                        && player.getCurrentPlayer().getHand().get(play).getNumber() > board.get(0).getNumber()) {
                    System.out.printf("%nYou need to play a special card or a card lower/equal to: %s%n", board.get(0));
                    printPlayerAndBoard(board, player);
                    printCards(player);
                }

                else if (!App.lower
                        && player.getCurrentPlayer().getHand().get(play).getNumber() < board.get(0).getNumber()) {
                    System.out.printf("%nYou need to play a special card or a card higher/equal to: %s%n",
                            board.get(0));
                    printPlayerAndBoard(board, player);
                    printCards(player);
                }

                else {
                    board.add(0, player.getCurrentPlayer().getHand().get(play));
                    player.getCurrentPlayer().getHand().remove(play);
                    lower = false;
                    break;
                }
            } catch (IndexOutOfBoundsException ex) {
            }
        }
        return board;
    }

    // TODO: fixa!
    public static void changeStartBoard(Player player, List<Card> board, Scanner input) {
        printPlayerAndBoard(board, player);
        printCards(player);
        System.out.println("Before we start, do you wish to change your board?(y/n)");
        var answer = input.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            var indexOfCard = 0;
            System.out.println("Your board:");
            for (Card card : player.getCurrentPlayer().getBoardUp()) {
                System.out.printf("%d %s%n", indexOfCard, card);
            }
            System.out.println("\n\nYour hand:");
            for (Card card : player.getCurrentPlayer().getHand()) {
                System.out.printf("%d %s%n", indexOfCard, card);
                indexOfCard++;
            }
        } else if (answer.equalsIgnoreCase("n")) {
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
