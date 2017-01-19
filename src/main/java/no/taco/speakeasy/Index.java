package no.taco.speakeasy;

/**
 * Created by catoda on 12.01.17.
 */
public class Index {
    private String name;
    private String intro = "Enter yer name maty, or just add it to the url";
    private String bio = "Some salty information about me and my stuff";




    /* Setters and getters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}