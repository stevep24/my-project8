package gr.aueb.cf.ch16;

public class GenericSpeakSchool {
    private final ISpeakable speakable;

    public GenericSpeakSchool(ISpeakable speakable){
        this.speakable = speakable;
    }

    public void learnToSpeak(){
        speakable.speak();
    }
}
