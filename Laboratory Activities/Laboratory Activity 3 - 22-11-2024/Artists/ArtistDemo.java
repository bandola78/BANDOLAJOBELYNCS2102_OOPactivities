public class ArtistDemo {
    public static void main(String[] args) {
        
        Artist artist = new Artist("Anson Seabra", 30, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Park Jihyo", 27, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Hirai Momo", 28, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Vincent Van Gogh", 37, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();
        
        Writer writer = new Writer("J. K. Rowling", 59, "Writing", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();
    }
}
