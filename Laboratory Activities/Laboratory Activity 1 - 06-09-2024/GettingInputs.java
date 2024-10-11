import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
<<<<<<< Tabnine <<<<<<<
        Scanner input = new Scanner(System.in);//-
        try (Scanner input = new Scanner(System.in)) {//+
            // ... rest of the code//+
        }//+
>>>>>>> Tabnine >>>>>>>// {"conversationId":"b077682c-4512-42a6-a460-13609212fa3f","source":"instruct"}
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter the genre: ");
        String genre = input.nextLine();
        System.out.print("Enter the album: ");
        String album = input.nextLine();
        System.out.print("Enter the song title: ");
        String song = input.nextLine();
        System.out.print("Enter the artist: ");
        String artist = input.nextLine();
        System.out.println("---------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("---------------------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: \"" + song + "\"");
        System.out.println("Artist: " + artist);
        
        input.close();
    }
}

