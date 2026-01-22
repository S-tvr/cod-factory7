package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        ISpeakable cat = new Cat("Alice");
        ISpeakable dog = new Dog("Bob");

        SpeakingSchool speakingSchoolCat = new SpeakingSchool();

        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(cat);
        GenericSpeakingSchool genericSpeakingSchool2 = new GenericSpeakingSchool(dog);

        Dog dog1 = new Dog();
//        cat.speak();
//        dog.speak();
//
//        doSpeak(cat);
//        doSpeak(dog
//        );

        speakingSchoolCat.learnToSpeak();


        genericSpeakingSchool1.learnToSpeak();
        genericSpeakingSchool2.learnToSpeak();
    }

    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
