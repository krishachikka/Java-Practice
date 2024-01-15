class InfyTV {
    private String photographer;
    private String newsReporter;
    private String correspondent;

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getNewsReporter() {
        return newsReporter;
    }

    public void setNewsReporter(String newsReporter) {
        this.newsReporter = newsReporter;
    }

    public String getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    void documentaryFilm() {
        System.out.println(
                "After hundred years ago there were 100,000 tigers in the world. Today there are as few as 3,200. Why are tigers disappearing?.....");
        System.out.println("by Correspondent : " + getCorrespondent());
        System.out.println("Photographer : " + getPhotographer());
        System.out.println("News Reporter : " + getNewsReporter());
    }
}

public class Encap {
    public static void main(String[] args) {
        InfyTV i = new InfyTV();
        i.setCorrespondent("Kimberely");
        i.setPhotographer("Joshua");
        i.setNewsReporter("Hudson");
        i.documentaryFilm();
    }
}

// OUTPUT
// After hundred years ago there were 100,000 tigers in the world. Today there are as few as 3,200. Why are tigers disappearing?.....
// by Correspondent : Kimberely
// Photographer : Joshua
// News Reporter : Hudson