package belajar;

public class Film {
    private String idFilm;
    private String judul;
    private String genre;
    
    public Film(String idFilm, String judul, String genre){
        this.idFilm = idFilm;
        this.judul = judul;
        this.genre = genre;

    }
    public String getIdFilm(){
        return idFilm;
    }

    public void setIdFilm(){
        this.idFilm = idFilm;
    }

    public String getJudul(){
        return judul;
    }

    public void setJudul(){
        this.judul = judul;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(){
        this.genre = genre;
    }

    public String getInfo(){
      return "ID Film: " + this.idFilm +
            ", Judul: " + this.judul +
            ", Genre: " + this.genre;
        
    }
}
